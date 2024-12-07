package BasicProblems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
//        in.next();
        int n = in.nextInt();
        System.out.println(palindromeNumber(n));
        System.out.println(palindromeString(s));
    }
    static boolean palindromeNumber(int n){
        int res = 0, temp = n;
        while(n > 0){
            int r = n % 10;
            res = res*10 + r;
            n = n/10;
        }
        return res == temp;
    }
    static boolean palindromeString(String s){
        int l = 0, r = s.length()-1;
        while(l <= r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
