package com.mic.mapper;

import com.mic.table.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MockUserMapper {
     int delete(int id);

    int Update(User user);

    int insertUser(User user);

    List<User> ListUser();

    List<User> findUserByName(String name);
}
