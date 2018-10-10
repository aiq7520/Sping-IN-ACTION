package org.gege.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {
    private CompactDisc cd;

    public CDPlayer() {
    }

    //构造方法中注入 如果没有无参构造  则此处无需添加 @Autowired 注解
   /* @Autowired
    public CDPlayer(CompactDisc cd ){
        this.cd =cd;
    }*/


    //setter方法中注入
    //@Autowired
    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }

    //普通方法中注入
    @Autowired
    public void insertDisc(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.player();
    }
}
