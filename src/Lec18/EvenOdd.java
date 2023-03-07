/*
 *  Given an array of integers ‘a’, move all the even integers at the beginning of the array followed by
 *  all the odd integers. The relative order of odd or even integers does not matter.
 *  Return any array that satisfies
 *  the condition.
 * */
package Lec18;

import java.util.Scanner;

public class EvenOdd {
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

    boolean isEven(int number)
    {
        return number%2==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EvenOdd obj = new EvenOdd();
        System.out.println("Enter size:");
        int size = sc.nextInt();
        int[] A = new int[size];
        System.out.println("Enter elements:");
        for (int i=0; i<size; i++)
            A[i] = sc.nextInt();
        System.out.print("Original Array:");
        obj.display(A);

        int left = 0, right = size-1;
        while (left < right){
            if (!obj.isEven(A[left]) && obj.isEven(A[right]))
            {
                obj.swap(A, left, right);
                left++;
                right--;
            }
            if (obj.isEven(A[left])) left++;
            if (!obj.isEven(A[right])) right--;
        }

        System.out.print("Sorted Array:");
        obj.display(A);
    }
}
