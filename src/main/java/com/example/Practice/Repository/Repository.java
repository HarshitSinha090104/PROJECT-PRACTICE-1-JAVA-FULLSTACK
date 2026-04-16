package com.example.Practice.Repository;

import com.example.Practice.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<UserModel, Integer> {
}