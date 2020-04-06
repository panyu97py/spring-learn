package org.example.pojo.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//等价于 <bean id = "user" class = "org.example.pojo.User"/>
//@Component 组件
@Component
public class User {
    //相当于<property name="name" value="张三"/>
    @Value("张三")
    public String name;
}
