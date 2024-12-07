package BasicProblems;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                res += i;
            }
        }
        if(res == n){
            System.out.println("It is perfect number");
        }else{
            System.out.println("It is not a perfect number");
        }
    }
}
