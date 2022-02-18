package com.dxc.java.overridding;
class Business{
    public void dealer1(String clothes,String electronics){
        System.out.println("dealer1 is selling clothes and electronics");
        System.out.println(clothes);
        System.out.println(electronics);
    }
    public void dealer2(String accessories){
        System.out.println("dealer2 is selling accessories");
        System.out.println(accessories);


    }

}
class FlipkartWholeSale extends Business{
    public void dealer1(String electronics,String sportswear ){
        System.out.println(" dealer1 selling the electronics and clothes is ");
        System.out.println(electronics);
       // System.out.println(clothes);
        System.out.println(sportswear);


    }
    public void dealer2(String Grocery){
        System.out.println("dealer2 selling the grocery is ");
        System.out.println(Grocery);
    }


}

public class TestOverridding {
    public static  void main(String[] args){
        Business b= new Business();
        Business b1=new FlipkartWholeSale();
        FlipkartWholeSale f=new FlipkartWholeSale();
        f.dealer2("salt");
                b1.dealer1("shirts","camera");
f.dealer1("laptop","t-shirt");
        b.dealer2("watch");
        b.dealer1("pants","phone");
    }
}
