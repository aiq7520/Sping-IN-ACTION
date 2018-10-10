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
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    @Autowired
    private CompactDisc cd;

    @Autowired
    private CDPlayer cdPlayer;

    private CDPlayer cdPlayer1;

    //测试自动扫描 装配
    @Test
    public void cdShouldNotBeNull() {
        Assert.assertNotNull(cd);
    }

    @Test
    //测试一个普通方法来注册一个参数
    public void methodInduce() {
        System.out.print(cdPlayer1);
    }

    //测试注入
    @Test
    public void injectBean() {
        cdPlayer.play();
    }

    @Autowired
    public void aaa(CDPlayer cdPlayer) {
        this.cdPlayer1 = cdPlayer;
        System.out.println(cdPlayer);
    }
}
