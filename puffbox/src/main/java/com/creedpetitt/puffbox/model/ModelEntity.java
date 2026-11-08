package com.creedpetitt.puffbox.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("models")
public class ModelEntity {

    @Id
    private Long id;

    private Long userId;
    private String name;
    private String architecture; // e.g. "784-32-10"
    private Float finalLoss;
    private String weightPath;
    private Instant createdAt;
}
