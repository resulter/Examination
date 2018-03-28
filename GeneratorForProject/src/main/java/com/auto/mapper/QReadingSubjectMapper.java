package com.auto.mapper;

import com.auto.bean.QReadingSubject;
import com.auto.bean.QReadingSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QReadingSubjectMapper {
    long countByExample(QReadingSubjectExample example);

    int deleteByExample(QReadingSubjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QReadingSubject record);

    int insertSelective(QReadingSubject record);

    List<QReadingSubject> selectByExample(QReadingSubjectExample example);

    QReadingSubject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QReadingSubject record, @Param("example") QReadingSubjectExample example);

    int updateByExample(@Param("record") QReadingSubject record, @Param("example") QReadingSubjectExample example);

    int updateByPrimaryKeySelective(QReadingSubject record);

    int updateByPrimaryKey(QReadingSubject record);
}