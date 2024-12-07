package BasicProblems;

import java.util.Scanner;

public class FindingAndPrintingPrimes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <= n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
