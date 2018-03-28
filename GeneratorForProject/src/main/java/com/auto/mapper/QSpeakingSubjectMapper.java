package com.auto.mapper;

import com.auto.bean.QSpeakingSubject;
import com.auto.bean.QSpeakingSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QSpeakingSubjectMapper {
    long countByExample(QSpeakingSubjectExample example);

    int deleteByExample(QSpeakingSubjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QSpeakingSubject record);

    int insertSelective(QSpeakingSubject record);

    List<QSpeakingSubject> selectByExample(QSpeakingSubjectExample example);

    QSpeakingSubject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QSpeakingSubject record, @Param("example") QSpeakingSubjectExample example);

    int updateByExample(@Param("record") QSpeakingSubject record, @Param("example") QSpeakingSubjectExample example);

    int updateByPrimaryKeySelective(QSpeakingSubject record);

    int updateByPrimaryKey(QSpeakingSubject record);
}