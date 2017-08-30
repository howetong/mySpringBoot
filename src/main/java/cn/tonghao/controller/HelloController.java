package cn.tonghao.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.tonghao.domain.Score;
import cn.tonghao.domain.User;
import cn.tonghao.service.IScoreService;
import cn.tonghao.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Resource
    private IUserService userService;

    @Resource
    private IScoreService scoreService;


    @RequestMapping
    public String hello() {
        return "Hello Spring-Boot";
    }

    @RequestMapping("/info")
    public Map<String, String> getInfo(@RequestParam String name) {
        Map<String, String> map = new HashMap<>();
        map.put("name", name);
        return map;
    }

    @RequestMapping("/listUser")
    public List<User> listUser() {
        return userService.listUser();

    }


    @RequestMapping("/listScore")
    public List<Score> listScore() {
        return scoreService.listScore();

    }
}