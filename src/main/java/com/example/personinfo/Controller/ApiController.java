package com.example.personinfo.Controller;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import java.util.HashMap;
import java.util.Map;

@Controller

public class ApiController extends HttpServlet {

    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "personinfo", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public static String personinfo(String usercode){
        String json = null;
        String code1 = "123";
        String code2 = "456";
        String code3 = "789";
        System.out.println(usercode);
        Map map=new HashMap();
        if(usercode.equals(code1)){

            map.put("usercode",code1);
            map.put("username","张三");
            map.put("department","技术部");

        }

        if(usercode.equals(code2)){

            map.put("usercode",code2);
            map.put("username","李四");
            map.put("department","财务部");

        }

        if(usercode.equals(code3)){

            map.put("usercode",code3);
            map.put("username","刘五");
            map.put("department","人力部");

        }
        Gson gson = new Gson();
        json = gson.toJson(map);
        System.out.println(json);
        return json;

    }

}
