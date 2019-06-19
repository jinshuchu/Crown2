package com.ruoyi.project.system.role.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ruoyi.framework.mapper.BaseMapper;
import com.ruoyi.project.system.role.domain.RoleMenu;

/**
 * 角色与菜单关联表 数据层
 *
 * @author ruoyi
 */
@Mapper
public interface RoleMenuMapper extends BaseMapper<RoleMenu> {

    /**
     * 通过角色ID删除角色和菜单关联
     *
     * @param roleId 角色ID
     * @return 结果
     */
    int deleteRoleMenuByRoleId(Long roleId);

    /**
     * 批量删除角色菜单关联信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    int deleteRoleMenu(Long[] ids);

    /**
     * 批量新增角色菜单信息
     *
     * @param roleMenuList 角色菜单列表
     * @return 结果
     */
    int batchRoleMenu(List<RoleMenu> roleMenuList);
}
