package cn.tonghao.service;

import cn.tonghao.dao.IScoreDao;
import cn.tonghao.domain.Score;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by tonghao on 2017/8/30.
 */
public interface IScoreService{

    List<Score> listScore();
}
