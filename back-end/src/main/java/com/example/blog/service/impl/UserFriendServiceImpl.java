package com.example.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.blog.dao.UserFriendDao;
import com.example.blog.entity.UserFriend;
import com.example.blog.service.UserFriendService;
import org.springframework.stereotype.Service;

/**
 * 好友表(UserFriend)表服务实现类
 *
 * @author makejava
 * @since 2022-07-14 21:53:55
 */
@Service("userFriendService")
public class UserFriendServiceImpl extends ServiceImpl<UserFriendDao, UserFriend> implements UserFriendService {

}

