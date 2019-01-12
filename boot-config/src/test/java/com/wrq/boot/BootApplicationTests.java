package com.wrq.boot;

import com.wrq.boot.bean.Persion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootApplicationTests {

	@Autowired
	Persion persion;

	@Autowired
	ApplicationContext ioc;

	@Test
	public void testConfig() {
		boolean b = ioc.containsBean("helloService");
		System.out.print(b);
	}

	@Test
	public void contextLoads() {
		System.out.print(persion);
	}

}

