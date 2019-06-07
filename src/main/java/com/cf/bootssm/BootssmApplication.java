package com.cf.bootssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;



@SpringBootApplication
@MapperScan("com.cf.bootssm.dao")
/*@ConfigurationProperties(prefix="spring.datasource")
@EnableCaching*/
public class BootssmApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootssmApplication.class, args);
    }

}
