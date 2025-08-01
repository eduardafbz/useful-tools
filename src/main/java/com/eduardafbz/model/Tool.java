package com.eduardafbz.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tools")
public class Tool {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    @Column(nullable = false)
    @JsonProperty("name")
    private String name;

    @JsonProperty("link")
    private String link;

    @JsonProperty("description")
    private String description;

    @ElementCollection //armazena uma lista simples
    @JsonProperty("tags")
    private String tags;
    
}
