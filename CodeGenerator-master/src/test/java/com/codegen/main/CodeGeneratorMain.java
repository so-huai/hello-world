package com.codegen.main;

import com.codegen.service.CodeGeneratorManager;

/**
 * 代码生成器启动项 <br>
 * Created by zhh at 2017/09/20.
 * Modified by fenglibin@gmail.com at 2018/10/24
 */
public class CodeGeneratorMain {

    /**
     * table name support singer string table name with or without underline such "table","my_table" etc.<br>
     * other style not tested
     */
    private static final String TABLE1 = "ast_agent_assets";
    private static final String TABLE2 = "ast_airport";
    private static final String TABLE3 = "ast_bridge";
    private static final String TABLE4 = "ast_channel";
    private static final String TABLE5 = "ast_cultural_goods";
    private static final String TABLE6 = "ast_equipment";
    private static final String TABLE7 = "ast_equipment_details";
    private static final String TABLE8 = "ast_guarantee";
    private static final String TABLE9 = "ast_idle";
    private static final String TABLE10 = "ast_infrastructure";
    private static final String TABLE11 = "ast_landscaping";
    private static final String TABLE12 = "ast_lease";
    private static final String TABLE13 = "ast_other_assets";
    private static final String TABLE14 = "ast_other_cause";
    private static final String TABLE15 = "ast_parts";
    private static final String TABLE16 = "ast_port";
    private static final String TABLE17 = "ast_premises";
    private static final String TABLE18 = "ast_premises_details";
    private static final String TABLE19 = "ast_road";
    private static final String TABLE20 = "ast_sanitation";
    private static final String TABLE21 = "ast_security_house";



    public static void main(String[] args) {
        CodeGeneratorManager cgm = new CodeGeneratorManager();
//            cgm.genCode(TABLE1,TABLE2,TABLE3,TABLE4,TABLE5,TABLE6,TABLE7,TABLE8,TABLE9,TABLE10,TABLE11,TABLE12,TABLE13,TABLE14,TABLE15,TABLE16,TABLE19,TABLE20,TABLE21);
            cgm.genCode("ast_premises_details");
    }
}
