package com.kxcs.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kxcs.entity.Supply;
import com.kxcs.entity.SupplyExample;

/**
 * @Author chenjie
 * @Date 2021年5月27日上午10:16:56
 * @Des 
 */
public interface ISupplyMapperService {

    int delete(String supid);

    int insert(Supply record);

    List<Supply> getall();

    Supply getbyid(String supid);

    boolean update(Supply record);
    List<Supply> getbyparams(String supid, String suppname);
}
