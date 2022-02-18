package com.dxc.java.arrays;

class Wallet {
    int hdfccard;
    int sbicard;
    int iciccard;
    int money;
    String paper;

    public Wallet(int hdfccard,int sbicard,int iciccard, int money,String paper) {
        this.hdfccard = hdfccard;
        this.sbicard = sbicard;
        this.iciccard= iciccard;
        this.money = money;
        this.paper=paper;
    }

}
class cards{
    public static void main(String args[]) {
        Wallet[] array = new Wallet[1];
        array[0] = new Wallet(50000,20000,5000,2000,"adharcopy");

        for(int i=0;i<array.length;i++){
            System.out.println("wallet: " + " "+ "hdfccard:" +
                    array[i].hdfccard +" "+"sbicard:" + " "+ array[i].sbicard + " " +"iciccard:" +" "+array[i].iciccard +" "+"money:" +" "+array[i].money + " "+"paper:" +" "+array[i].paper);
        }


    }
}