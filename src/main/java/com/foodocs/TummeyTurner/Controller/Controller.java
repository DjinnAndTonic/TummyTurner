package com.foodocs.TummeyTurner.Controller;

import com.foodocs.TummeyTurner.Core.FoodCore;
import com.foodocs.TummeyTurner.InventoryProperties;
import com.foodocs.TummeyTurner.Service.MenuDAO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Collection;

@Tag(name="foodAPI", description ="Food API")
public class Controller {

    @Autowired
    private InventoryProperties planProperties;

    @Autowired
    private MenuDAO dao;

    @Operation(description="Get menu item by ID")
    @GetMapping("/{id}")
    public String getMenuItem(@PathVariable("id") long id, Model model) {
        Collection<FoodCore> fullInventory = new ArrayList<>();
        fullInventory.add(dao.getMenuItem(id));
        model.addAttribute("items", fullInventory);
        return "search";
    }
}
