package com.bjpowernode.controller;

import com.bjpowernode.vo.Student;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author 临渊
 * @Date 2022-08-23 11:35
 */

@RestController
public class RedisController {

    /**
     *  注入RedisTemplate
     *          RedisTemplate<String, String>
     *          RedisTemplate<Object, Object>
     *          RedisTemplate
     *
     *        注意 RedisTemplate  的名称就是 redisTemplate
     *
     */
    @Resource
    private RedisTemplate redisTemplate;
    @Resource
    private StringRedisTemplate stringRedisTemplate;


    // 添加数据到redis
    @PostMapping("/redis/addstring")
    public String addToRedis(String name, String value) {
        // 操作Redis中的String类型的数据
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set("myname", "T");
        return "向redis添加string类型的数据";
    }

    // 从redis获取数据
    @GetMapping("/redis/getk")
    public String getDate(String k) {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        Object v = valueOperations.get(k);
        return "key " + k + " value = " + v;
    }


    @PostMapping("/redis/{k}/{v}")
    public String addStringKV(@PathVariable String k,
                              @PathVariable String v) {
        // 使用StringRedisTemplate
        stringRedisTemplate.opsForValue().set(k, v);
        return "使用StingRedisTemplate对象";
    }

    @GetMapping("/redis/getstr/{k}")
    public String getStringValue(@PathVariable String k) {
        // 使用StringRedisTemplate
        String v = stringRedisTemplate.opsForValue().get(k);
        return "使用StingRedisTemplate对象 " + v;
    }

    /**
     *     设置RedisTemplate 序列化
     *          可以设置key 也可以设置value
     *              也可以两个同时设置
     */

    @PostMapping("/redis/addstr")
    public String addString(String k, String v) {
        // 使用RedisTemplate
        // 设置key使用String的序列化
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        // 设置value的序列化
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        redisTemplate.opsForValue().set(k, v);
        return "定义RedisTemplate独享额key和value的序列化";
    }

    /**
     * 使用json序列化 将java对象转为json存储
     */
    @PostMapping("/redis/addjson")
    public String addJson() {
        Student student = new Student();
        student.setId(516);
        student.setName("TW");
        student.setAge(17);
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        // 把值作为json的序列化
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(Student.class));
        redisTemplate.opsForValue().set("mylike", student);
        return "Json序列化";
    }

    @PostMapping("/redis/getjson")
    public String getJson() {
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        // 把值作为json的序列化
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(Student.class));
        Object obj = redisTemplate.opsForValue().get("mylike");

        return "Json反序列化 = " + obj;
    }

}
