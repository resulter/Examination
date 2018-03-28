package com.auto.mapper;

import com.auto.bean.QWritingSubject;
import com.auto.bean.QWritingSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QWritingSubjectMapper {
    long countByExample(QWritingSubjectExample example);

    int deleteByExample(QWritingSubjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QWritingSubject record);

    int insertSelective(QWritingSubject record);

    List<QWritingSubject> selectByExampleWithBLOBs(QWritingSubjectExample example);

    List<QWritingSubject> selectByExample(QWritingSubjectExample example);

    QWritingSubject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QWritingSubject record, @Param("example") QWritingSubjectExample example);

    int updateByExampleWithBLOBs(@Param("record") QWritingSubject record, @Param("example") QWritingSubjectExample example);

    int updateByExample(@Param("record") QWritingSubject record, @Param("example") QWritingSubjectExample example);

    int updateByPrimaryKeySelective(QWritingSubject record);

    int updateByPrimaryKeyWithBLOBs(QWritingSubject record);

    int updateByPrimaryKey(QWritingSubject record);
}