package com.auto.mapper;

import com.auto.bean.QSpeakingQuestion;
import com.auto.bean.QSpeakingQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QSpeakingQuestionMapper {
    long countByExample(QSpeakingQuestionExample example);

    int deleteByExample(QSpeakingQuestionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QSpeakingQuestion record);

    int insertSelective(QSpeakingQuestion record);

    List<QSpeakingQuestion> selectByExampleWithBLOBs(QSpeakingQuestionExample example);

    List<QSpeakingQuestion> selectByExample(QSpeakingQuestionExample example);

    QSpeakingQuestion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QSpeakingQuestion record, @Param("example") QSpeakingQuestionExample example);

    int updateByExampleWithBLOBs(@Param("record") QSpeakingQuestion record, @Param("example") QSpeakingQuestionExample example);

    int updateByExample(@Param("record") QSpeakingQuestion record, @Param("example") QSpeakingQuestionExample example);

    int updateByPrimaryKeySelective(QSpeakingQuestion record);

    int updateByPrimaryKeyWithBLOBs(QSpeakingQuestion record);

    int updateByPrimaryKey(QSpeakingQuestion record);
}