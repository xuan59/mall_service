package com.mall;

import com.github.tobato.fastdfs.FdfsClientConfig;
import com.mall.common.utils.SpringUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;


@ComponentScan(basePackages = {"com.mall.*"})
@SpringBootApplication
@Import(FdfsClientConfig.class)
public class MallServiceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(MallServiceApplication.class, args);
        SpringUtil.setApplicationContext2(applicationContext);
    }

}
