package com.nlb.springboot_es;

import com.nlb.springboot_es.Interface.StudentInterface;
import com.nlb.springboot_es.bean.student;
import io.searchbox.client.JestClient;
import io.searchbox.core.Index;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootEsApplicationTests {

    @Autowired
    JestClient  jestClient;

    @Autowired
    StudentInterface studentInterface;

    @Test
    public void test02(){
        student stu = new student();
        stu.setAge(23);
        stu.setId(1);
        stu.setName("nlb");
        studentInterface.index(stu);
    }

    @Test
    public void test01() throws IOException {
        student stu = new student();
        stu.setAge(23);
        stu.setId(1);
        stu.setName("nlb");
        Index index = new Index.Builder(stu).index("spring").build();
        jestClient.execute(index);
    }

    @Test
    public void contextLoads() {
    }

}
