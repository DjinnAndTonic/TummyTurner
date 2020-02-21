package com.foodocs.TummeyTurner.services;

import com.foodocs.TummeyTurner.core.Menu;

public interface MenuDAO {
    public List<Menu> getMenu();
    public Menu getMenuItem(long id);
    public Menu getIngredients(long id);
    public void add(Menu menuItem);
    public void remove(Menu menuItem);
    public void update(Menu menuItem);
}
