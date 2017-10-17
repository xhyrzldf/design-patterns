package com.lambda.enums;

import java.util.function.BinaryOperator;

/**
 * <p>Description : design-pattern-module
 * <p>Date : 2017/10/17 16:44
 * <p>@author : Matrix [xhyrzldf@foxmail.com]
 */
@SuppressWarnings("unused")
public enum StrategyEnum {
    ADD((x, y) -> x + y),
    SUB((x, y) -> x - y),
    MUL((x, y) -> x * y);

    private BinaryOperator<Integer> operator;

    StrategyEnum(BinaryOperator<Integer> operator) {
        this.operator = operator;
    }

    public BinaryOperator<Integer> get() {
        return operator;
    }
}
