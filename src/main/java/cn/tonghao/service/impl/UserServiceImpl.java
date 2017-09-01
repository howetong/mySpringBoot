package cn.tonghao.service.impl;

import cn.tonghao.dao.IUserDao;
import cn.tonghao.domain.User;
import cn.tonghao.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by tonghao on 2017/8/30.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    @Override
    public List<User> listUser() {
        return userDao.listUser();
    }
}
