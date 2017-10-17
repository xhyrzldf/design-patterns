package com.tradition.controller;

import com.tradition.repository.adventurer;
import com.tradition.repository.frostMage;
import com.tradition.repository.priests;
import com.tradition.repository.warrior;

/**
 * <p>Description : design-pattern-module
 * <p>Date : 2017/10/18 5:32
 * <p>@author : Matrix [xhyrzldf@foxmail.com]
 */
public class adventFactory {

    public static adventurer createAdventurer(String professionType) {
        adventurer adventurer;
        switch (professionType) {
            case "战士":
                adventurer = new warrior();
                break;
            case "冰霜法师":
                adventurer = new frostMage();
                break;
            case "牧师":
                adventurer = new priests();
                break;
            default:
                throw new IllegalArgumentException("我们没这种职业!");
        }
        return adventurer;
    }
}
