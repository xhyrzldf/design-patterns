package com.tradition.repository;

/**
 * <p>Description : design-pattern-module
 * <p>Date : 2017/10/18 5:28
 * <p>@author : Matrix [xhyrzldf@foxmail.com]
 */
public class warrior implements adventurer {
    @Override
    public void useBattleSkill() {
        System.out.println("盾牌格挡!");
    }
}
