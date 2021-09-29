package com.cxw.server;


import com.cxw.pojo.User;
import java.util.List;

public interface UserServer {

    List<User>SelectByList();

    User selectById(String name);

}
