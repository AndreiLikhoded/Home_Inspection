package com.example.homeinspection.repositories;


import com.example.homeinspection.models.ServiceOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<ServiceOrder, Long> {
}
