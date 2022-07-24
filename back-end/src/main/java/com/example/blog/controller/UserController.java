package com.example.blog.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.blog.converter.UserConverter;
import com.example.blog.dto.UserDTO;
import com.example.blog.entity.User;
import com.example.blog.service.UserService;
import com.example.blog.validator.UserDTOGroupA;
import io.swagger.annotations.Api;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.groups.Default;
import java.util.List;

/**
 * 用户表(User)表控制层
 *
 * @author Peng Ma
 * @since 2022-07-14 21:53:55
 */
@Api(tags = {"用户接口"})
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
     * @return 所有数据
     */
    @GetMapping
    public IPage<User> selectAll(Page<User> page) {
        return userService.page(page, null);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public UserDTO selectOne(@PathVariable Long id) {
        return UserConverter.INSTANCE.toDTO(userService.getById(id));
    }

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
    @PutMapping
    public Boolean update(@RequestBody User user) {
        return userService.updateById(user);
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public Boolean delete(@RequestParam("idList") List<Long> idList) {
        return userService.removeByIds(idList);
    }

}
