package BasicProblems;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        System.out.println(bruteSolution(str1, str2));

    }
    static boolean bruteSolution(String s1, String s2){
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        return Arrays.equals(s1Array, s2Array);
    }

    static boolean betterSolution(String s1, String s2){
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char ch : s1.toCharArray())
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        for (char ch : s2.toCharArray())
            charCount.put(ch, charCount.getOrDefault(ch, 0) - 1);
        for (var pair : charCount.entrySet()) {
            if (pair.getValue() != 0) {
                return false;
            }
        }
        return true;
    }

    static boolean optimalSolution(String s1, String s2){
        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++)
            freq[s1.charAt(i) - 'a']++;
        for (int i = 0; i < s2.length(); i++)
            freq[s2.charAt(i) - 'a']--;
        for (int count : freq) {
            if (count != 0)
                return false;
        }
        return true;
    }
}
