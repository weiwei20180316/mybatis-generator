package com.example.demo.mapper;

import com.example.demo.model.pmsBrand;

public interface pmsBrandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(pmsBrand record);

    int insertSelective(pmsBrand record);

    pmsBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(pmsBrand record);

    int updateByPrimaryKeyWithBLOBs(pmsBrand record);

    int updateByPrimaryKey(pmsBrand record);
}