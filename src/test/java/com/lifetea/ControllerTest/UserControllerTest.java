package com.lifetea.ControllerTest;

import com.lifetea.AppApplicationTests;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by lifetea on 2017/3/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AppApplicationTests.class)
public class UserControllerTest {
    @Test
    public void test(){
        System.out.print("haha");
    }
}
