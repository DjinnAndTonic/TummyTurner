package com.foodocs.service;

import com.foodocs.core.Menu;
import com.foodocs.core.MenuItem;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class MenuDAOImpl implements MenuDAO{

    @PersistenceContext
    private EntityManager em;

    @Override
    public Menu getMenu() {

        Menu menu = new Menu();

        List<MenuItem> items = em.createQuery("FROM MenuItem").getResultList();
        menu.setMenuItemList(items);
        return menu;
    }

    @Override
    public MenuItem getMenuItem(int id) {

        return em.find(MenuItem.class, id);
    }

    @Override
    public MenuItem getIngredients(int id) {
        return null;
    }

    @Override
    public void add(MenuItem menuItem) {

    }

    @Override
    public void remove(MenuItem menuItem) {

    }

    @Override
    public void update(MenuItem menuItem) {

    }
}
