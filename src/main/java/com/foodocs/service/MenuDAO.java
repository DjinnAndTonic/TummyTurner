package com.foodocs.service;

import com.foodocs.core.Menu;
import com.foodocs.core.MenuItem;

import java.util.List;

public interface MenuDAO {
    public Menu getMenu();
    public MenuItem getMenuItem(long id);
    public MenuItem getIngredients(long id);
    public void add(MenuItem menuItem);
    public void remove(MenuItem menuItem);
    public void update(MenuItem menuItem);
}