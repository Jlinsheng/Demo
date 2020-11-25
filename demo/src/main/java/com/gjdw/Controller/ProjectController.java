package com.gjdw.Controller;

import com.gjdw.service.Tservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ProjectController {
    @Resource
    Tservice service;

    @RequestMapping("/getDeleteByPerson")
    @ResponseBody
    public Map<String,String> getDeleteByPerson(String personId){
        System.err.println("############################################");
        Map<String,String> map = new HashMap<>();
        if(personId != null && personId != ""){
            try {
                service.getDeleteByPerson(personId);
            }catch (Exception e){
                System.err.println("删除异常:"+e);
                map.put("1","删除异常");
                return map;
            }
        }
        map.put("0","删除成功");
        return map;
    }
}
