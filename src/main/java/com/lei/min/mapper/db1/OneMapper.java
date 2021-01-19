package com.lei.min.mapper.db1;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.lei.min.model.SysTask;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@DS("db1")
@Repository
public interface OneMapper {

    /**
     * 根据id 查询对象
     *
     * @param id id
     * @return 对象
     * @author leiming5
     */
    List<SysTask> getById(@Param("id") Long id);
}
