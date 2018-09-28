package org.gege.forxml;

import org.gege.forjava.SgtPeppers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class XMLConfigSpringTest {
    @Autowired
    private SgtPeppers sgtPeppers;
    @Autowired
    private ApplicationContext acx;
    @Test
    public void isNotNull(){
        Assert.assertNotNull(sgtPeppers);
        //通过名字获取 默认名字 全名 #n
        SgtPeppers s = (SgtPeppers)   acx.getBean("org.gege.forjava.SgtPeppers#0");
        System.out.println(s);
        Assert.assertEquals(s,sgtPeppers);
    }
}
