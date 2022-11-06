package com.miu.waa.Assignment3.service;

import com.miu.waa.Assignment3.domain.dto.PostDto;
import com.miu.waa.Assignment3.domain.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getUsers();

    UserDto getUserById(long id);

    void save(UserDto userDto);

    void deleteById(long userId);

    List<UserDto> getUsersWithMoreThanNum(int num);

    List<PostDto> getAllPostByUserId(long userId);
}
