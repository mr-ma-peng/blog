package com.example.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.blog.entity.Classification;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 分类表(Classification)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-14 21:48:36
 */
public interface ClassificationDao extends BaseMapper<Classification> {

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Classification> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Classification> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Classification> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Classification> entities);

}

