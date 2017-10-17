package com.tradition.domain;


import com.tradition.repository.BaseCommand;
import com.tradition.repository.EggsWithTomatoesCommand;

import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.Queue;

/**
 * <p>Description : lambdaTest1
 * <p>Date : 2017/10/16 0:21
 * <p>@author : Matrix [xhyrzldf@foxmail.com]
 */
public class Waiter {
    /** 用于存储订单命令的队列 */
    private final Queue<BaseCommand> orders ;

    public  Waiter() {
        orders = new ArrayDeque<>();
    }

    /**
     * 添加订单
     * @param baseCommand 客户端传来的命令类,向上转型
     */
    public final void setOrders(BaseCommand baseCommand){
        // 简单的通过类名来判断是否是啤酒鸭,这里只是做一个演示效果
        if (baseCommand.getClass().getName().equals(EggsWithTomatoesCommand.class.getName())) {
            System.out.println("啤酒鸭卖完了，换一个点点吧!");
        } else {
            //成功添加的订单 控制打印日志 订单类型 : xxxx 时间 : xxxx
            String[] names = baseCommand.getClass().getName().split("\\.");
            System.out.printf("添加订单: %s 订单时间: %s \n", names[names.length - 1], LocalDateTime.now());
            orders.add(baseCommand);
        }
    }

    /**
     * 通知厨房开始做饭,遍历队列,做完了的订单移出队列
     */
    public final void notifyKitchen(){
        while (orders.peek() != null) {
            orders.peek().executeCommand();
            orders.remove();
        }
    }
}
