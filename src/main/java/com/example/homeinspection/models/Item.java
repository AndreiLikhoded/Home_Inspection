package com.example.homeinspection.models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class Item {
    @Id
    private final String id;
    private final String name;
    private final Type type;

    public enum Type {
        ROOF, CEILING, POOL, WALL, YARD_AND_GARDEN, FOUNDATION, ELECTRICAL
    }

}
