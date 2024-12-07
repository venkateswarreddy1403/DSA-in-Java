package BasicProblems;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res = 1;
        for(int i = n; i > 0; i--){
            res *= i;
        }
        System.out.println(res);
    }
}
