package com.secure_desk.Domain.DTOs.Response;

import java.time.LocalDateTime;

import com.secure_desk.Persistence.Model.IncidentPriority;
import com.secure_desk.Persistence.Model.IncidentStatus;
import com.secure_desk.Persistence.Model.IncidentType;


public record IncidentDTO(
     String title,
     String description,
     IncidentType type,
     IncidentStatus status,
     IncidentPriority priority,
     LocalDateTime createdAt,
     LocalDateTime updatedAt,
     Long device,
     Long reportedById,
     Long assignedToId
) {
}