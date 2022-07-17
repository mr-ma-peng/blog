package com.example.blog.controller;


import com.example.blog.service.TagService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 标签表(Tag)表控制层
 *
 * @author makejava
 * @since 2022-07-17 21:56:32
 */
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
     * @param tag 查询实体
     * @return 所有数据
     */
//    @GetMapping
//    public R selectAll(Page<Tag> page, Tag tag) {
//        return success(this.tagService.page(page, new QueryWrapper<>(tag)));
//    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
//    @GetMapping("{id}")
//    public R selectOne(@PathVariable Serializable id) {
//        return success(this.tagService.getById(id));
//    }

    /**
     * 新增数据
     *
     * @param tag 实体对象
     * @return 新增结果
     */
//    @PostMapping
//    public R insert(@RequestBody Tag tag) {
//        return success(this.tagService.save(tag));
//    }

    /**
     * 修改数据
     *
     * @param tag 实体对象
     * @return 修改结果
     */
//    @PutMapping
//    public R update(@RequestBody Tag tag) {
//        return success(this.tagService.updateById(tag));
//    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
//    @DeleteMapping
//    public R delete(@RequestParam("idList") List<Long> idList) {
//        return success(this.tagService.removeByIds(idList));
//    }
}

