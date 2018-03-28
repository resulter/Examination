package com.auto.mapper;

import com.auto.bean.QListeningOption;
import com.auto.bean.QListeningOptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QListeningOptionMapper {
    long countByExample(QListeningOptionExample example);

    int deleteByExample(QListeningOptionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QListeningOption record);

    int insertSelective(QListeningOption record);

    List<QListeningOption> selectByExample(QListeningOptionExample example);

    QListeningOption selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QListeningOption record, @Param("example") QListeningOptionExample example);

    int updateByExample(@Param("record") QListeningOption record, @Param("example") QListeningOptionExample example);

    int updateByPrimaryKeySelective(QListeningOption record);

    int updateByPrimaryKey(QListeningOption record);
}