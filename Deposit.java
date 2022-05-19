package com.company;

public class Deposit {
    private int number;
    private int time;


    Deposit(int a, int b ){
        this.number =a;
        this.time=b;
    }

     void inEuro(){
         double sum =  getNumber() * 1.3 * getTime();
         System.out.println(sum);
    }

     void inDollars(){
        double sum =  getNumber() * 0.99 * getTime();
        System.out.println(sum);
    }

    public int getNumber() {
        return number;
    }

    public int getTime() {
        return time;
    }



    public void setNumber(int number) {
        this.number = number;
    }

    public void setTime(int b) {
        this.time = time;
    }

    int inGrn(){
        return getNumber() * 35  * 8;
    }

    int longTerm(int years, int amount){
        if(years > 1){
           return amount * years;
        }
        else{
            return (int) (amount * 0.94);
        }
    }

     double longTerm(double a, double b ){
        return (double) Math.round(a);
    }
}
