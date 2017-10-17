package com.tradition.controller;

import com.tradition.repository.Strategy;
import com.tradition.repository.impl.Add;
import com.tradition.repository.impl.Mul;
import com.tradition.repository.impl.Sub;

/**
 * <p>Description : design-pattern-module
 * <p>Date : 2017/10/17 15:22
 * <p>@author : Matrix [xhyrzldf@foxmail.com]
 */
public class Context {
    private Strategy strategy;

    public Context(String strategy) {
        switch (strategy) {
            case "add":
                this.strategy = new Add();
                break;
            case "sub":
                this.strategy = new Sub();
                break;
            default:
                this.strategy = new Mul();
                break;
        }

    }

    public int getResult(int x, int y) {
        return strategy.calclate(x, y);
    }
}
