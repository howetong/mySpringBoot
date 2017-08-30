package cn.tonghao;

import cn.tonghao.servlet.MyServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletRegistration;

/**
 * Created by tonghao on 2017/8/18.
 */
@SpringBootApplication
@ServletComponentScan
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
