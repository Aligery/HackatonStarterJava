package ru.env.mapper;

import org.apache.ibatis.annotations.*;
import ru.env.DTO.Product;
import ru.env.DTO.SimpleTestUser;
import ru.env.DTO.UsersWithProducts;

import java.util.List;


@Mapper
public interface SimpleUserMapper {

    @Select("SELECT id, first_name as firstName, last_name as lastName FROM simple_user")
    List<SimpleTestUser> getAllUsers();



    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "firstName", column = "first_name"),
            @Result(property = "lastName", column = "last_name"),
            @Result(property = "products",
                    javaType = List.class,
                    column = "id",
                    many = @Many(select = "getProductById"))
    })
    @Select("select distinct * from simple_user")
    List<UsersWithProducts> getUsersWithProducts();



    @Results({
            @Result(property = "typeProduct", column = "type_product"),
            @Result(property = "price", column = "price")
    })
    @Select("select type_product, price from products where user_id = #{id}")
    Product getProductById(@Param("user_id") long id);
}
