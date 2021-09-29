package com.cxw;

import com.cxw.mapper.UserMapper;
import com.cxw.pojo.User;
import com.cxw.server.UserServer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.List;
import java.util.Set;

@SpringBootTest
class SpringbootRedisApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserServer server;


    @Autowired
    RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
//        List<User> users = userMapper.selectList(null);
//        for (User user : users) {
//            System.out.println(user);
//        }
        Set<String> keys = redisTemplate.keys("*");
        System.out.println(keys);
    }

    @Test
    void redisTest(){
        List<User> users = server.SelectByList();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    void selectById(){
        User user = server.selectById("Tom");
        System.out.println(user);
    }

    @Test
    public void test(){
        User user = userMapper.selectById(1L);
        System.out.println(user);
    }

}
