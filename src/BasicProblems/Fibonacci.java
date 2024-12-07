package BasicProblems;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        regularMethod(n);
        System.out.println();
        System.out.print("0 1");
        usingRecursion(n-2, 0, 1);

    }
    static void regularMethod(int n){
        int n1 = 0, n2 = 1;
        System.out.print(0+" "+1 +" ");
        n = n-2;
        while(n > 0){
            int res = n1+n2;
            n1 = n2;
            n2 = res;
            n--;
            System.out.print(res + " ");
        }
    }

    static void usingRecursion(int n, int n1, int n2){
        if(n>0){
            int res = n1 + n2;
            System.out.print(" "+res);
            usingRecursion(n-1, n2, res);
        }
    }
}
