package com.csrcbank.mbiserver;

import com.csrcbank.mbiserver.core.bean.SysUser;
import com.csrcbank.mbiserver.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MbiserverApplicationTests {

    @Autowired
    private UserDao userDao;
    @Test
    void contextLoads() {
        List<SysUser> userList = userDao.getAllUsers();
        System.out.println(userList);
    }

}
