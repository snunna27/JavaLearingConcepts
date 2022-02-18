package com.dxc.java.loops;

public class TestLoops {
    public static void main(String[] args) {

        int players = 20;
        int winners = 1;
        int[] speed = { 200, 250, 300, 270, 320 };
        int highest_speed = maximum(speed);

        // for loop
        for (int playerposition = 1; playerposition <=players; playerposition++) {
            System.out.println("playerpostion"+playerposition);
        }
        int totalfuel = 20, sum = 0;
        //while loop
        while (totalfuel <= 40) {
            sum = sum + totalfuel;
            totalfuel++;
        }
        System.out.println("Summation: " + sum);
        //do while
        do {

            System.out.println(" race winners positions is"+winners);
            winners++;
        }
        // test expression
        while (winners < 4);

        System.out.println("The highest speed is " + highest_speed);
    }
    public static int maximum(int[] numbers)
    {
        int maxSoFar = numbers[0];
        //for each
        for (int num : numbers)
        {
            if (num > maxSoFar)
            {
                maxSoFar = num;
            }
        }
        return maxSoFar;

    }
}
