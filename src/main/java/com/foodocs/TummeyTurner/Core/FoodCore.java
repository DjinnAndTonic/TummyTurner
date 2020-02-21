package com.foodocs.TummeyTurner.Core;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class FoodCore {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ITEMID")
    private long id;

    public long getId() {
        return id;
    }
}
