package com.kxcs.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kxcs.entity.Ckretire;
import com.kxcs.entity.CkretireExample;

/**
 * @Author chenjie
 * @Date 2021年3月28日上午9:36:30
 * @Des 仓库退货
 */
public interface ICkretireService {
	
    int delete(String inid);

    int insert(Ckretire record);

    List<Ckretire> getall();

    Ckretire getbyid(String inid);


    Boolean update(Ckretire record);
    
    List<Ckretire> getbyparams( String proid,String inid,String pname,String retdate );
}
