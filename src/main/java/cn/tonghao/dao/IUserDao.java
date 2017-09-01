package cn.tonghao.dao;

import cn.tonghao.domain.User;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by tonghao on 2017/9/1.
 */
public interface IUserDao extends CrudRepository<User, Integer>{

    @Query("select t from User t ")
    List<User> listUser();


    @Query("select t from User t where t.userName = :name")
    User findByName(@Param("name") String name);
}
