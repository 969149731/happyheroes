package com.kxcs.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kxcs.dao.ManagerMapper;
import com.kxcs.entity.Manager;
import com.kxcs.service.IManagerService;

/**
 * @Author chenjie
 * @Date 2021年5月16日下午1:51:00
 * @Des 管理员service
 */
@Service
public class ManagerServiceImp implements IManagerService{

	@Autowired
	ManagerMapper managerMapper;
	public Manager getbyid(String managerid,String pwd) {
		Manager manager=managerMapper.getbyid(managerid);
		if(manager!=null) {
			if(manager.getPwd().equals(pwd)) {
				return manager;
			}
		}
		
		return null;
	}

	public boolean update(Manager manager) {
		// TODO Auto-generated method stub
		return managerMapper.update(manager);
	}

	public Manager getmanager(String managerid) {
		// TODO Auto-generated method stub
		return managerMapper.getbyid(managerid);
	}

}
