package com.atguigu.springboot;

import com.atguigu.springboot.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot01HelloworldQuickApplicationTests {
    @Autowired
    Person person;
    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
