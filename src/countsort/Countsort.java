package countsort;

import java.util.Scanner;
public class Countsort {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int [n];
        for(int i=0;i<n;i++) {
            ar[i]=sc.nextInt();

        }
        int temp=0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n ; j++) {
                if (ar[i] >ar[j ]) {
                    temp = ar[i];
                    ar[i] = ar[j ];
                    ar[j ] = temp;
                }

            }

        }System.out.println();

        for(int i=0;i<n;i++) {
            System.out.print(ar[i]+" ");
}
    }
}