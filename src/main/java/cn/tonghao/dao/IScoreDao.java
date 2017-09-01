package cn.tonghao.dao;

import cn.tonghao.domain.Score;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by tonghao on 2017/9/1.
 */
public interface IScoreDao extends CrudRepository<Score, Integer> {

    @Query("select t from Score t ")
    List<Score> listScore();
}
