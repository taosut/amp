package com.favccxx.amp.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.favccxx.amp.db.model.SysUser;

@Repository
public interface UserRepository extends JpaRepository<SysUser, Long> {

	SysUser findByUsername(String username);
}
