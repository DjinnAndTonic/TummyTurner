package com.foodocs.TummeyTurner.Service;

import com.foodocs.TummeyTurner.Core.FoodCore;

import java.util.Collection;
import java.util.List;

public interface MenuDAO {
    public List<FoodCore> getFullInventory();
    public FoodCore getMenuItem(long id);
    public void add(FoodCore foodItem);

    Collection<Object> getMenuItems();
}
