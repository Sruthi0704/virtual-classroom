package com.anshul.virtual_classroom.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anshul.virtual_classroom.entity.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, String> {

}
