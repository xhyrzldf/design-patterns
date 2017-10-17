package com.lambda;

import com.lambda.controller.Context;
import com.lambda.enums.StrategyEnum;

import static com.lambda.enums.StrategyEnum.ADD;
import static com.lambda.enums.StrategyEnum.MUL;
import static com.lambda.enums.StrategyEnum.SUB;

/**
 * <p>Description : design-pattern-module
 * <p>Date : 2017/10/17 16:13
 * <p>@author : Matrix [xhyrzldf@foxmail.com]
 */
public class Client {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        //add
        System.out.println(new Context(ADD).getResult(x, y));
        //sub
        System.out.println(new Context(SUB).getResult(x, y));
        //mul
        System.out.println(new Context(MUL).getResult(x, y));
    }
}
