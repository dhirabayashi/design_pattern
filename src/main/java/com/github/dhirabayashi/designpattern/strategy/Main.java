package com.github.dhirabayashi.designpattern.strategy;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Main randomSeed1 randomSeed2");
            System.out.println("Example: java Main 314 15");
            return;
        }

        int seed1 = Integer.parseInt(args[0]);
        int seed2 = Integer.parseInt(args[1]);
        Player taro = new Player("Taro", new WinningStrategy(seed1));
        Player hana = new Player("Hana", new ProbStrategy(seed2));
        for (int i = 0; i < 10000; i++) {
            Hand taroHand = taro.nextHand();
            Hand hanaHand = hana.nextHand();
            if (taroHand.isStrongerThan(hanaHand)) {
                System.out.println("Winner:" + taro);
                taro.win();
                hana.lose();
            } else if (hanaHand.isStrongerThan(taroHand)) {
                System.out.println("Winner:" + hana);
                taro.lose();
                hana.win();
            } else {
                System.out.println("Even…");
                taro.even();
                hana.even();
            }
        }

        System.out.println("Total result:");
        System.out.println(taro);
        System.out.println(hana);
    }
}