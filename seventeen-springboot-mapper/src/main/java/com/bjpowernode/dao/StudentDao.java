package com.bjpowernode.dao;

import com.bjpowernode.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 临渊
 * @Date 2022-08-22 14:56
 */

/**
 *  告诉MyBatis这是dao接口, 会创建此接口的代理对象
 *      位置 : 类的上面
 */

@Mapper
public interface StudentDao {
    Student selectById(@Param("stuId") Integer id);
}
