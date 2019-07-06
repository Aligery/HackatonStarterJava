package ru.env.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import ru.env.DTO.SimpleTestUser;

import java.util.List;


@Mapper
public interface SimpleUserMapper {

    @Select("SELECT id, first_name, last_name FROM simple_user")
    List<SimpleTestUser> getAllUsers();

}
