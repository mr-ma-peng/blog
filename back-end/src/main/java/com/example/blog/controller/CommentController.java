package com.example.blog.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.blog.entity.Comment;
import com.example.blog.service.CommentService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 评论表(Comment)表控制层
 *
 * @author Peng Ma
 * @since 2022-07-14 21:49:01
 */
@Api(tags = {"评论接口"})
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
     * @return 所有数据
     */
    @GetMapping
    public IPage<Comment> selectAll(Page<Comment> page) {
        return commentService.page(page, null);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public Comment selectOne(@PathVariable Serializable id) {
        return commentService.getById(id);
    }

    /**
     * 新增数据
     *
     * @param comment 实体对象
     * @return 新增结果
     */
    @PostMapping
    public Boolean insert(@RequestBody Comment comment) {
        return commentService.save(comment);
    }

    /**
     * 修改数据
     *
     * @param comment 实体对象
     * @return 修改结果
     */
    @PutMapping
    public Boolean update(@RequestBody Comment comment) {
        return commentService.updateById(comment);
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public Boolean delete(@RequestParam("idList") List<Long> idList) {
        return commentService.removeByIds(idList);
    }
}

