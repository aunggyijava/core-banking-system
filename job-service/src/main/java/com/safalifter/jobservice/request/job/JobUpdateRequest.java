package com.safalifter.jobservice.request.job;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class JobUpdateRequest {
    @NotBlank(message = "Job id is required")
    private String id;
    private String name;
    private String description;
    private String categoryId;
    private String[] keys;
}