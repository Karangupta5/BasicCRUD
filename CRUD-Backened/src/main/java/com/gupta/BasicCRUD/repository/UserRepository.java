package com.gupta.BasicCRUD.repository;

import com.gupta.BasicCRUD.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
