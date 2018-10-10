package org.gege.assemblelist;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class AssembleListTest {
    @Autowired
    private AssembleList assembleList;

    @Test
    public void testAssebleList() {
        List<String> stes = assembleList.getStr();
        stes.forEach(System.out::println);
        Assert.assertNotNull(assembleList);
    }
}
