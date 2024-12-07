package Arrays;

import java.util.*;

//Set is the ordered collection of data and collects the data in a sorted manner.
//So, there won't be any problem while the output should be in sorted way.

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,1,2,2,4,6,6,12,52,6,7,8,9,9};
        int[] arr2 = {5,5,6,7,23,7,7,9,10,2,2,8,8,8,11};
        Set<Integer> set = new HashSet<>();
        for(int x : arr1){
            set.add(x);
        }
        for(int x : arr2){
            set.add(x);
        }
        System.out.println(set);

        System.out.println(unionUsingArrayList(arr1, arr2));

    }

    static List<Integer> unionUsingArrayList(int[] arr1, int[] arr2){
        ArrayList<Integer> list = new ArrayList<>();
        for(int x : arr1){
            if(!list.contains(x)){
                list.add(x);
            }
        }
        for(int x : arr2){
            if(!list.contains(x)){
                list.add(x);
            }
        }
        return list;
    }
}
