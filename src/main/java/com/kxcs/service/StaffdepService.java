package com.kxcs.service;


import com.kxcs.entity.Staffdep;

import java.util.List;

public interface StaffdepService {

    //通过ID查找学院
    public Staffdep findDepartmentById(String depId);

    //查找全部学院
    public List<Staffdep> findAllDepartment();

}
