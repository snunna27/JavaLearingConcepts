package com.dxc.java.methodoverloading;

public class TestOverloading {
    public void BankDetails(int account,String name){
        System.out.println("bank details is");
        System.out.println("account "+account);
        System.out.println("Name is "+name);
    }
    public void BankDetails(int account,String name,String address){
        System.out.println("bank details is");
        System.out.println("account  "  +account);
        System.out.println("Name is "+name);
        System.out.println("address is "+address);

    }
    public static void main(String[] args){
        TestOverloading t=new TestOverloading();
        t.BankDetails(13,"sam","ac123");
        t.BankDetails(12,"anil");
    }
}
