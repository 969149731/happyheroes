package com.kxcs.entity;

import java.util.List;

public class Staffdep {
    private String id;
    private String name;
    private List<Stafftwo> stafftwo;

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

    public List<Stafftwo> getStafftwo() {
        return stafftwo;
    }

    public void setStafftwo(List<Stafftwo> stafftwo) {
        this.stafftwo = stafftwo;
    }
}
