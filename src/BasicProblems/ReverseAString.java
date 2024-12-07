package BasicProblems;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        StringBuilder res = new StringBuilder();
        int l = s.length()-1;
        while(l >= 0){
            res.append(s.charAt(l));
            l--;
        }
        System.out.println(res);
    }
}
