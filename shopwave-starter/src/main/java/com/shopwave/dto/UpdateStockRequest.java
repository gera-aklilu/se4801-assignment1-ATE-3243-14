// Name: Gerawork Aklilu
// ID: ATE/3243/14
package com.shopwave.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateStockRequest {
    @NotNull(message = "Delta value is required")
    private Integer delta;
}