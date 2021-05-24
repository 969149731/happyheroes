package com.kxcs.service;

import org.apache.ibatis.annotations.Param;

import com.kxcs.entity.Manager;

/**
 * @Author chenjie
 * @Date 2021年4月16日下午1:31:39
 * @Des 
 */
public interface IManagerService {
	   Manager getbyid( String managerid,String pwd);
	   
	   boolean update(Manager manager);
	   
	   Manager getmanager(String managerid);
}
