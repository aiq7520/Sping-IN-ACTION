package org.gege.forjava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

    //不通过自动扫描来装配bean  而是通过java代码


    @Bean//将bean装配到spring  且bean 注册到spring的id 默认与方法名相同
    public CompactDisc disc() {
        //此处我们可以通过代码来创建我们需要的Bean，相对于自动装配和xml配置 非常灵活
        return new SgtPeppers();
    }

    /////////////cd和cd1 的缺点 disc的调用不方便  ，有时候 CompactDisc是通过 xml或自动装配注入到spring容器中的
    @Bean
    public CDPlayer cd() {
        //disc()  可以将 CompactDisc 注入到 CDPlayer 中
        //因为 disc 中添加 @Bean 注解  spring 会拦截所有对它的调用
        return new CDPlayer(disc());
    }

    @Bean
    public CDPlayer cd1() {
        return new CDPlayer(disc());
    }
    //////////

    //此参数可以通过任何方式注入到spring容器中
    @Bean
    public CDPlayer cd2(CompactDisc disc) {

        //此处我们可以调用setter方法 将disc 注入
        //return new CDPlayer().setXXX(disc)

        return new CDPlayer(disc);
    }
}
