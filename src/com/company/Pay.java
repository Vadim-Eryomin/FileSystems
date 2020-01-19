package com.company;

public class Pay {
    private static int money;
    private static int cost;
    public static String info;

    public Pay() {
    }

    public static int getMoney() {
        return money;
    }

    public static void setMoney(int money) {
        Pay.money = money;
    }

    public static int getCost() {
        return cost;
    }

    public static void setCost(int cost) {
        Pay.cost = cost;
    }

    public static int pays(int money, int cost){
        if(money >= cost){
            money = money - cost;
            return money;
        }
        else if(money < cost){
            info = "недостаточно средств на счету";
        }
        return money;
    }
}
