package cn.tonghao;

import cn.tonghao.dataSource.DynamicDataSourceRegister;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Import;

/**
 * Created by tonghao on 2017/8/18.
 */
@SpringBootApplication
@ServletComponentScan
@MapperScan("cn.tonghao.mapper")
@Import({DynamicDataSourceRegister.class})
public class SpringBootSampleApplication {

    /*@Bean
    public  ServletRegistrationBean  dispatcherRegistration(DispatcherServlet dispatcherServlet) {
        ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet);
        registration.getUrlMappings().clear();
        registration.addUrlMappings("*.do");
        registration.addUrlMappings("*.json");
        return registration;
    }*/


    public static void main(String[] args) {
        SpringApplication.run(SpringBootSampleApplication.class,args);
    }
}
