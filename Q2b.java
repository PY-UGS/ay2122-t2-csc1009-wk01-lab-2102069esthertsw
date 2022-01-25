package com.esther.lab.wk01;

import java.util.Scanner;

public class Q2b {
    public static void main(String arg[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your module code: ");
        String moduleCode = input.next();
        switch(moduleCode)
        {
            case "CSC1006":
                System.out.println("Mathematics 2");
                break;
            case "CSC1007":
                System.out.println("Operating Systems");
                break;
            case "CSC1008":
                System.out.println("Data Structure & Algorithm");
                break;
            case "CSC1009":
                System.out.println("Object-Oriented Programming");
                break;
            case "CSC1010":
                System.out.println("Computer Networks");
                break;
        }
    }
}
