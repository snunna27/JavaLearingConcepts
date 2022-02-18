package com.dxc.java.decisionmaking;

import java.util.Scanner;

public class TestDecision {
    public static void main(String[] args){
        int n=0;

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the marks");
        int student=0;
       // int student= sc.nextInt();
        switch (student){

            case 1 :
                System.out.println("choose 1st student");
                break;


            case 2:
                System.out.println("choose 2nd student");
                break;


        }
        int marks=sc.nextInt();

        if(marks >= 50 && marks <= 160){


            System.out.println("Student qualify the enterence exam with"+marks);

        }
        else{
            System.out.println("student disqualify");
        }
    }

}
