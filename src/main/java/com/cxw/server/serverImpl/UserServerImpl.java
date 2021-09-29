package com.cxw.server.serverImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cxw.mapper.UserMapper;
import com.cxw.pojo.User;
import com.cxw.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class UserServerImpl implements UserServer {

    @Autowired
    UserMapper userMapper;

    @Autowired
    RedisTemplate redisTemplate;

    @Override
    public List<User> SelectByList() {
        List<User> users = userMapper.selectList(null);
        return users;
    }

    @Override
    @Cacheable(cacheNames ="user",key ="#name")
    public User selectById(String name) {
        User user = userMapper.selectOne(new QueryWrapper<User>().eq("name",name));
                //selectById(new QueryWrapper<User>().eq("name",name));
        return user;
    }

}
