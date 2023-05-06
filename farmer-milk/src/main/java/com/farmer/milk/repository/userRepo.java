package com.farmer.milk.repository;

import com.farmer.milk.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepo extends JpaRepository<UserDetails, Long> {
}
