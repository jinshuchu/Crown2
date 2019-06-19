package com.ruoyi.project.system.post.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ruoyi.framework.mapper.BaseMapper;
import com.ruoyi.project.system.post.domain.Post;

/**
 * 岗位信息 数据层
 *
 * @author ruoyi
 */
@Mapper
public interface PostMapper extends BaseMapper<Post> {

    /**
     * 根据用户ID查询岗位
     *
     * @param userId 用户ID
     * @return 岗位列表
     */
    List<Post> selectPostsByUserId(Long userId);

}
