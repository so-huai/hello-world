package ${serviceImplPackage};

import ${modelPackage}.${modelNameUpperCamel};
import ${daoPackage}.${modelNameUpperCamel}Mapper;
import ${servicePackage}.${modelNameUpperCamel}Service;
import ${pageClassPath};

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 * Created by ${author} on ${date}.
 */
@Service
public class ${modelNameUpperCamel}ServiceImpl implements ${modelNameUpperCamel}Service{

	@Autowired
    private ${modelNameUpperCamel}Mapper ${modelNameLowerCamel}Mapper;

<#list serviceMethodsList as serviceMethod>
    ${serviceMethod!''}
</#list>
}
