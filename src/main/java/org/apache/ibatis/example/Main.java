package org.apache.ibatis.example;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

//docker run -itd --name mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root  mysql
//DROP DATABASE IF EXISTS MYBATIS;
//CREATE DATABASE MYBATIS;
//CREATE TABLE MYBATIS.USER (
//        ID INT PRIMARY KEY AUTO_INCREMENT,
//        NAME VARCHAR ( 255 ),
//        AGE INT,
//        KEY IDX_NAME ( NAME )
//        );
public class Main {
    public static void main(String[] args) throws IOException {
        String resource = "config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        IUserDao userDao = sqlSessionFactory.openSession().getMapper(IUserDao.class);
        System.out.println(userDao.selectById(1));
    }
}
