package com.example.homeinspection.models;

import lombok.Data;
import javax.validation.constraints.*;
import java.util.Date;
import java.util.List;

@Data
public class Order {
    private long id;
    private Date orderedAt = new Date();
    @NotNull
    @Size(min=5, message="Name must be at least 5 characters long")
    private String additionalInformation;
    @NotNull
    @Size(min=1, message="You must choose at least 1 order")
    private List<ItemRef> items;
}
