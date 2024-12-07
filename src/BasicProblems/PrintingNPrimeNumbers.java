package BasicProblems;

import java.util.Scanner;

public class PrintingNPrimeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = 1;
        while(n > 0){
            if(isPrime(x)){
                System.out.print(x + " ");
                n--;
            }
            x++;
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
