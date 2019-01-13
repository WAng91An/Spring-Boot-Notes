package com.wrq.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication
 * 来标注一个主程序，说明这是一个Sping Boot项目
 *
 * 点击去有一个：@EnableAutoConfiguration->@AutoConfigurationPackage
 * 它的作用：将@SpringBootApplication所配置的类所在的包下面所有组件都扫描到Spring容器里面
 */
@SpringBootApplication
public class BootApplication {

	public static void main(String[] args) {

		//应用启动起来
		SpringApplication.run(BootApplication.class, args);
	}

}

