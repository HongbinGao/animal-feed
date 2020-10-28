package com.animal.feed;

import com.animal.feed.dao.UserDao;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Service --- User
 *
 * @author wangyp
 * @since 27 October 2020
 */
@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public Object getUser() {
        return userDao.selectList(new QueryWrapper<>());
    }


}
