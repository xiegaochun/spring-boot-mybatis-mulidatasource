package com.chun.service;

import com.chun.entity.UserEntity;
import com.chun.mapper.test2.User2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xiegaochun on 2018/1/17.
 */
@Service
public class User2Service {

    @Autowired
    private User2Mapper user2Mapper;

    public UserEntity getUser(Long id) {
        UserEntity user=user2Mapper.getOne(id);
        return user;
    }

    public void save(UserEntity user) {
        user2Mapper.insert(user);
    }


    public void update(UserEntity user) {
        user2Mapper.update(user);
    }
}
