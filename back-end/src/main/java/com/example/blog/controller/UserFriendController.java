package com.example.blog.controller;


import com.example.blog.service.UserFriendService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
     * @param userFriend 查询实体
     * @return 所有数据
     */
//    @GetMapping
//    public R selectAll(Page<UserFriend> page, UserFriend userFriend) {
//        return success(this.userFriendService.page(page, new QueryWrapper<>(userFriend)));
//    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
//    @GetMapping("{id}")
//    public R selectOne(@PathVariable Serializable id) {
//        return success(this.userFriendService.getById(id));
//    }

    /**
     * 新增数据
     *
     * @param userFriend 实体对象
     * @return 新增结果
     */
//    @PostMapping
//    public R insert(@RequestBody UserFriend userFriend) {
//        return success(this.userFriendService.save(userFriend));
//    }

    /**
     * 修改数据
     *
     * @param userFriend 实体对象
     * @return 修改结果
     */
//    @PutMapping
//    public R update(@RequestBody UserFriend userFriend) {
//        return success(this.userFriendService.updateById(userFriend));
//    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
//    @DeleteMapping
//    public R delete(@RequestParam("idList") List<Long> idList) {
//        return success(this.userFriendService.removeByIds(idList));
//    }
}

