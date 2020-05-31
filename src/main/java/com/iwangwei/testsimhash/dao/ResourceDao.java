package com.iwangwei.testsimhash.dao;

import com.iwangwei.testsimhash.utils.Resource;
import com.iwangwei.testsimhash.utils.ResourceSimHash;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ResourceDao {

    @Select("select * from resource where id > #{minId}")
    List<Resource> getSomeResource(@Param("minId") int minId);

    @Insert("insert into resource_title_hash value (#{resourceId}, #{title}, #{hash})")
    void insertSimHash(ResourceSimHash resourceSimHash);

    @Select("select * from resource_title_hash limit 5000")
    List<ResourceSimHash> getAllResourceHash();
}
