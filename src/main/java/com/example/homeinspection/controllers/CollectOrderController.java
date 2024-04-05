package com.example.homeinspection.controllers;

import com.example.homeinspection.models.Item;
import com.example.homeinspection.models.Item.*;
import com.example.homeinspection.models.Order;
import com.example.homeinspection.models.ServiceOrder;
import com.example.homeinspection.repositories.ItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Slf4j
@Controller
@RequestMapping("services-page")
public class CollectOrderController {
    private final ItemRepository itemRepo;

    public CollectOrderController(ItemRepository itemRepo) {
        this.itemRepo = itemRepo;
    }

    @ModelAttribute
    public void addItemsToModel(Model model){
        Iterable<Item> items = itemRepo.findAll();
        Type[] types = Item.Type.values();
        for(Type type:types){
            model.addAttribute(type.toString().toLowerCase(),
                    filterByType(items, type));
        }
    }
    @ModelAttribute(name="serviceOrder")
    public ServiceOrder service(){
        return new ServiceOrder();
    }
    @ModelAttribute(name="order")
    public Order order(){
        return new Order();
    }
    @GetMapping
    public String showCollectForm(){
        return "services-page";
    }
    @PostMapping
    public String processOrder(@Valid Order order, Errors errors,
                               @ModelAttribute ServiceOrder serviceOrder){
        if(errors.hasErrors()){
            return "services-page";
        }
        serviceOrder.addOrder(order);
        log.info("Processing order: {}", order);

        return "redirect:/orders/current";
    }

    private Iterable<Item> filterByType(
            Iterable<Item> items, Type type) {
        return StreamSupport.stream(items.spliterator(), false)
                .filter(x -> x.getType().equals(type))
                .collect(Collectors.toList());
    }
}
