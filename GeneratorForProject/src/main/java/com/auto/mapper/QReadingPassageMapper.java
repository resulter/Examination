package com.auto.mapper;

import com.auto.bean.QReadingPassage;
import com.auto.bean.QReadingPassageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QReadingPassageMapper {
    long countByExample(QReadingPassageExample example);

    int deleteByExample(QReadingPassageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QReadingPassage record);

    int insertSelective(QReadingPassage record);

    List<QReadingPassage> selectByExampleWithBLOBs(QReadingPassageExample example);

    List<QReadingPassage> selectByExample(QReadingPassageExample example);

    QReadingPassage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QReadingPassage record, @Param("example") QReadingPassageExample example);

    int updateByExampleWithBLOBs(@Param("record") QReadingPassage record, @Param("example") QReadingPassageExample example);

    int updateByExample(@Param("record") QReadingPassage record, @Param("example") QReadingPassageExample example);

    int updateByPrimaryKeySelective(QReadingPassage record);

    int updateByPrimaryKeyWithBLOBs(QReadingPassage record);

    int updateByPrimaryKey(QReadingPassage record);
}