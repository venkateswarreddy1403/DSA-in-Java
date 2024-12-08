package Arrays;

import java.util.HashMap;

public class NumberThatAppearOnlyOnce {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,4,5,6,7,6,7,5};
        System.out.println(bruteSolution(arr));
        System.out.println(optimisedSolution(arr));
    }

    static int bruteSolution(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(int num : map.keySet()){
            if(map.get(num) == 1){
                return num;
            }
        }
        return -1;
    }
    static int optimisedSolution(int[] arr){
        int xor = 0;
        for(int i : arr){
            xor ^= i;
        }
        return xor;
    }
}
