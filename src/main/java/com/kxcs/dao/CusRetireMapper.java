package com.kxcs.dao;

import com.kxcs.entity.Ckretire;
import com.kxcs.entity.CusRetire;
import com.kxcs.entity.CusRetireExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CusRetireMapper {
    int deleteByPrimaryKey(String saleid);

    int insert(CusRetire record);


    List<CusRetire> selectByExample(CusRetireExample example);

    CusRetire selectByPrimaryKey(String saleid);


    Boolean updateByPrimaryKey(CusRetire record);
    
    List<CusRetire> getbyparams(@Param("proid") String proid,@Param("saleid")String saleid,@Param("pname")String pname,@Param("retdate")String retdate );
}