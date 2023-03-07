/*
* Given an integer array ‘a’ sorted in non-decreasing order, return an array of the squares of each
* number sorted in non-decreasing order.
* */

package Lec18;

import java.util.Scanner;

public class Square {
    void display(int[] X)
    {
        for (int i = 0; i < X.length; i++) {
            int x = X[i];
            System.out.print(x + " ");
        }
        System.out.println();
    }
    void swap(int[] X, int i, int j)
    {
        int temp = X[i];
        X[i] = X[j];
        X[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square obj = new Square();
        System.out.println("Enter size:");
        int size = sc.nextInt();
        int[] A = new int[size];
        System.out.println("Enter elements:");
        for (int i=0; i<size; i++)
            A[i] = sc.nextInt();
        System.out.print("Original Array:");
        obj.display(A);

        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if(Math.abs(A[i]) > Math.abs(A[j]))
                    obj.swap(A, i, j);
            }
        }

        for (int i = 0; i < size; i++) {
            A[i] = A[i] * A[i];
        }

        System.out.print("Sorted Array:");
        obj.display(A);
    }
}
