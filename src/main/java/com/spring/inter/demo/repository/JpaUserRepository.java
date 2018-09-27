package com.spring.inter.demo.repository;

import com.spring.inter.demo.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<User,Long> {
}
