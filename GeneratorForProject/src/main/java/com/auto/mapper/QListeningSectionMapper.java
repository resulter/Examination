package com.auto.mapper;

import com.auto.bean.QListeningSection;
import com.auto.bean.QListeningSectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QListeningSectionMapper {
    long countByExample(QListeningSectionExample example);

    int deleteByExample(QListeningSectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QListeningSection record);

    int insertSelective(QListeningSection record);

    List<QListeningSection> selectByExample(QListeningSectionExample example);

    QListeningSection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QListeningSection record, @Param("example") QListeningSectionExample example);

    int updateByExample(@Param("record") QListeningSection record, @Param("example") QListeningSectionExample example);

    int updateByPrimaryKeySelective(QListeningSection record);

    int updateByPrimaryKey(QListeningSection record);
}