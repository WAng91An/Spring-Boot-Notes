package com.wrq.boot.repository;

import com.wrq.boot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wangqian on 2019/1/17.
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}
