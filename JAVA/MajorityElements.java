/**
 * majorityelements
 */
import java.util.*;
public class MajorityElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int count = 0;
        int max = 0;
        int pos = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
                
                }
                if (count == max && max>0) {
                    if (a[pos] != a[i]) {
                        System.out.println("No majority element ");
                        System.exit(0);
                    }
                    max = count;
                    pos = i;
                    count = 0;
                    
                        
                    }
                    else if (count > max) {
                        max = count;
                        pos = i;
                        count = 0;
                    }
                    else {
                        count = 0;
                    }
            }
            System.out.println("The majority element is " + a[pos]);
            sc.close();
        }
    }