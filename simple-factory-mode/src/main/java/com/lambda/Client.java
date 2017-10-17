package com.lambda;


import com.lambda.controller.adventFactory;
import com.lambda.repository.adventurer;

import static com.lambda.enums.adventEnum.*;

/**
 * <p>Description : design-pattern-module
 * <p>Date : 2017/10/18 5:23
 * <p>@author : Matrix [xhyrzldf@foxmail.com]
 */
@SuppressWarnings("Duplicates")
public class Client {
    public static void main(String[] args) {
        //通过冒险者工厂实例化出战士,冰霜法师,牧师
        adventurer warrior = adventFactory.createAdventurer(WARRIOR);
        adventurer frostMage = adventFactory.createAdventurer(MAGE_FROST);
        adventurer priest = adventFactory.createAdventurer(PRIESTS);
        //进入火焰洞窟
        System.out.println("================进入火焰洞窟================");
        warrior.useBattleSkill();
        frostMage.useBattleSkill();
        priest.useBattleSkill();
    }
}
