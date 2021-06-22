package com.kxcs.dao;


import com.kxcs.entity.Staffdep;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StaffdepMapper {

    //通过ID查找学院
    public Staffdep findStaffdepById(String depId);

    //查找全部学院
    public List<Staffdep> findStaffdep();



}
