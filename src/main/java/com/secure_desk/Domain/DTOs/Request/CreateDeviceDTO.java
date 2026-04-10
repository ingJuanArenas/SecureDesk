package com.secure_desk.Domain.DTOs.Request;

public record CreateDeviceDTO(
     String serialNumber,
     String model
) {}