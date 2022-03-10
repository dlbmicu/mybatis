package org.apache.ibatis.example;

import org.apache.ibatis.example.entity.UserDO;

/**
 * @author zhouhao
 * @date 2022/3/10
 */
public interface IUserDao {
    UserDO selectById(Integer id);
}
