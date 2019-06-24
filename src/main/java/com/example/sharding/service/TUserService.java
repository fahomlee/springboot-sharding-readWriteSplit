package com.example.sharding.service;

import com.example.sharding.entity.TUser;

public interface TUserService {
    
    void insertTUser(TUser tUser);
    TUser queryTuser(Long id);
}