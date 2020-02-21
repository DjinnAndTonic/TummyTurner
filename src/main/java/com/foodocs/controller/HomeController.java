package com.foodocs.controller;

import com.foodocs.core.FoodCore;
import com.foodocs.InventoryProperties;
import com.foodocs.service.MenuDAO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Tag(name="foodAPI", description ="Food API")
public class HomeController {

    @Autowired
    private InventoryProperties inventoryProperties;

    @Autowired
    private MenuDAO dao;

    @Operation(description="Get menu item by ID")
    @GetMapping("/{id}")
    public String getMenuItem(@PathVariable("id") long id, Model model) {
        Collection<FoodCore> fullInventory = new ArrayList<>();
        fullInventory.add(dao.getMenuItem(id));
        model.addAttribute("item", fullInventory);
        return "search";
    }

    @GetMapping
    public String getFullMenu(Model model) {
        List<FoodCore> fullInventory = dao.getMenuItems().stream()
                .filter(p-> p.getID() <= inventoryProperties.getID())
                .filter(p-> p.getName() <= inventoryProperties.getName())
                .filter(p-> p.getPrice() <= inventoryProperties.getPrice())
                .filter(p-> p.getIngredients() <= inventoryProperties.getIngredients()).collect(Collectors.toList());
        model.addAttribute("menu", fullInventory);
        return "search";
    }
}
