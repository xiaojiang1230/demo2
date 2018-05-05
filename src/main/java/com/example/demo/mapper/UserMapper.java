package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * Created by xiaojiang on 2018/5/5.
 */
@Mapper
public interface UserMapper {
    String selectByPrimaryKey(int cid);
}
