package cn.tonghao.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by tonghao on 2017/8/30.
 */
@Component
public class MyStartupRunner implements CommandLineRunner {

    private static Logger logger = LoggerFactory.getLogger(MyStartupRunner.class);

    @Override
    public void run(String... strings) throws Exception {
        logger.info("****************服务启动执行，执行加载数据等操作***********************");
    }
}
