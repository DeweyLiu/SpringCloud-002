package com.forezp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ComponentScan(value = {"com.forezp.web","com.forezp.service"})
public class ServiceRibbonApplicationTests {

	@Test
	public void contextLoads() {
	}

}
