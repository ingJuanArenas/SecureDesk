package com.secure_desk.Domain.DTOs.Response;

import java.time.LocalDateTime;

public record DeviceDTO(
     String serialNumber,
     String model,
     LocalDateTime purchaseDate
) {}
