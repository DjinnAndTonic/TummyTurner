package com.foodocs.controller;

import com.foodocs.core.MenuItem;
import com.foodocs.service.MenuDAO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name="foodAPI", description ="Food API")
public class HomeController {

    @Autowired
    private MenuDAO dao;

    @Operation(description="Get menu item by ID")
    @GetMapping("/{id}")
    public MenuItem getMenuItem(@PathVariable("id") int id) {
        MenuItem item = dao.getMenuItem(id);
        return item;
    }

    @GetMapping
    public List<MenuItem> getFullMenu() {
        List<MenuItem> menuItems = dao.getMenu().getMenuItemList();
        return menuItems;
    }
}
