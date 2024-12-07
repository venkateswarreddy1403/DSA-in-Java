package BasicProblems;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res = 0;
        int original = n;
        int x = (int)Math.log10(n)+1;
        while(n > 0){
            int r = n % 10;
            res += (int)Math.pow(r,x);
            n = n/10;
        }
        if(res == original){
            System.out.println("It is a Armstrong");
        }else{
            System.out.println("Not a Armstrong");
        }
    }
}
