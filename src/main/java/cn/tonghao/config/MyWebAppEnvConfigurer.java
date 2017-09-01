package cn.tonghao.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * Created by tonghao on 2017/8/31.
 */
@Configuration
public class MyWebAppEnvConfigurer implements EnvironmentAware
{
    private static final Logger logger = LoggerFactory.getLogger(MyWebAppEnvConfigurer.class);

    private RelaxedPropertyResolver propertyResolver;

    @Value("${spring.datasource.url}")
    private String myUrl;

    /**
     * 这个方法只是测试实现EnvironmentAware接口，读取环境变量的方法。
     */
    @Override
    public void setEnvironment(Environment env) {
        logger.info(env.getProperty("JAVA_HOME"));
        logger.info(myUrl);
        String str = env.getProperty("spring.datasource.url");
        logger.info(str);
        propertyResolver = new RelaxedPropertyResolver(env, "spring.datasource.");
        String url = propertyResolver.getProperty("url");
        logger.info(url);
    }
}