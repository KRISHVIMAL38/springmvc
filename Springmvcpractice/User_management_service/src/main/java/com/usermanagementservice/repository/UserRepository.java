package com.usermanagementservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.usermanagementservice.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	public User save(User user);
}
