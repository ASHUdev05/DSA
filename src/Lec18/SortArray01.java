/*
* Sort an array consisting of only 0s and 1s
* */
package Lec18;
import java.util.Scanner;

public class SortArray01 {
    void display(int[] X)
    {
        for (int i = 0; i < X.length; i++) {
            System.out.print(X[i]+" ");
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
        SortArray01 obj = new SortArray01();
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
                if(A[i] > A[j])
                    obj.swap(A, i, j);
            }
        }

        System.out.print("Sorted Array:");
        obj.display(A);
    }
}
