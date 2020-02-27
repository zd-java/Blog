package com.zd.blog.service;

import com.zd.blog.po.Comment;

import java.util.List;

/**
 * @author 张东
 * @create 2020-02-26 12:04
 * @desc
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}
