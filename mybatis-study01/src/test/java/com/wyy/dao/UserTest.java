package com.wyy.dao;

import com.wyy.pojo.User;
import com.wyy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author WYY
 * @Description
 * @Date 2021/8/6 15:42
 * @ClassName UserTest
 */
public class UserTest {

    @Test
    public void test(){
        //获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao =sqlSession.getMapper(UserDao.class);
        List<User> list = userDao.selectUser();

        for (User user:list){
            System.out.println(user);
        }
    }
}
