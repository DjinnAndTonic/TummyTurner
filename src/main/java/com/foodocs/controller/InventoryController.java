package com.foodocs.controller;

import com.foodocs.core.Ingredient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Ingredient> getAll(@RequestParam("code") Optional<String> optional){
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
