package com.auto.mapper;

import com.auto.bean.QListeningQuestion;
import com.auto.bean.QListeningQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QListeningQuestionMapper {
    long countByExample(QListeningQuestionExample example);

    int deleteByExample(QListeningQuestionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QListeningQuestion record);

    int insertSelective(QListeningQuestion record);

    List<QListeningQuestion> selectByExampleWithBLOBs(QListeningQuestionExample example);

    List<QListeningQuestion> selectByExample(QListeningQuestionExample example);

    QListeningQuestion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QListeningQuestion record, @Param("example") QListeningQuestionExample example);

    int updateByExampleWithBLOBs(@Param("record") QListeningQuestion record, @Param("example") QListeningQuestionExample example);

    int updateByExample(@Param("record") QListeningQuestion record, @Param("example") QListeningQuestionExample example);

    int updateByPrimaryKeySelective(QListeningQuestion record);

    int updateByPrimaryKeyWithBLOBs(QListeningQuestion record);

    int updateByPrimaryKey(QListeningQuestion record);
}