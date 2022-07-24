package com.example.blog.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.blog.entity.Classification;
import com.example.blog.service.ClassificationService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 分类表(Classification)表控制层
 *
 * @author Peng Ma
 * @since 2022-07-14 21:48:36
 */
@Api(tags = {"分类接口"})
@RestController
@RequestMapping("classification")
public class ClassificationController {
    /**
     * 服务对象
     */
    @Resource
    private ClassificationService classificationService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @return 所有数据
     */
    @GetMapping
    public IPage<Classification> selectAll(Page<Classification> page) {
        return classificationService.page(page, null);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public Classification selectOne(@PathVariable Serializable id) {
        return classificationService.getById(id);
    }

    /**
     * 新增数据
     *
     * @param classification 实体对象
     * @return 新增结果
     */
    @PostMapping
    public Boolean insert(@RequestBody Classification classification) {
        return classificationService.save(classification);
    }

    /**
     * 修改数据
     *
     * @param classification 实体对象
     * @return 修改结果
     */
    @PutMapping
    public Boolean update(@RequestBody Classification classification) {
        return classificationService.updateById(classification);
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public Boolean delete(@RequestParam("idList") List<Long> idList) {
        return classificationService.removeByIds(idList);
    }
}

