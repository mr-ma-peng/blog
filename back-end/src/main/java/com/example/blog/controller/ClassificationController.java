package com.example.blog.controller;


import com.example.blog.service.ClassificationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 分类表(Classification)表控制层
 *
 * @author makejava
 * @since 2022-07-14 21:48:36
 */
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
     * @param classification 查询实体
     * @return 所有数据
     */
//    @GetMapping
//    public R selectAll(Page<Classification> page, Classification classification) {
//        return success(this.classificationService.page(page, new QueryWrapper<>(classification)));
//    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
//    @GetMapping("{id}")
//    public R selectOne(@PathVariable Serializable id) {
//        return success(this.classificationService.getById(id));
//    }

    /**
     * 新增数据
     *
     * @param classification 实体对象
     * @return 新增结果
     */
//    @PostMapping
//    public R insert(@RequestBody Classification classification) {
//        return success(this.classificationService.save(classification));
//    }

    /**
     * 修改数据
     *
     * @param classification 实体对象
     * @return 修改结果
     */
//    @PutMapping
//    public R update(@RequestBody Classification classification) {
//        return success(this.classificationService.updateById(classification));
//    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
//    @DeleteMapping
//    public R delete(@RequestParam("idList") List<Long> idList) {
//        return success(this.classificationService.removeByIds(idList));
//    }
}

