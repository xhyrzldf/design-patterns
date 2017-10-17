package com.lambda.controller;


import com.lambda.enums.StrategyEnum;

import java.util.function.BinaryOperator;

/**
 * <p>Description : design-pattern-module
 * <p>Date : 2017/10/17 15:22
 * <p>@author : Matrix [xhyrzldf@foxmail.com]
 */
public class Context {
    private StrategyEnum strategy;

    public Context(StrategyEnum strategy) {
        this.strategy = strategy;

    }

    public int getResult(int x, int y) {
        return strategy.get().apply(x, y);
    }
}
