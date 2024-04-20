package com.makhdoom.BMS.repository;

import com.makhdoom.BMS.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
