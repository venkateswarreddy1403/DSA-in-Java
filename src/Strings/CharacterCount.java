package Strings;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = s.length();
        System.out.println(charCount(s,n));

    }
    static String charCount(String s, int n){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        StringBuilder res = new StringBuilder();
        for (char ch : map.keySet()) {
            res.append(ch).append(map.get(ch));
        }
        return res.toString();
    }
}
