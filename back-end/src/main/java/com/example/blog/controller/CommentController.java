package com.example.blog.controller;


import com.example.blog.service.CommentService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 评论表(Comment)表控制层
 *
 * @author Peng Ma
 * @since 2022-07-14 21:49:01
 */
@Api(tags = "Comment")
@RestController
@RequestMapping("comment")
public class CommentController {
    /**
     * 服务对象
     */
    @Resource
    private CommentService commentService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param comment 查询实体
     * @return 所有数据
     */
//    @GetMapping
//    public R selectAll(Page<Comment> page, Comment comment) {
//        return success(this.commentService.page(page, new QueryWrapper<>(comment)));
//    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
//    @GetMapping("{id}")
//    public R selectOne(@PathVariable Serializable id) {
//        return success(this.commentService.getById(id));
//    }

    /**
     * 新增数据
     *
     * @param comment 实体对象
     * @return 新增结果
     */
//    @PostMapping
//    public R insert(@RequestBody Comment comment) {
//        return success(this.commentService.save(comment));
//    }

    /**
     * 修改数据
     *
     * @param comment 实体对象
     * @return 修改结果
     */
//    @PutMapping
//    public R update(@RequestBody Comment comment) {
//        return success(this.commentService.updateById(comment));
//    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
//    @DeleteMapping
//    public R delete(@RequestParam("idList") List<Long> idList) {
//        return success(this.commentService.removeByIds(idList));
//    }
}

