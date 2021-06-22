package com.kxcs.service.imp;


import com.kxcs.dao.StaffdepMapper;
import com.kxcs.entity.Staffdep;
import com.kxcs.service.StaffdepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffdepServiceImpl implements StaffdepService {
    @Autowired
    private StaffdepMapper StaffdepMapper;


    public Staffdep findDepartmentById(String depId) {
        return StaffdepMapper.findStaffdepById(depId);
    }

    public List<Staffdep> findAllDepartment() {
        return StaffdepMapper.findStaffdep();
    }
}
