package com.xm.springboot.web;

import com.alibaba.fastjson.JSONObject;
import com.xm.springboot.domain.Demo;
import com.xm.springboot.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @Resource
    private DemoService demoService;
    @RequestMapping("/save")
    public String  save(){
        Demo demo=new Demo();
        demo.setId(2L);
        demo.setName("lisi");
        demoService.save(demo);
        return JSONObject.toJSONString(demo);
    }
}
