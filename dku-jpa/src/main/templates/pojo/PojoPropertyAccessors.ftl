<#-- // Property accessors -->
<#foreach property in pojo.getAllPropertiesIterator()>
<#if pojo.getMetaAttribAsBool(property, "gen-property", true)>
<#if pojo.hasFieldJavaDoc(property)>    
    /**       
     * ${pojo.getFieldJavaDoc(property, 4)}
     */
</#if>
    <#include "GetPropertyAnnotation.ftl"/>
    ${pojo.getPropertyGetModifiers(property)} <#if pojo.getJavaTypeName(property, jdk5).endsWith("Date") || pojo.getJavaTypeName(property, jdk5).endsWith("Timestamp")>${pojo.importType("java.util.Date")}<#else>${pojo.getJavaTypeName(property, jdk5)}</#if> ${pojo.getGetterSignature(property)}() {
        return this.${property.name};
    }
    
    ${pojo.getPropertySetModifiers(property)} void set${pojo.getPropertyName(property)}(<#if pojo.getJavaTypeName(property, jdk5).endsWith("Date") || pojo.getJavaTypeName(property, jdk5).endsWith("Timestamp")>${pojo.importType("java.util.Date")}<#else>${pojo.getJavaTypeName(property, jdk5)}</#if> ${property.name}) {
        this.${property.name} = ${property.name};
    }
</#if>
</#foreach>
