package com.example.homeinspection.converter;


import com.example.homeinspection.models.Item;
import com.example.homeinspection.repositories.ItemRepository;
import org.springframework.core.convert.converter.Converter;



public class ItemsByIdConverter implements Converter<String, Item> {
    private final ItemRepository itemRepo;

    public ItemsByIdConverter(ItemRepository itemRepo) {
        this.itemRepo = itemRepo;
    }

    @Override
    public Item convert(String id) {
        return itemRepo.findById(id).orElse(null);
    }
}
