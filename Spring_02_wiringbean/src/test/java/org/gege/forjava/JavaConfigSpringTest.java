package org.gege.forjava;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class JavaConfigSpringTest {
    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private CDPlayer cd;

    @Autowired
    private CDPlayer cd1;
    @Autowired
    private CDPlayer cd2;

    @Test
    public void testIsNotNull() {
        Assert.assertNotNull(compactDisc);
    }

    @Test
    public void testJavaWirited() {
        cd.play();
    }

    @Test
    public void testInjectEques() {
        //此测试可以验证 bean cd 和bean cd1 中在注入 CompactDisc的时候是同一个CompactDisc对象，说明disc实际调用只调用过一次
        Assert.assertEquals(cd.getCd(), cd1.getCd());
        //cd2的CompactDisc是通过传参注入的
        Assert.assertNotNull(cd2);
    }
}
