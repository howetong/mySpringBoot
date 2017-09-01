package cn.tonghao.service;

import cn.tonghao.domain.Student;

import java.util.List;

/**
 * Created by tonghao on 2017/8/31.
 */
public interface IStudentService {

    Student getUser();

    List<Student> listStudent();

    List<Student> likeName(String name);
}
