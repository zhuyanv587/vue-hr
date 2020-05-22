package com.example.vue.service;

import com.example.vue.mapper.MenuMapper;
import com.example.vue.mapper.MenuRoleMapper;
import com.example.vue.model.Menu;
import com.example.vue.utils.HrUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MenuService {
    @Resource
    MenuMapper menuMapper;
    @Resource
    MenuRoleMapper menuRoleMapper;

    public List<Menu> getMenusByHrId() {
        return menuMapper.getMenusByHrId(HrUtils.getCurrentHr().getId());
    }

    //    @Cacheable
    public List<Menu> getAllMenusWithRole() {
        return menuMapper.getAllMenusWithRole();
    }

    public List<Integer> getMidsByRid(Integer id) {
        return menuMapper.getMidsByRid(id);
    }

    @Transactional
    public boolean updateMenuRole(Integer rid, Integer[] mids) {
        menuRoleMapper.deleteByRid(rid);
        int num = menuRoleMapper.insertRecord(rid, mids);
        return num == mids.length;
    }
}
