package com.company;

public class Main {

    public static void main(String[] args) {
        /////
        Exchange dollar = new Exchange(34);
        Exchange euro = new Exchange(35);
        Exchange pln = new Exchange(7);
        Exchange jpy = new Exchange(3);
        Exchange.traiding(200,12,8);
        euro.trade(1200);
        pln.trade(100.50);
        jpy.realCost(1);
        dollar.realCost(1.75);
        ////
        Credit second = new Credit(3,8,1);
        second.takeCredit();
        second.takeCredit(5,6,100);
        second.percentPerYear(7);
        second.percentPerYear(9.92,1000);
        ////
        Deposit next = new Deposit(2,3);
        next.inDollars();
        next.inDollars();
        next.longTerm(3,1500);
        next.longTerm(1.37,2.220);
        Exchange a = new Exchange(2);
        int b = next.inGrn();
        System.out.println(b);
        ////
        CreditDemo dem = new CreditDemo(500,19,25);
        System.out.println("dawdwa" + dem.justToShow(2));

    }
}
