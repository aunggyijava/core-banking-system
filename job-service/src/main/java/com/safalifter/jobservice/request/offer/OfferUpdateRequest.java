package com.safalifter.jobservice.request.offer;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class OfferUpdateRequest {
    @NotBlank(message = "Offer id is required")
    private String id;
    private int offeredPrice;
}
