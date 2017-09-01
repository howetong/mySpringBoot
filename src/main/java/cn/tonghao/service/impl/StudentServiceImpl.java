package cn.tonghao.service.impl;

import cn.tonghao.dataSource.TargetDataSource;
import cn.tonghao.domain.Student;
import cn.tonghao.mapper.StudentMapper;
import cn.tonghao.service.IStudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by tonghao on 2017/8/31.
 */
@Service("stuService")
public class StudentServiceImpl implements IStudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public Student getUser() {
        return studentMapper.getById(1);
    }

    @Override
    public List<Student> listStudent() {
        return studentMapper.listStudent();
    }

    @Override
    @TargetDataSource(name="ds1")
    public List<Student> likeName(String name) {
        return studentMapper.likeName(name);
    }


}
