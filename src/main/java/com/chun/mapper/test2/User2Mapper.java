package com.chun.mapper.test2;

import com.chun.entity.UserEntity;

import java.util.List;

/**
 * Created by xiegaochun on 2018/1/17.
 */
public interface User2Mapper {
    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);
}
