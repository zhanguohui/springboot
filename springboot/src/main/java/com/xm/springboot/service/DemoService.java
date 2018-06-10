package com.xm.springboot.service;

import com.xm.springboot.Repository.DemoRepository;
import com.xm.springboot.domain.Demo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@Service
public class DemoService {
    @Resource
    private DemoRepository demoRepository;
    @Transactional
    public void save(Demo demo){
        demoRepository.save(demo);
    }

}
