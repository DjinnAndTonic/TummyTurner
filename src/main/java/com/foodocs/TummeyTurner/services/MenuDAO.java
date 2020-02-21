package com.foodocs.TummeyTurner.services;

public interface MenuDAO {
    public List<Menu> getMenu();
    public Menu getMenuItem(long id);
    public Menu getIngredients(long id);
    public void add(Menu menuItem);
    public void remove(Menu menuItem);
    public void update(Menu menuItem);
}
