package com.miu.waa.Assignment4.repo;

import com.miu.waa.Assignment4.domain.Post;
import com.miu.waa.Assignment4.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    @Query(value = "select u from User u where u.posts.size>:num")
    List<User> getUsersWithMoreThanNum(int num);

    @Query(value = "select u.posts from User u where u.id = :userId")
    List<Post> getAllPostByUserId(long userId);
}
