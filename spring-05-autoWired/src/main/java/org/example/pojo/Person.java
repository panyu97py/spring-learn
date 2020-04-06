package org.example.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import javax.annotation.Resource;
import org.springframework.lang.Nullable;

public class Person {
    @Resource
    private Cat cat;
    @Autowired
    private Dog dog;
    private String name;

    public Person(@Nullable String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }


    public Dog getDog() {
        return dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
