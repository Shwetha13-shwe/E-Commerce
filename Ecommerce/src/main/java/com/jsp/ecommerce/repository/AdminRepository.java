package com.jsp.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.ecommerce.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
  Boolean existsByEmail(String email);
}
