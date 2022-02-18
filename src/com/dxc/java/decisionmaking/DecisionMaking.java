package com.dxc.java.decisionmaking;

import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
        int india;
        boolean w = true;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter score\n");
        int score=sc.nextInt();


        if (score>200) {
            System.out.println("india scored "+score);
        }

        else {
            System.out.println("india scored below" +score  +w);
        }

        }


}