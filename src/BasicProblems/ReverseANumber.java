package BasicProblems;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res = 0;
        while(n > 0){
            int r = n % 10;
            res = (res*10) + r;
            n = n/10;
        }
        System.out.println(res);
    }
}
