package com.auto.mapper;

import com.auto.bean.QListeningPassage;
import com.auto.bean.QListeningPassageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QListeningPassageMapper {
    long countByExample(QListeningPassageExample example);

    int deleteByExample(QListeningPassageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QListeningPassage record);

    int insertSelective(QListeningPassage record);

    List<QListeningPassage> selectByExample(QListeningPassageExample example);

    QListeningPassage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QListeningPassage record, @Param("example") QListeningPassageExample example);

    int updateByExample(@Param("record") QListeningPassage record, @Param("example") QListeningPassageExample example);

    int updateByPrimaryKeySelective(QListeningPassage record);

    int updateByPrimaryKey(QListeningPassage record);
}