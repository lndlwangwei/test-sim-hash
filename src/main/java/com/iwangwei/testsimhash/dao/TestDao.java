package com.iwangwei.testsimhash.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface TestDao {

    @Select("select * from user")
    List<Map<String, Object>> getAll();
}
