package com.wyy.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 * @Author WYY
 * @Description
 * @Date 2021/8/6 15:37
 * @ClassName MybatisUtils
 */
public class MybatisUtils {

    public static SqlSessionFactory sqlSessionFactory;
    static {
        String resources = "mybatis-config.xml";
        try {
            //获取对象
            InputStream inputStream = Resources.getResourceAsStream(resources);
            InputStreamReader reader = new InputStreamReader(inputStream, Charset.forName("GBK"));
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //有了SqlSessionFactory，我们可以从中获取SqlSession 的实例。SqlSession完全包含了面向对象数据库执行sql，命令所需的所有方法
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
