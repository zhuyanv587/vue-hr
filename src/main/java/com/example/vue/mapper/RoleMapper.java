package com.example.vue.mapper;

import com.example.vue.model.Menu;
import com.example.vue.model.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    @Select("select * from role order by id")
    List<Role> getAllRoles();

    List<Menu> getAllMenus();
}