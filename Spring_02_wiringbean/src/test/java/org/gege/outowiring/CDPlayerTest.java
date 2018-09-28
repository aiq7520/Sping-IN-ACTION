package org.gege.outowiring;

import org.gege.autowiring.CDPlayer;
import org.gege.autowiring.CDPlayerConfig;
import org.gege.autowiring.CompactDisc;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//通过自动扫描和装配的测试
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= CDPlayerConfig.class)
public class CDPlayerTest {
    @Autowired
    private CompactDisc cd;

    @Autowired
    private CDPlayer cdPlayer;

    //测试自动扫描 装配
    @Test
    public void cdShouldNotBeNull(){
        Assert.assertNotNull(cd);
    }

    //测试注入
    @Test
    public void injectBean(){
        cdPlayer.play();
    }

}
