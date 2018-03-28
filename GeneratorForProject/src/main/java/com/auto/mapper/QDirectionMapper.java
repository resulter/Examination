package com.auto.mapper;

import com.auto.bean.QDirection;
import com.auto.bean.QDirectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QDirectionMapper {
    long countByExample(QDirectionExample example);

    int deleteByExample(QDirectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QDirection record);

    int insertSelective(QDirection record);

    List<QDirection> selectByExampleWithBLOBs(QDirectionExample example);

    List<QDirection> selectByExample(QDirectionExample example);

    QDirection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QDirection record, @Param("example") QDirectionExample example);

    int updateByExampleWithBLOBs(@Param("record") QDirection record, @Param("example") QDirectionExample example);

    int updateByExample(@Param("record") QDirection record, @Param("example") QDirectionExample example);

    int updateByPrimaryKeySelective(QDirection record);

    int updateByPrimaryKeyWithBLOBs(QDirection record);

    int updateByPrimaryKey(QDirection record);
}