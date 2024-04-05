package com.example.homeinspection.repositories;


import com.example.homeinspection.models.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface ItemRepository extends CrudRepository<Item, String>{

}