package Lec19;

import java.util.Scanner;

public class PrefixSum {
    void display(int[] X)
    {
        for (int i = 0; i < X.length; i++) {
            System.out.print(X[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrefixSum obj = new PrefixSum();
        System.out.println("Enter size:");
        int size = sc.nextInt();
        int[] A = new int[size];
        System.out.println("Enter elements:");
        for (int i=0; i<size; i++)
            A[i] = sc.nextInt();
        System.out.print("Original Array:");
        obj.display(A);

        for (int i = 1; i < size; i++) {
            A[i] = A[i-1] + A[i];
        }

        System.out.print("Running Sum Array:");
        obj.display(A);
    }
}
