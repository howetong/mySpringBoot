package cn.tonghao.mapper;

import cn.tonghao.config.mybaits.MyMapper;
import cn.tonghao.domain.Student;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by tonghao on 2017/8/31.
 */
@Component
public interface StudentMapper extends MyMapper<Student> {

        Student getById(int id);

        String getNameById(int id);

        List<Student> listStudent();

        List<Student> likeName(String name);
}
