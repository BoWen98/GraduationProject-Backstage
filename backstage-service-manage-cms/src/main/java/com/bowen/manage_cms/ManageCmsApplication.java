package com.bowen.manage_cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ProjectName: GraduationProject-Backstage
 * @Package: com.bowen.manage_cms
 * @ClassName: ManageCmsApplication
 * @Author: Bowen
 * @Description: cms启动类
 * @Date: 2019/10/22 11:09
 * @Version: 1.0.0
 */
@SpringBootApplication
@EntityScan("com.bowen.framework.domain.cms")//扫描实体类
@ComponentScan(basePackages = {"com.bowen.api"})//扫描接口
@ComponentScan(basePackages = {"com.bowen.manage_cms"})//扫描本项目下的所有类
public class ManageCmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManageCmsApplication.class, args);
    }
}
