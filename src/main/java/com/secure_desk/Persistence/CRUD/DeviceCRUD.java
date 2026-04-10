package com.secure_desk.Persistence.CRUD;

import org.springframework.data.jpa.repository.JpaRepository;

import com.secure_desk.Persistence.Model.Device;

public interface DeviceCRUD  extends JpaRepository<Device,Long>{

    
}