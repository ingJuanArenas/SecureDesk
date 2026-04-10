package com.secure_desk.Domain.DTOs.Request;


import com.secure_desk.Persistence.Model.IncidentPriority;
import com.secure_desk.Persistence.Model.IncidentStatus;
import com.secure_desk.Persistence.Model.IncidentType;


public record CreateIncidentDTO(
     String title,
     String description,
     IncidentType type,
     IncidentStatus status,
     IncidentPriority priority,
     Long deviceId,
     Long reportedById
) {
}