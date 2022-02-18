package com.dxc.java.decisionmaking;

public class TestContinue {
    public static void main(String[] args) {
        for (int billno = 1; billno <= 25; billno++) {
            System.out.println("discount applicable");

            // Check condition for continue
            if (billno >=25) {
                System.out.println("discount not applicable");
                // Using continue statement to skip the
                // execution of loop when above 25 billno
                continue;
            }
            // Printing elements to show continue statement
            System.out.print(billno + " ");
        }

    }
}
