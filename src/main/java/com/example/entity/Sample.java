package com.example.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Sample", uniqueConstraints = {
        @UniqueConstraint(name = "uc_sample_id", columnNames = {"id"})
})
@Data
public class Sample {
    @Id
    @GeneratedValue
    private int id;
    private String name;
}
