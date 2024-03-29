package com.example.sharding.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sharding.entity.TUser;
import com.example.sharding.mapper.TUserMapper;
import com.example.sharding.service.TUserService;

@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements TUserService {

    @Override
    public void insertTUser(TUser tUser) {
        save(tUser);
    }

    @Override
    public TUser queryTuser(Long id) {
        return getById(id);
    }
}
