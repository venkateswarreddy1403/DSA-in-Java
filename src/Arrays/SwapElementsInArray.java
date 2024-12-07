package Arrays;

import java.util.Arrays;

public class SwapElementsInArray {
    public static void main(String[] args) {
        int[] arr = {15,565,48,65,6,8,18,64,69,78};
        swap(arr, 5,4);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
