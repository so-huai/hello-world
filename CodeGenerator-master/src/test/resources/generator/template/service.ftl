package ${servicePackage};

import ${modelPackage}.${modelNameUpperCamel};

import java.util.List;
import java.util.Map;

/**
 *
 * Created by ${author} on ${date}.
 */

public interface ${modelNameUpperCamel}Service{
	<#list serviceMethodsList as serviceMethod>
        ${serviceMethod!''}
	</#list>
}
