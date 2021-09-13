/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Gianni Angelone
 */
package com.exercise;
import java.util.Scanner;
public class Exercise22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scan.nextInt();

        if (num1==num2){
            System.out.print("More than 1 value is the same");
            return;
        }else if (num2 == num3) {
            System.out.print("More than 1 value is the same");
            return;}
        else if (num3 == num1) {
            System.out.print("More than 1 value is the same");
            return;}


            if ((num1 > num2) && (num1 > num3)) {
                System.out.print(String.format("The largest number is: %d", num1));
            }
            if ((num2 > num1) && (num2 > num3)) {
                System.out.print(String.format("The largest number is: %d", num2));
            }
            if ((num3 > num2) && (num3 > num1)) {
                System.out.print(String.format("The largest number is: %d", num3));
            }
        }
    }
