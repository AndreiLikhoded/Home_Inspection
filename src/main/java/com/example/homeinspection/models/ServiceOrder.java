package com.example.homeinspection.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Data
@Table
public class ServiceOrder {
    @Id
    private Long id;
    private Date createdAt;
    @NotBlank(message="client name is required")
    private String clientName;
    @NotBlank(message="Street is required")
    private String clientStreet;
    @NotBlank(message="client city is required")
    private String clientCity;
    @NotBlank(message="client state is required")
    private String clientState;
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order){
        this.orders.add(order);
    }
}
