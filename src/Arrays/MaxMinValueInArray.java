package Arrays;
import java.util.*;
public class MaxMinValueInArray {
    public static void main(String[] args) {
        int[] arr = {12,5,8,69,25,78,350};
        System.out.println(Arrays.toString(minMax(arr)));
    }

    static int[] minMax(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for(int num : arr){
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }
        return new int[] {min,max};
    }
}
