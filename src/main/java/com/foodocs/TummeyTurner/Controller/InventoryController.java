package com.foodocs.TummeyTurner.Controller;

import com.foodocs.TummeyTurner.InventoryProperties;
import com.foodocs.TummeyTurner.Repository.InventoryItem;
import com.foodocs.TummeyTurner.Service.IngredientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class InventoryController {

    @Autowired
    private InventoryProperties inventoryProperties;

    @Autowired
    private IngredientDAO dao;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<InventoryItem> getAll(@RequestParam("code") Optional<String> optional){
        String type = optional.orElse("rice");
        return ((Collection<InventoryItem>)dao.findAll()).stream()
                .filter(p-> p.getName().equalsIgnoreCase(type)).collect(Collectors.toList());
    }
}
