package com.yang.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    @Insert("insert user (username,password) values (#{username},#{password})")
    public int save(@Param("username") String username, @Param("password") String password);

    @Delete("delete from user where id=#{id}")
    public int delete(int id);
}
