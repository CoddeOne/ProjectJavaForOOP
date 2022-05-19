package com.company;

public class Exchange {
    private int number;


    public int getNumber() {
        return number;
    }



    public void setNumber(int number) {
        this.number = number;
    }



    Exchange(int a) {
       this.number = a;
    }
    void trade(int a){
        int sum = a*getNumber();
        System.out.println(sum);
    }


      void trade(double a) {
        double sum = a * getNumber();
        System.out.println(sum);
    }



         int realCost(int a ){
             int real = (getNumber() * a);
             double pr = real/100*2;
             return (int) pr;
    }

    int realCost(double a) {
     int real = (int) (getNumber() * a);
        double pr = real/100*2;
        return (int) pr;
    }
   static int traiding(double a , int b , int c) {
        int real = (int) (a * b*c);
        double pr = real/100*2;
        return (int) pr;
    }


}


