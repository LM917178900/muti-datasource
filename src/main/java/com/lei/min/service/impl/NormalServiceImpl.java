package com.lei.min.service.impl;

import com.lei.min.mapper.db1.OneMapper;
import com.lei.min.mapper.db2.TwoMapper;
import com.lei.min.model.SysTask;
import com.lei.min.service.INormalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @description: NormalServiceImpl
 * @author: leiming5
 * @date: 2020-12-29 09:13
 */
@Service
public class NormalServiceImpl implements INormalService {

    /**
     * dao 接口
     */
    @Resource
    private OneMapper oneMapper;
    @Resource
    private TwoMapper twoMapper;
    /**
     * 根据id 查询对象
     *
     * @param id id
     * @return 对象
     * @author leiming5
     */
    @Override
    public List<SysTask> getById(Long id){
        return oneMapper.getById(id);
    }

    /**
     * 根据id 查询对象
     *
     * @param id id
     * @return 对象
     * @author leiming5
     */
    @Override
    public List<Map<String, Object>> getByMap(Long id){
        return twoMapper.getByMap(id);
    }
}
