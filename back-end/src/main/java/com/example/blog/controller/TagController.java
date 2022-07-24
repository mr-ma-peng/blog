package com.example.blog.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.blog.entity.Tag;
import com.example.blog.service.TagService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 标签表(Tag)表控制层
 *
 * @author makejava
 * @since 2022-07-17 21:56:32
 */
@Api(tags = {"标签接口"})
@RestController
@RequestMapping("tag")
public class TagController {
    /**
     * 服务对象
     */
    @Resource
    private TagService tagService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @return 所有数据
     */
    @GetMapping
    public IPage<Tag> selectAll(Page<Tag> page) {
        return tagService.page(page, null);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public Tag selectOne(@PathVariable Serializable id) {
        return tagService.getById(id);
    }

    /**
     * 新增数据
     *
     * @param tag 实体对象
     * @return 新增结果
     */
    @PostMapping
    public Boolean insert(@RequestBody Tag tag) {
        return tagService.save(tag);
    }

    /**
     * 修改数据
     *
     * @param tag 实体对象
     * @return 修改结果
     */
    @PutMapping
    public Boolean update(@RequestBody Tag tag) {
        return tagService.updateById(tag);
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public Boolean delete(@RequestParam("idList") List<Long> idList) {
        return tagService.removeByIds(idList);
    }
}

