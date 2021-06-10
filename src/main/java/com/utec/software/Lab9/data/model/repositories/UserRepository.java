package com.utec.software.Lab9.data.model.repositories;

import com.utec.software.Lab9.data.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
    public Optional<UserEntity> findUserEntityByUsername(String username);
}
