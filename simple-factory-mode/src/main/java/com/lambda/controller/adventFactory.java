package com.lambda.controller;

import com.lambda.enums.adventEnum;
import com.lambda.repository.adventurer;

/**
 * <p>Description : design-pattern-module
 * <p>Date : 2017/10/18 5:32
 * <p>@author : Matrix [xhyrzldf@foxmail.com]
 */
public class adventFactory {
    public static adventurer createAdventurer(adventEnum adventEnum) {
        return adventEnum.getConstructor().get();
    }
}
