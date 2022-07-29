package com.example.blog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.blog.entity.Tag;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 标签表(Tag)表数据库访问层
 *
 * @author makejava
 * @since 2022-07-17 21:56:32
 */
public interface TagMapper extends BaseMapper<Tag> {

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Tag> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Tag> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Tag> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Tag> entities);

}

