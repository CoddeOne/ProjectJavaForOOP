package com.company;

public class Credit {
   private int month;
   private int number;
   private int years;

    Credit(int a, int b , int c){
      this.month=a;
      this.number=b;
      this.years=c;

    }

    public void setDemoMonth(int demoMonth) {
        this.month = demoMonth;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setDemoYears(int demoYears) {
        this.years = demoYears;
    }

    public int getDemoMonth() {
        return month;
    }

    public int getNumber() {
        return number;
    }

    public int getDemoYears() {
        return years;
    }

    void takeCredit(){
     int whole =  getNumber() / (getDemoYears() * 12 + getDemoMonth());
     int sum = whole /100 *15;
     System.out.println(sum);
    }
    void takeCredit(int years , int month, int sum){

        int whole =  sum / (years * 12 + month);
        int all = whole /100 *procent(years,month);
        System.out.println(all);
    }


    int procent(int a , int b){
        if(a*12 + b > 12){
            return 14;
        }
        return percentPerYear(a*12 + b);
    }

    int percentPerYear( int a){
        if(a<12){
            return  20;
        }
        return a;
    }

    double percentPerYear(double a,int sum){
        int summ = sum/100;
        return  summ * a;
    }

}