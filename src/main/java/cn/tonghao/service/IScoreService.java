package cn.tonghao.service;

import cn.tonghao.domain.Score;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by tonghao on 2017/8/30.
 */
public interface IScoreService extends CrudRepository<Score, Integer>{

    @Query("select t from Score t ")
    List<Score> listScore();
}
