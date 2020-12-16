package cn.bdqn.sptdemo.web2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("cn.bdqn.sptdemo")
@MapperScan("cn.bdqn.sptdemo.dao")
public class SptdemoWeb2Application {

    public static void main(String[] args) {
        SpringApplication.run(SptdemoWeb2Application.class, args);
    }

}
