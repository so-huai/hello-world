package com.codegen.service;

/**
 * 配置信息变量
 * Created by zhh on 2017/09/27.
 */
public class CodeGeneratorConfig {
	// JDBC 相关配置信息
	protected static String JDBC_URL;
	protected static String JDBC_USERNAME;
	protected static String JDBC_PASSWORD;
	protected static String JDBC_DRIVER_CLASS_NAME;
	
	// 项目在硬盘上的基础路径
	protected static final String PROJECT_PATH = System.getProperty("user.dir");
	// java文件路径
	protected static String JAVA_PATH;
	// 资源文件路径
	protected static String RESOURCES_PATH;
	// 模板存放位置
	protected static String TEMPLATE_FILE_PATH;
	
	// 项目 Model 所在包
	protected static String MODEL_PACKAGE;
	// 项目 DAO 所在包
	protected static String DAO_PACKAGE;
	// 项目 Mapper 所在包
	protected static String MAPPER_PACKAGE;
	// 项目 Service 所在包
	protected static String SERVICE_PACKAGE;
	// 项目 ServiceImpl 所在包
	protected static String SERVICEIMPL_PACKAGE;
	// 项目 Controller 所在包
	protected static String CONTROLLER_PACKAGE;
	
	// 生成的 Service 存放路径
	protected static String PACKAGE_PATH_SERVICE;
	// 生成的 ServiceImpl 存放路径
	protected static String PACKAGE_PATH_SERVICEIMPL;
	// 生成的 Controller 存放路径
	protected static String PACKAGE_PATH_CONTROLLER;
	// 生成的 Mapper 存放路径
	protected static String PACKAGE_PATH_MAPPER;
	// 生成的 Dao 存放路径
	protected static String PACKAGE_PATH_DAO;
	
	// 模板注释中 @author
	protected static String AUTHOR;
	// 模板注释中 @date
	protected static String DATE;
	
}
