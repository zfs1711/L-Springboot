package com.zfs.springboot.mapper;

import com.zfs.springboot.model.admininfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface admininfoMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(admininfo record);

    int insertSelective(admininfo record);

    admininfo selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(admininfo record);

    int updateByPrimaryKey(admininfo record);
    List<admininfo>selectAllAdmin();
}