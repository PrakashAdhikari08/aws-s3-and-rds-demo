package com.rdsaws.awsdb.dao;

import com.rdsaws.awsdb.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
