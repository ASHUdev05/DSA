/*
* For an array of integers return the first value that is repeating in the array
* */
package Lec16;
import java.util.Scanner;

public class Lec16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lec16 obj = new Lec16();
        System.out.println("Enter size:");
        int size = sc.nextInt();
        int[] A = new int[size];
        System.out.println("Enter elements:");
        for (int i=0; i<size; i++)
            A[i] = sc.nextInt();
        System.out.println(obj.repeatChecker(A));
    }
    int repeatChecker(int[] X)
    {
        for(int i=0; i<X.length; i++)
            for(int j=i+1; j<X.length;j++)
                if(X[i] == X[j])
                    return X[i];
        return -1;
    }
}
