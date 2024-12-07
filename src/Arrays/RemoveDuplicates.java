package Arrays;
import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,5,5,5,6,6,7,8,8,9,9,9};
        System.out.println(removeDuplicates(arr));
    }
    static List<Integer> removeDuplicates(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int j = 0;
        for(int i = 1; i < n; i++){
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        for(int i = 0; i < j+1; i++){
            list.add(arr[i]);
        }
        return list;
    }
}
