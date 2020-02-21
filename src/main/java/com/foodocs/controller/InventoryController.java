package com.foodocs.controller;

import com.foodocs.InventoryProperties;
import com.foodocs.core.MenuItem;
import com.foodocs.service.IngredientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public List<MenuItem> getAll(@RequestParam("code") Optional<String> optional){
//        String type = optional.orElse("rice");
//        return ((core<MenuItem>)dao.findAll()).stream()
//                .filter(p-> p.getName().equalsIgnoreCase(type)).collect(Collectors.toList());

        List<MenuItem> dummyList = new ArrayList<>();
        dummyList.add(new MenuItem(9999, "testItemName", 12, null));

        return dummyList;
    }
}
