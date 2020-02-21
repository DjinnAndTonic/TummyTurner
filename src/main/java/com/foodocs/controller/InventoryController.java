package com.foodocs.controller;

import com.foodocs.InventoryProperties;
import com.foodocs.core.Ingredient;
import com.foodocs.core.MenuItem;
import com.foodocs.service.IngredientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private InventoryProperties inventoryProperties;

//    @Autowired
//    private IngredientDAO dao;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Ingredient> getAll(@RequestParam("code") Optional<String> optional){
//        String type = optional.orElse("rice");
//        return ((core<MenuItem>)dao.findAll()).stream()
//                .filter(p-> p.getName().equalsIgnoreCase(type)).collect(Collectors.toList());
//
        List<Ingredient> dummyList = new ArrayList<>();
        dummyList.add(new Ingredient(1, "RICE"));
        dummyList.add(new Ingredient(2, "GARLIC"));
        dummyList.add(new Ingredient(3, "HAPPINESS"));

        return dummyList;
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Ingredient getIngredient(@PathVariable("id") Optional<String> optional){

        Ingredient ingredient = new Ingredient(1, "RICE");

        return ingredient;
    }


}
