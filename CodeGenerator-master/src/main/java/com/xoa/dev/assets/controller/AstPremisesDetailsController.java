package com.xoa.dev.assets.controller;
import com.xoa.dev.assets.model.AstPremisesDetails;
import com.xoa.dev.assets.service.AstPremisesDetailsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import com.xoa.util.ToJson;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * Created by liujian on 2019/06/08.
 */
@Controller
@RequestMapping("/astPremisesDetails/")
public class AstPremisesDetailsController {

    @Autowired
    AstPremisesDetailsService astPremisesDetailsService;

    @RequestMapping("selectAll")
    @ResponseBody
    public ToJson<AstPremisesDetails> selectAll(HttpServletRequest request){
        ToJson json =new ToJson<AstPremisesDetails>(1,"err");
        try {
        List<AstPremisesDetails> data =astPremisesDetailsService.selectAll();
                if(data!=null){
                    json.setObj(data);
                    json.setFlag(0);
                    json.setMsg("true");
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        return json;
    }

    @RequestMapping("select")
    @ResponseBody
    public ToJson<AstPremisesDetails> selectByCondition(HttpServletRequest request, Integer page, Integer pageSize, Boolean useFlag, AstPremisesDetails astPremisesDetails){
        Map<String,Object> map= new HashMap<String, Object>();
        map.put("obj",astPremisesDetails);
        ToJson json =new ToJson<AstPremisesDetails>(1,"err");
        try {
        List<AstPremisesDetails> data =astPremisesDetailsService.selectByCondition(page, pageSize, useFlag, map);
                if(data!=null){
                    json.setObj(data);
                    json.setFlag(0);
                    json.setMsg("true");
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        return json;
    }

    @RequestMapping("count")
    @ResponseBody
    public ToJson<Integer> count(HttpServletRequest request, AstPremisesDetails record){
        ToJson json =new ToJson<Integer>(1,"err");
        try {
        Integer data =astPremisesDetailsService.count(record);
                if(data!=null){
                    json.setObject(data);
                    json.setFlag(0);
                    json.setMsg("true");
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        return json;
    }

    @RequestMapping("insert")
    @ResponseBody
    public ToJson<Integer> insertSelective(HttpServletRequest request, AstPremisesDetails record){
        ToJson json =new ToJson<Integer>(1,"err");
        try {
        Integer data =astPremisesDetailsService.insertSelective(record);
                if(data!=null){
                    json.setObject(data);
                    json.setFlag(0);
                    json.setMsg("true");
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        return json;
    }

    @RequestMapping("delete")
    @ResponseBody
    public ToJson<Integer> deleteByCondition(HttpServletRequest request, AstPremisesDetails record){
        ToJson json =new ToJson<Integer>(1,"err");
        try {
        Integer data =astPremisesDetailsService.deleteByCondition(record);
                if(data!=null){
                    json.setObject(data);
                    json.setFlag(0);
                    json.setMsg("true");
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        return json;
    }

}
