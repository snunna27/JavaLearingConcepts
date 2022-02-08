package com.dxc.java.exceptions;
class TestException
{
    public static <nullPointerException extends Throwable> void main(String args[])
    {
        try {
            int a = 30 / 0;

            System.out.println("Result = " + a);
        }


        catch(ArithmeticException e) {
            System.out.println ("Arithmetic exception");
        }
        try {
            String b="this is stringindexoutofboundsexception";
            char c=b.charAt(50);
            System.out.println(b);
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("StringificationException");
        }
        try {
            String d = null;
            System.out.println(d.charAt(0));
        }
        catch(NullPointerException e){
            System.out.println("nullpointerexception");
        }
        }
    }

