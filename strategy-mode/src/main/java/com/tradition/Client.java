package com.tradition;

import com.tradition.controller.Context;

/**
 * Hello world!
 */
public class Client {
    public static void main(String[] args) {
        Context context;
        int x = 10;
        int y = 5;

        //add
        context = new Context("add");
        System.out.println(context.getResult(x, y));
        //sub
        context = new Context("sub");
        System.out.println(context.getResult(x, y));
        //mul
        context = new Context("mul");
        System.out.println(context.getResult(x, y));

    }
}
