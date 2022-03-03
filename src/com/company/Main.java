/*
    Java Session Tasks
    Task 01
    SE/2019/049
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static int getAddition(int num1, int num2){
        int total = num1 + num2;
        return total;
    } //getAddition method

    public static int getSubtraction(int num1, int num2){
        int differ = num1 - num2;
        return differ;
    } //getSubtraction method

    public static int getMultiplication(int num1, int num2){
        int product = num1 * num2;
        return product;
    } //getMultiplication method

    public static float getDivision(int num1, int num2){
        float divide = (float)num1 / num2;
        return divide;
    } //getDivision method




    public static void main(String[] args) {

        System.out.println("------- Hello! --------");
        System.out.println("What do you want to do?");
        System.out.println("   Enter 1 to add ");
        System.out.println("   Enter 2 to subtract ");
        System.out.println("   Enter 3 to multiply ");
        System.out.println("   Enter 1 to divide ");

        //Input Section
        System.out.print("Enter your option (1/2/3/4) : ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        System.out.println();

        System.out.print("Enter number 01 : ");
        int no1 = input.nextInt();
        System.out.print("Enter number 02 : ");
        int no2 = input.nextInt();


        //Output Section
        if(choice == 1) {
            System.out.println("Value of number 01 + number 02 : " + getAddition(no1,no2));
        }else if(choice == 2) {
            System.out.println("Value of number 01 - number 02 : " + getSubtraction(no1,no2));
        }else if(choice == 3) {
            System.out.println("Value of number 01 * number 02 :" + getMultiplication(no1,no2));
        }else if(choice == 4) {
            System.out.println("Value of number 01/number 02   : " + getDivision(no1,no2));
        }else{
            System.out.println("Invalid Option!");
        }


    }
}
