//made by Orbis (A.K. 7 gr)
package com.lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Function my = new Function();

        try{
            System.out.print("Enter positive integer k=");
            my.setK(in.nextInt());
            System.out.print("Enter x=");
            my.setX(in.nextDouble());
            System.out.println("According to Taylor: ln (1+x) = " + String.format("%.3f", my.logX()));
            System.out.println("According to built-in function: ln (1+x) = " + String.format("%.3f",my.MathFunc()));
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}