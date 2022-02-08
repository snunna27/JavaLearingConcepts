package com.dxc.java.overridding;
class Business{
    public void dealer1(String cloths,String electronics){
        System.out.println("dealer1 is selling cloths and electronics");
        System.out.println(cloths);
        System.out.println(electronics);
    }
    public void dealer2(String accessories){
        System.out.println("dealer2 is selling accessories");
        System.out.println(accessories);


    }

}
class FlipkartWholeSale extends Business{
    public void dealer1(String electronics,String cloths){
        System.out.println(" dealer1 selling the electronics and cloths is ");
        System.out.println(electronics);
        System.out.println(cloths);

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

        b.dealer2("watch");
        b.dealer1("pants","phone");
    }
}
