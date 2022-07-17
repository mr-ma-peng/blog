package com.example.blog.controller;

import com.example.blog.dto.UserDTO;
import com.example.blog.entity.User;
import com.example.blog.service.UserService;
import com.example.blog.validator.UserDTOGroupA;
import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.groups.Default;

/**
 * 用户表(UserFriend)表控制层
 *
 * @author Peng Ma
 * @since 2022-07-14 21:53:55
 */
@Api(tags = "User")
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("owner")
    public String userParamsValidate(@RequestBody @Validated({UserDTOGroupA.class, Default.class}) UserDTO userDTO) {
        return userDTO.toString();
    }

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param user 查询实体
     * @return 所有数据
     */
//    @GetMapping
//    public R selectAll(Page<User> page, User user) {
//        return success(this.userService.page(page, new QueryWrapper<>(user)));
//    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
//    @GetMapping("{id}")
//    public R selectOne(@PathVariable Serializable id) {
//        return success(this.userService.getById(id));
//    }

    /**
     * 新增数据
     *
     * @param user 实体对象
     * @return 新增结果
     */
    @PostMapping
    public Boolean insert(@RequestBody User user) {
        return userService.save(user);
    }

    /**
     * 修改数据
     *
     * @param user 实体对象
     * @return 修改结果
     */
//    @PutMapping
//    public R update(@RequestBody User user) {
//        return success(this.userService.updateById(user));
//    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
//    @DeleteMapping
//    public R delete(@RequestParam("idList") List<Long> idList) {
//        return success(this.userService.removeByIds(idList));
//    }

}
