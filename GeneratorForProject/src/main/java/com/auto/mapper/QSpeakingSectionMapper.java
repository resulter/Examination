package com.auto.mapper;

import com.auto.bean.QSpeakingSection;
import com.auto.bean.QSpeakingSectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QSpeakingSectionMapper {
    long countByExample(QSpeakingSectionExample example);

    int deleteByExample(QSpeakingSectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QSpeakingSection record);

    int insertSelective(QSpeakingSection record);

    List<QSpeakingSection> selectByExample(QSpeakingSectionExample example);

    QSpeakingSection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QSpeakingSection record, @Param("example") QSpeakingSectionExample example);

    int updateByExample(@Param("record") QSpeakingSection record, @Param("example") QSpeakingSectionExample example);

    int updateByPrimaryKeySelective(QSpeakingSection record);

    int updateByPrimaryKey(QSpeakingSection record);
}