//Made by Orbis (A.K. 7 group)
package com.lab2;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Matrix {
    int rows;
    int []lengths = new int [9];
    int columns;
    int[][] matrix;
    Matrix() {
        rows = 0;
        columns = 0;
        matrix = null;
    }
    public Matrix(final int rows, final int columns) {
        this.rows = rows;
        this.columns = columns;
        matrix = new int[rows][columns];
        Random rnd = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (1 + rnd.nextInt(9));
            }
        }
    }
    public int min() {
        int [] matrix2 = new int[rows*columns];
       // matrixCopy2 = new int[rows*columns];
        int count = 0;
        if (rows*columns == 1)
            return matrix[0][0];
        else {
            boolean min_found = false;
            int min = 10;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix2[count] = matrix[i][j];
                    count++;
                }
            }
            Arrays.sort(matrix2);
            int i1 = 0;
            while ((min_found == false) && (i1 < count - 1)) {
                if (matrix2[i1] != matrix2[i1 + 1]) {
                    min = matrix2[i1];
                    min_found = true;
                } else {
                    while ((i1 < count - 2) && (matrix2[i1] == matrix2[i1 + 1])) {
                        i1++;
                    }
                }
                if ((i1 == count - 1) && (min_found == false)) {
                    min = matrix2[i1];
                    min_found = true;
                }
                i1++;
            }
            if (min != 10)
                return min;
            else {
                int min_length = rows * columns;
                int length = 1;
                i1 = 0;
                while (i1 < count) {
                    length = 1;
                    while ((i1 < count - 1) && (matrix2[i1] == matrix2[i1 + 1])) {
                        i1++;
                        length++;
                    }
                    lengths[matrix2[i1 - 1] - 1] = length;
                    if (length < min_length) {
                        min_length = length;
                        min = matrix2[i1 - 1];
                    }
                    i1++;
                }
                return min;
            }
        }
    }
    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}