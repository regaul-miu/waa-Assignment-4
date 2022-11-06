package com.miu.waa.Assignment3.service;

import com.miu.waa.Assignment3.domain.dto.CommentDto;
import com.miu.waa.Assignment3.domain.dto.PostDto;

import java.util.List;

public interface PostService {
    List<PostDto> getAllPosts();

    PostDto getPostById(long id);

    void save(PostDto postDto);

    void deleteById(long id);

    void addComment(long postId, CommentDto commentDto);

    List<CommentDto> getComments(long id);

    List<PostDto> findByTitleMatch(String title);
}
