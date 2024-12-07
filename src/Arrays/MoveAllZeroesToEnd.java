package Arrays;

import java.util.Arrays;

public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 0, 4, 3, 0, 5, 0};
        moveZeroes1(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {1,2,3,2,4,2,1};
        twoPointerApproach(arr2);
        System.out.println(Arrays.toString(arr2));
    }
    static void moveZeroes1(int[] arr){
        int i = 0;
        for(int num : arr){
            if(num != 0){
                arr[i] = num;
                i++;
            }
        }
        for(int x = i; x < arr.length; x++){
            arr[x] = 0;
        }
    }

    static void twoPointerApproach(int[] arr){
        int j = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }

        if(j == -1){
            return;
        }

        for (int i = j+1; i < arr.length ; i++) {
            if(arr[i] != 0){
                swap(arr, i, j);
                j++;
            }
        }
    }
    static void swap(int[] arr, int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
