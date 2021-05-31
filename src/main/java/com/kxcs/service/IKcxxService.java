package com.kxcs.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kxcs.entity.Kcxx;

/**
 * @Author chenjie
 * @Date 2021年5月28日上午10:51:40
 * @Des 库存信息
 */
public interface IKcxxService {
	int delete(String proid);

    int insert(Kcxx record);

    List<Kcxx> getall();

    Kcxx getbyid(String proid);

    Boolean update(Kcxx record);
    
    Kcxx kcxxWithPro(String proid);
    
    List<Kcxx> kcxxWithPronum();
    
    List<Kcxx> kcxxWithProdata();
    
    List<Kcxx> getbyparams(String proid,String pname);

}
