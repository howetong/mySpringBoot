package cn.tonghao.service.impl;

import cn.tonghao.domain.User;
import cn.tonghao.service.IUserService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by tonghao on 2017/8/30.
 */
@Service
public class UserServiceImpl implements IUserService {

    //jdbc方式
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> listUser() {
        String sql = "SELECT * FROM user";
        return (List<User>) jdbcTemplate.query(sql, new RowMapper<User>() {

            @Override
            public User mapRow(ResultSet rs, int i) throws SQLException {
                User u = new User();
                u.setId(rs.getInt("id"));
                u.setName(rs.getString("name"));
                return u;
            }
        });
    }
}
