package org.gege.forxml;

import org.gege.forjava.CDPlayer;
import org.gege.forjava.SgtPeppers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class XMLConfigSpringTest {
    @Autowired
    private SgtPeppers sgtPeppers;
    @Autowired
    private ApplicationContext acx;
    @Autowired
    private CDPlayer cdPlayer1;
    @Autowired
    private CDPlayer cdPlayer2;
    @Autowired
    private CDPlayer cdPlayer3;


    @Test
    public void isNotNull() {
        Assert.assertNotNull(sgtPeppers);
        //通过名字获取 默认名字 全名 #n
        SgtPeppers s = (SgtPeppers) acx.getBean("org.gege.forjava.SgtPeppers#0");
        System.out.println(s);
        Assert.assertEquals(s, sgtPeppers);
    }

    @Test
    public void springBean() {
        Assert.assertNotNull(cdPlayer1);
        cdPlayer1.play();
        Assert.assertNotNull(cdPlayer2.getCd());
        cdPlayer2.play();
        Assert.assertNotNull(cdPlayer3.getCd());
        cdPlayer3.play();
    }

    @Test
    public void springSet() {
        List<Object> setDemo = ((SgtPeppers) cdPlayer2.getCd()).getL();
        for (Object s : setDemo) {
            System.out.println(s);
        }
    }
}
