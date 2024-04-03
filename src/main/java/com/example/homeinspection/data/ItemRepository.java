package com.example.tacoex.data;

import com.example.tacoex.models.Ingredient;
import org.springframework.data.repository.CrudRepository;


public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {
}