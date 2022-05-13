package com.spring5study.annotationbean.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jiahao Wang
 * @create 2022-05-12 21:37
 */

// 作为配置类
@Configuration

@ComponentScan(basePackages = {"com.spring5study"})
public class SpringConfig {
}
