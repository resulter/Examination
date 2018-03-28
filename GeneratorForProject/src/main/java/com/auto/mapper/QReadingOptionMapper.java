package com.auto.mapper;

import com.auto.bean.QReadingOption;
import com.auto.bean.QReadingOptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QReadingOptionMapper {
    long countByExample(QReadingOptionExample example);

    int deleteByExample(QReadingOptionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QReadingOption record);

    int insertSelective(QReadingOption record);

    List<QReadingOption> selectByExample(QReadingOptionExample example);

    QReadingOption selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QReadingOption record, @Param("example") QReadingOptionExample example);

    int updateByExample(@Param("record") QReadingOption record, @Param("example") QReadingOptionExample example);

    int updateByPrimaryKeySelective(QReadingOption record);

    int updateByPrimaryKey(QReadingOption record);
}