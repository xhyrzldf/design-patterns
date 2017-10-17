package com.matrix;

import com.matrix.domain.Kitchen;
import com.matrix.domain.Waiter;
import com.matrix.repository.BaseCommand;
import com.matrix.repository.EggsWithTomatoesCommand;
import com.matrix.repository.beefRiceCommand;
import com.matrix.repository.beerDuckCommand;

/**
 * <p>Description : lambdaTest1
 * <p>Date : 2017/10/16 0:31
 * <p>@author : Matrix [xhyrzldf@foxmail.com]
 */
public class Client
{
    public static void main(String[] args) {
        //准备厨房,服务员,菜单命令工作
        Kitchen kitchen = new Kitchen();
        Waiter waiter = new Waiter();
        BaseCommand beefRiceCommand = new beefRiceCommand(kitchen);
        BaseCommand beerDuckCommand = new beerDuckCommand(kitchen);
        BaseCommand eggsWithTomatoesCommand = new EggsWithTomatoesCommand(kitchen);

        //开始营业
        System.out.println("=======================添加订单环节=======================");
        // 顾客：服务员 一份牛肉饭!
        waiter.setOrders(beefRiceCommand);
        // 顾客：服务员 一份啤酒鸭!
        waiter.setOrders(beerDuckCommand);
        // 顾客：服务员 一份西红柿炒鸡蛋!
        waiter.setOrders(eggsWithTomatoesCommand);
        // 顾客：服务员 两份啤酒鸭!
        waiter.setOrders(beerDuckCommand);
        waiter.setOrders(beerDuckCommand);

        System.out.println("==========服务员将订单送至厨房,厨房按照订单顺序开始做饭=========");
        //服务员通知厨房按照订单顺序开始做
        waiter.notifyKitchen();

    }
}
