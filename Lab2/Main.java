package com.lab2;

import com.lab2.Matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter rows :");
            int rows = scan.nextInt();
            System.out.println("Enter columns :");
            int columns = scan.nextInt();
            if ((rows<=0) || (columns<=0)) throw new Exception ("Rows and columns must be >0");
            Matrix m = new Matrix(rows, columns);
            System.out.println("Your matrix :");
            m.print();
            int res;
            res = m.min();
            for (int i = 0; i<9;i++)
            {
                System.out.println(i+1+" meets: " + m.lengths[i] + " times");
            }
            System.out.println("Min element = " + m.min());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}