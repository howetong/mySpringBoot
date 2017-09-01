package cn.tonghao.controller;

import cn.tonghao.domain.Score;
import cn.tonghao.domain.Student;
import cn.tonghao.domain.User;
import cn.tonghao.service.IScoreService;
import cn.tonghao.service.IStudentService;
import cn.tonghao.service.IUserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private IUserService userService;

    @Resource
    private IScoreService scoreService;

    @Resource
    private IStudentService stuService;


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

    @RequestMapping("/listStudent")
    public List<Student> listStudent() {
        PageHelper.startPage(1,2);
        return stuService.listStudent();

    }

    @RequestMapping("/getUser")
    public Student getUser() {
        return stuService.getUser();
    }

    @RequestMapping("/likeName")
    public List<Student> likeName(@RequestParam String name) {
        return stuService.likeName(name);

    }

}