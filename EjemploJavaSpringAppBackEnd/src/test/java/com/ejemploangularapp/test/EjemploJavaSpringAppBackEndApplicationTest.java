package com.ejemploangularapp.test;

import com.ejemploangularapp.main.EjemploJavaSpringAppBackEndApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {EjemploJavaSpringAppBackEndApplication.class})
@SpringBootTest
public class EjemploJavaSpringAppBackEndApplicationTest {

    public EjemploJavaSpringAppBackEndApplicationTest() {

    }

    @Test
    public void contextLoads() {

    }

}
