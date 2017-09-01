package cn.tonghao.service.impl;

import cn.tonghao.dao.IScoreDao;
import cn.tonghao.domain.Score;
import cn.tonghao.service.IScoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by tonghao on 2017/9/1.
 */
@Service("scoreService")
public class ScoreServiceImpl implements IScoreService{

    @Resource
    private IScoreDao scoreDao;


    @Override
    public List<Score> listScore() {
        return scoreDao.listScore();
    }
}
