package com.tradition;

import com.tradition.repository.adventurer;
import com.tradition.controller.adventFactory;

/**
 * <p>Description : design-pattern-module
 * <p>Date : 2017/10/18 5:23
 * <p>@author : Matrix [xhyrzldf@foxmail.com]
 */
public class Client {
    public static void main(String[] args) {
        //通过冒险者工厂实例化出战士,冰霜法师,牧师
        adventurer warrior = adventFactory.createAdventurer("战士");
        adventurer frostMage = adventFactory.createAdventurer("冰霜法师");
        adventurer priest = adventFactory.createAdventurer("牧师");
        //进入火焰洞窟
        System.out.println("================进入火焰洞窟================");
        warrior.useBattleSkill();
        frostMage.useBattleSkill();
        priest.useBattleSkill();
    }
}
