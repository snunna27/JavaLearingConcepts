package com.dxc.java.strings;

public class TestString {
    public static void main(String [] args){
        //creating a string by java string literal
        String name = " Hi Syam kumar,";
        //converting char array arraych[] to string str2
        char ch[] = {'y','o','u','r', ' ','p','r','o','d','u','c','t',' '};
        String greet= new String(ch);
        String str2= greet.concat("delivered");
        //creating another java string str3 by using new keyword
        String s= new String("thank you");
        StringBuffer s1=new StringBuffer("for ordering");

        System.out.println(name);
        System.out.println(str2);
        System.out.println(s);
        System.out.println(s1);
    }
}
