<#-- // Field Names -->

<#foreach field in pojo.getAllPropertiesIterator()><#if pojo.getMetaAttribAsBool(field, "gen-property", true)>
    public static final String P_${field.name.toUpperCase()} = "${field.name}";
</#if>
</#foreach>
