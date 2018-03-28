package com.auto.mapper;

import com.auto.bean.QWritingSection;
import com.auto.bean.QWritingSectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QWritingSectionMapper {
    long countByExample(QWritingSectionExample example);

    int deleteByExample(QWritingSectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QWritingSection record);

    int insertSelective(QWritingSection record);

    List<QWritingSection> selectByExample(QWritingSectionExample example);

    QWritingSection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QWritingSection record, @Param("example") QWritingSectionExample example);

    int updateByExample(@Param("record") QWritingSection record, @Param("example") QWritingSectionExample example);

    int updateByPrimaryKeySelective(QWritingSection record);

    int updateByPrimaryKey(QWritingSection record);
}