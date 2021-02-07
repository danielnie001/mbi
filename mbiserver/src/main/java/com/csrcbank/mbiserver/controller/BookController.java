package com.csrcbank.mbiserver.controller;

import com.csrcbank.mbiserver.core.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Admin
 * @addTime : 13:47
 */
@RestController
public class BookController {

    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @GetMapping("/test")
    public void test(){
        ValueOperations<String ,String> ops1 = stringRedisTemplate.opsForValue();
        ops1.set("name","三国演义");
        String name = ops1.get("name");
        System.out.println(name);
        ValueOperations ops2 = redisTemplate.opsForValue();
        Book b1 = new Book();
        b1.setAuthor("罗贯中");
        b1.setName("三国演义");
        b1.setId(1);
        ops2.set("b1",b1);
        Book book = (Book) ops2.get("b1");
        System.out.println(book);
    }
}
