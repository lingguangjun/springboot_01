package com.cxw.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cxw.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import javax.annotation.Resource;

@Mapper
@Resource
public interface UserMapper extends BaseMapper<User>{

}
