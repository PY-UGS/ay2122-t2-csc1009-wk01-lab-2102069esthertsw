package com.esther.lab.wk01;

import java.util.Scanner;

public class Q2c {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your maximum and minimum integer, separated by a space: ");
        int max = input.nextInt();
        int min = input.nextInt();

        for(int x = max; x>=min; x=x-2)
        {
            System.out.println("value of x: " + x );
        }
    }
}
