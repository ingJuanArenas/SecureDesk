package com.secure_desk.Persistence.CRUD;

import org.springframework.data.jpa.repository.JpaRepository;

import com.secure_desk.Persistence.Model.UserEntity;

public interface UserEntityCRUD  extends JpaRepository<UserEntity,Long>{
    
}
