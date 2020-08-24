package com.zaloni.samim.aoppractice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AopPracticeApplicationTests {

	@Autowired
	Person person;
	@Autowired
	PersonAspect personAspect;

	@Test
	void contextLoads() {

//		Assertions.assertThat(personAspect.isPointCutCalled());

		person.run();
		assert personAspect.isPointCutCalled();

//		person.run();
//		System.out.println(personAspect.isPointCutCalled());
	}

}
