package com.kxcs.dao;

import com.kxcs.entity.Stafftwo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StufftwoMapper {

    //查找全部学生
    public List<Stafftwo> findAllStafftwo();

}
