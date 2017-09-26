package com.apps.madnan.ftrainfragment;

/**
 * Created by mahmoud adnan on 9/26/2017.
 */

public class Info {

    private String name, age;

    public Info() {
    }

    public Info(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
