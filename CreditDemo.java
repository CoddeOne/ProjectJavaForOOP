package com.company;

public class CreditDemo extends  Credit {
    private int demoTime;
    private int demoYears;
    private int demoMonth;
    CreditDemo(int a, int b, int c) {
        super(a, b, c);
        this.demoMonth = a;
        this.demoYears= b;
        this.demoTime=c;

    }
    public void setDemoTime(int demoTime) {
        this.demoTime = demoTime;
    }


    public void setDemoYears(int demoYears) {
        this.demoYears = demoYears;
    }


    public void setDemoMonth(int demoMonth) {
        this.demoMonth = demoMonth;
    }

    public int getDemoTime() {
        return demoTime;
    }

    public int getDemoYears() {
        return demoYears;
    }


    public int getDemoMonth() {
        return demoMonth;
    }
 void  test () {
        CreditDemo crDemo = new CreditDemo(100,20,98);
        crDemo.justToShow(200);
 }

    int justToShow (int a){
        Credit demo = new Credit(1,2,3);
        return demo.percentPerYear(12)*a;
    }
}
