package com.tradition.repository;


import com.tradition.domain.Kitchen;

/**
 * <p>Description : lambdaTest1
 * <p>Date : 2017/10/16 0:27
 * <p>@author : Matrix [xhyrzldf@foxmail.com]
 */
public class beerDuckCommand extends BaseCommand {

    public beerDuckCommand(Kitchen kitchen) {
        super(kitchen);
    }

    @Override
    public void executeCommand() {
       kitchen.beerDuck();
    }
}
