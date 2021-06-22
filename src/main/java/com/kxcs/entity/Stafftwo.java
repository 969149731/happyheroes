package com.kxcs.entity;

public class Stafftwo {

    private String id;
    private String name;
    private Integer age;
    private Staffdep dept;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Staffdep getDept() {
        return dept;
    }

    public void setDept(Staffdep dept) {
        this.dept = dept;
    }
}
