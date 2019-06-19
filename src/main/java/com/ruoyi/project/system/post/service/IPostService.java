package com.ruoyi.project.system.post.service;

import java.util.List;

import com.ruoyi.framework.service.BaseService;
import com.ruoyi.project.system.post.domain.Post;

/**
 * 岗位信息 服务层
 *
 * @author ruoyi
 */
public interface IPostService extends BaseService<Post> {

    /**
     * 查询岗位信息集合
     *
     * @param post 岗位信息
     * @return 岗位信息集合
     */
    List<Post> selectPostList(Post post);


    /**
     * 根据用户ID查询岗位
     *
     * @param userId 用户ID
     * @return 岗位列表
     */
    List<Post> selectPostsByUserId(Long userId);


    /**
     * 批量删除岗位信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     * @throws Exception 异常
     */
    boolean deletePostByIds(String ids);

    /**
     * 校验岗位名称
     *
     * @param post 岗位信息
     * @return 结果
     */
    String checkPostNameUnique(Post post);

    /**
     * 校验岗位编码
     *
     * @param post 岗位信息
     * @return 结果
     */
    String checkPostCodeUnique(Post post);
}
