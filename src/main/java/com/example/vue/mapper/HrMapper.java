package com.example.vue.mapper;

import com.example.vue.model.Hr;
import com.example.vue.model.Role;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface HrMapper {
    //    根据id来删除数据
    int deleteByPrimaryKey(Integer id);

    int insert(Hr record);

    int insertSelective(Hr record);

    Hr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hr record);

    int updateByPrimaryKey(Hr record);

    @Select("select * from hr where username=#{username}")
    Hr loadUserByUsername(String username);

    @Select("select r.* from role r, hr_role hrr where hrr.rid=r.id and hrr.hrid=#{id}")
    List<Role> getHrRolesById(Integer id);

    List<Hr> getAllHrs(@Param("hrid") Integer hrid, @Param("keywords") String keywords);

    @Update("update hr set enabled=#{enabled} where id=#{id}")
    int updateStatus(Integer id, Boolean enabled);
}