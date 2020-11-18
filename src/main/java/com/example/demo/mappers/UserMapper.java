
package com.example.demo.mappers;

import java.util.List;

import com.example.demo.domains.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * UserMapper
 */
@Mapper
public interface UserMapper {

    @Select("select id,nombre from usuario")
    public List<User> listar();
}