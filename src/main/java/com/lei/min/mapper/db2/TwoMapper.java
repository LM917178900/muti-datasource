package com.lei.min.mapper.db2;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@DS("db2")
@Repository
public interface TwoMapper {

    /**
     * 根据id 查询对象
     *
     * @param id id
     * @return 对象
     * @author leiming5
     */
    List<Map<String, Object>> getByMap(@Param("id") Long id);
}
