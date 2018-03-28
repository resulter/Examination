package com.auto.mapper;

import com.auto.bean.QReadingSection;
import com.auto.bean.QReadingSectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QReadingSectionMapper {
    long countByExample(QReadingSectionExample example);

    int deleteByExample(QReadingSectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QReadingSection record);

    int insertSelective(QReadingSection record);

    List<QReadingSection> selectByExample(QReadingSectionExample example);

    QReadingSection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QReadingSection record, @Param("example") QReadingSectionExample example);

    int updateByExample(@Param("record") QReadingSection record, @Param("example") QReadingSectionExample example);

    int updateByPrimaryKeySelective(QReadingSection record);

    int updateByPrimaryKey(QReadingSection record);
}