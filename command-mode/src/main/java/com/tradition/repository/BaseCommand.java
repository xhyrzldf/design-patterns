package com.tradition.repository;


import com.tradition.domain.Kitchen;

/**
 * <p>Description : lambdaTest1
 * <p>Date : 2017/10/16 0:22
 * <p>@author : Matrix [xhyrzldf@foxmail.com]
 */
public abstract class BaseCommand {
    protected Kitchen kitchen;

    public BaseCommand(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    /**
     * 抽象命令,子类提供不同的实现
     */
    public abstract void executeCommand();
}
