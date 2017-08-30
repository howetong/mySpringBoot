package cn.tonghao.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

/**
 * Created by tonghao on 2017/8/18.
 */
@Controller
public class PageController {

    @Value("${application.hello:Hello World}")
    private String hello = "hello";

    @RequestMapping("/")
    public String index(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.hello);
        return "index";
    }

}
