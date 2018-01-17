package com.chun.web;

import com.chun.entity.UserEntity;
import com.chun.enums.UserSexEnum;
import com.chun.service.User1Service;
import com.chun.service.User2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by xiegaochun on 2018/1/17.
 */
@Service
@RestController
public class UserController {

    @Autowired
    private User1Service user1Service;

    @Autowired
    private User2Service user2Service;

    @RequestMapping("/getUsers")
    public List<UserEntity> getUsers() {
        List<UserEntity> users=user1Service.getUsers();
        return users;
    }

    @RequestMapping("/getUser")
    public UserEntity getUser(Long id) {
        UserEntity user=user2Service.getUser(id);
        return user;
    }

    @RequestMapping("/add")
    public void save(UserEntity user) {
        user2Service.save(user);
    }

    @RequestMapping(value="update2")
    public void update(UserEntity user) {
        user2Service.update(user);
    }

    @RequestMapping(value="/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        user1Service.delete(id);
    }

    //测试事物
    @RequestMapping(value="update1")
    public void updateTransactional(UserEntity user) {
        UserEntity user2 = new UserEntity();
        user2.setId(41L);
        user2.setNickName("test");
        user2.setPassWord("212434");
        user2.setUserName("kane");
        user2.setUserSex(UserSexEnum.WOMAN);
        user1Service.updateTransactional(user2);
    }
}
