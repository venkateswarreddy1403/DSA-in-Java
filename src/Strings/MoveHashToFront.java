package Strings;

import java.util.Scanner;

public class MoveHashToFront {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = s.length();
        System.out.println(moveHash(s, n));
    }

    static StringBuilder moveHash(String s, int n){
        StringBuilder res = new StringBuilder();
        int count = 0;
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch == '#'){
                count++;
            }
        }
        while(count > 0){
            res.append("#");
            count--;
        }

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch != '#'){
                res.append(ch);
            }
        }
        return res;
    }

    //With less number of steps

    static String moveHashFront(String s) {
        StringBuilder hashPart = new StringBuilder();
        StringBuilder nonHashPart = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                hashPart.append(ch);
            } else {
                nonHashPart.append(ch);
            }
        }

        return hashPart.append(nonHashPart).toString();
    }
}
