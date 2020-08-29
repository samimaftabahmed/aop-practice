package com.zaloni.samim.aoppractice;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AopPracticeApplicationTests {

    @Autowired
    private Person person;
    @Autowired
    private PersonAspect personAspect;
    @Autowired
    private MyService myService;

    @BeforeEach
    void beforeEach() {
        System.out.println("Start before");
    }

    @AfterEach
    void afterEach() {
        System.out.println("Clean up...");
    }


    @DisplayName("Context Load")
    @Test
    void contextLoads() {

//		Assertions.assertThat(personAspect.isPointCutCalled());

        person.run();
        assert personAspect.isPointCutCalled();

//		person.run();
//		System.out.println(personAspect.isPointCutCalled());
    }

    @EnabledOnOs(OS.LINUX)
    @DisplayName("MyService:kibaService Test")
    @Test
    void testMyService() {

        Assertions.assertEquals(myService.kibaService(), "kiba-service");
    }

    @DisplayName("MyService:divide Test to make it fail")
    @Test
    void testFailTest() {

//        Assertions.assertFalse(myService.sum(-5, 2) < 0,
//                "It should be greater than 0 inorder to be false");

        Assertions.assertThrows(ArithmeticException.class, () -> myService.divide(1, 1),
                "Divided by zero, should throw " + ArithmeticException.class.getCanonicalName());


//        if (myService.sum(-5, 2) < 0) {
//            Assertions.fail("Sum less than 0");
//        }
    }

    @Test
    void bunchOfAssertions() {
        Assertions.assertAll(
                () -> Assertions.assertEquals(myService.divide(1, 1), 1),
                () -> Assertions.assertNotEquals(myService.divide(1, 1), 0),
                () -> Assertions.assertThrows(ArithmeticException.class, () -> myService.divide(1, 0))
        );
    }

    @EnabledOnOs(OS.WINDOWS)
    @Test
    void failTestMethod() {
        Assertions.fail("Failed Method dei.");
    }


}
