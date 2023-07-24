package com.example.demospring.dao;

import com.example.demospring.entity.AppRole;
import com.example.demospring.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole,Long> {

    List<UserRole> getAllByAppUserUserId (Long id);
}
