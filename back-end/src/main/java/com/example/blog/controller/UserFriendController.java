package com.example.blog.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.blog.entity.UserFriend;
import com.example.blog.service.UserFriendService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 好友表(UserFriend)表控制层
 *
 * @author Peng Ma
 * @since 2022-07-14 21:53:55
 */
@Api(tags = "UserFriend")
@RestController
@RequestMapping("userFriend")
public class UserFriendController {
    /**
     * 服务对象
     */
    @Resource
    private UserFriendService userFriendService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @return 所有数据
     */
    @GetMapping
    public IPage<UserFriend> selectAll(Page<UserFriend> page) {
        return userFriendService.page(page, null);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public UserFriend selectOne(@PathVariable Serializable id) {
        return userFriendService.getById(id);
    }

    /**
     * 新增数据
     *
     * @param userFriend 实体对象
     * @return 新增结果
     */
    @PostMapping
    public Boolean insert(@RequestBody UserFriend userFriend) {
        return userFriendService.save(userFriend);
    }

    /**
     * 修改数据
     *
     * @param userFriend 实体对象
     * @return 修改结果
     */
    @PutMapping
    public Boolean update(@RequestBody UserFriend userFriend) {
        return userFriendService.updateById(userFriend);
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public Boolean delete(@RequestParam("idList") List<Long> idList) {
        return userFriendService.removeByIds(idList);
    }
}

