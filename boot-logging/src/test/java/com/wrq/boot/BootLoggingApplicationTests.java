package com.wrq.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootLoggingApplicationTests {

	Logger logger = LoggerFactory.getLogger(getClass());

	@Test
	public void contextLoads() {

		logger.trace("trace追踪信息");
		logger.debug("debug调试信息");
		logger.info("info日志信息");
		logger.warn("warn警告信息");
		logger.error("error报错信息");

	}

}

