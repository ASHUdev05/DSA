package Lec18;

public class SortArray01_2pointer {
    public static void sortZeroesAndOne(int[] a) {
        int n = a.length;
        int i = 0;      // i -> left
        int j = n - 1;  // j -> right
        while (i < j) {
            if (a[i] == 1 && a[j] == 0) {
                a[i] = 0;
                a[j] = 1;
                i++;
                j--;
            }
            if (a[i] == 0) i++;
            if (a[j] == 1) j--;
        }
    }
    public static void main(String[] args){
        int[] a={0,1,1,0,1,1,0};
        sortZeroesAndOne(a);
        for (int element: a) {
            System.out.print(element + " ");
        }
    }
}
