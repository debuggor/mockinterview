package com.debuggor.mockinterview.forum.dao;

import com.debuggor.mockinterview.forum.bean.Forum;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ForumDao {

    /**
     * 帖子列表
     *
     * @param post
     * @return
     */
    List<Forum> getPostList(Forum post);
}