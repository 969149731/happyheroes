package com.kxcs.service.imp;



import com.kxcs.dao.StaffMapper;
import com.kxcs.dao.StufftwoMapper;
import com.kxcs.entity.Staff;
import com.kxcs.entity.Stafftwo;
import com.kxcs.service.StafftwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StafftwoServiceImpl implements StafftwoService {
    @Autowired
    private StufftwoMapper StufftwoMapper;


    public List<Stafftwo> findAllStafftwo() {
        return    StufftwoMapper.findAllStafftwo();
    }
}
