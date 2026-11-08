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
@Table("app_users")
public class User {

    @Id
    private Long id;

    private String username;
    private String password;
    private Instant createdAt;
}