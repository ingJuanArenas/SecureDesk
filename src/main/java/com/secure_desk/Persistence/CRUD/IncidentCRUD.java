package com.secure_desk.Persistence.CRUD;

import org.springframework.data.jpa.repository.JpaRepository;

import com.secure_desk.Persistence.Model.Incident;

public interface IncidentCRUD  extends JpaRepository<Incident, Long> {

    
} 