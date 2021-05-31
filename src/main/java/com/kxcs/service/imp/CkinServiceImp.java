package com.kxcs.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kxcs.dao.CkinMapper;
import com.kxcs.entity.Ckin;
import com.kxcs.entity.CkinExample;
import com.kxcs.entity.Product;
import com.kxcs.service.ICkinService;

/**
 * @Author chenjie
 * @Date 2021年5月27日下午3:25:06
 * @Des 
 */
@Service
public class CkinServiceImp implements ICkinService{
	@Autowired
	CkinMapper ckinMapper;
	public int delete(String inid) {
		// TODO Auto-generated method stub
		return ckinMapper.deleteByPrimaryKey(inid);
	}

	public int insert(Ckin record) {
		// TODO Auto-generated method stub
		return ckinMapper.insert(record);
	}

	public List<Ckin> getall() {
		// TODO Auto-generated method stub
		return ckinMapper.selectByExample(null);
	}

	public Ckin getbyid(String inid) {
		// TODO Auto-generated method stub
		return ckinMapper.selectByPrimaryKey(inid);
	}

	public boolean update(Ckin record) {
		// TODO Auto-generated method stub
		return ckinMapper.updateByPrimaryKey(record);
	}

	public List<Ckin> getbyparams(String proid, String inid, String pname, String indate) {
		// TODO Auto-generated method stub
		return ckinMapper.getbyparams(proid, inid, pname, indate);
	}


}
