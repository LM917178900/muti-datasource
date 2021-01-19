package com.lei.min.service;


import com.lei.min.model.SysTask;

import java.util.List;
import java.util.Map;

public interface INormalService {

    /**
     * 根据id 查询对象
     *
     * @param id id
     * @return 对象
     * @author leiming5
     */
    List<SysTask> getById(Long id);

    List<Map<String, Object>> getByMap(Long id);
}
