package com.animal.feed.controller;

import com.animal.feed.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Controller --- user
 *
 * @author wangyp
 * @since 27 October 2020
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("v1")
    public Object get(String uid) {
        return userService.getUser();
    }


}
