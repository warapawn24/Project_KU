<#if ejb3>
<#if pojo.hasIdentifierProperty()>
<#if property.equals(clazz.identifierProperty)>
${pojo.generateAnnIdGenerator()}
    @${pojo.importType("javax.persistence.GeneratedValue")}(strategy=${pojo.importType("javax.persistence.GenerationType")}.IDENTITY)
<#-- if this is the id property (getter)-->
<#-- explicitly set the column name for this property-->
</#if>
</#if>
<#if c2h.isManyToOne(property)>
<#--TODO support @OneToOne true and false-->

    ${pojo.generateManyToOneAnnotation(property)}
<#--TODO support optional and targetEntity-->
${pojo.generateJoinColumnsAnnotation(property, cfg)}
<#elseif c2h.isCollection(property)>
${pojo.generateCollectionAnnotation(property, cfg)}
<#else>
${pojo.generateBasicAnnotation(property)}
${pojo.generateAnnColumnAnnotation(property)}
</#if>
<#if property.name.startsWith("encrypted")>
    @${pojo.importType("org.hibernate.annotations.Type")}(type="encryptedString")
</#if>
<#if !property.name.equals("recordCreatedDate") && !property.name.equals("recordUpdatedDate") && property.name.endsWith("Date")>
    @${pojo.importType("org.springframework.format.annotation.DateTimeFormat")}(pattern="dd/MM/yyyy")
</#if>
<#if property.name.endsWith("DateTime")>
    @${pojo.importType("org.springframework.format.annotation.DateTimeFormat")}(pattern="dd/MM/yyyy HH:mm:ss")
</#if>
<#if property.name.equals("recordCreatedDate") || property.name.equals("recordUpdatedDate")>
    @${pojo.importType("org.springframework.format.annotation.DateTimeFormat")}(pattern="dd/MM/yyyy HH:mm:ss.SSS")
</#if>
</#if>
