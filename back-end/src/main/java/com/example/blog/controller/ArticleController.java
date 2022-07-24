package com.example.blog.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.blog.entity.Article;
import com.example.blog.service.ArticleService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;


/**
 * 文章表(Article)表控制层
 *
 * @author Peng Ma
 * @since 2022-07-11 23:11:43
 */
@Api(tags = {"文章接口"})
@RestController
@RequestMapping("article")
public class ArticleController  {
    /**
     * 服务对象
     */
    @Resource
    private ArticleService articleService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @return 所有数据
     */
    @GetMapping
    public IPage<Article> selectAll(Page<Article> page) {
        return articleService.page(page, null);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public Article selectOne(@PathVariable Serializable id) {
        return articleService.getById(id);
    }

    /**
     * 新增数据
     *
     * @param article 实体对象
     * @return 新增结果
     */
    @PostMapping
    public Boolean insert(@RequestBody Article article) {
        return articleService.save(article);
    }

    /**
     * 修改数据
     *
     * @param article 实体对象
     * @return 修改结果
     */
    @PutMapping
    public Boolean update(@RequestBody Article article) {
        return articleService.updateById(article);
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public Boolean delete(@RequestParam("idList") List<Long> idList) {
        return articleService.removeByIds(idList);
    }
}

