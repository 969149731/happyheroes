package com.kxcs.dao;

import com.kxcs.entity.Ckin;
import com.kxcs.entity.CkinExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CkinMapper {
	
    int deleteByPrimaryKey(String inid);

    int insert(Ckin record);


    List<Ckin> selectByExample(CkinExample example);

    Ckin selectByPrimaryKey(String inid);

    boolean updateByPrimaryKey(Ckin record);
    
    List<Ckin> getbyparams(@Param("proid") String proid,@Param("inid")String inid,@Param("pname")String pname,@Param("indate")String indate );
}