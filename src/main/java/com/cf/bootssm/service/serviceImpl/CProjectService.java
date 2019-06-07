package com.cf.bootssm.service.serviceImpl;

import com.cf.bootssm.bean.CProject;
import com.cf.bootssm.dao.CProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CProjectService {

    @Autowired
    CProjectMapper cProjectMapper;

    public CProject Sel(String id){
        return  cProjectMapper.selectByPrimaryKey(id);

    }
}
