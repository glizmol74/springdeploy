package com.glizmol.springdeploy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class SpringdeployApplicationTests {

	@Test
	void contextLoads() {
		System.getenv().forEach(
				(key, values) -> System.out.println(key + " " + values)
		);
	}

}
