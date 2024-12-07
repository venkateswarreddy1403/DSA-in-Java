package Arrays;

import java.util.Arrays;

public class LeftRotateAnArrayByKPlaces {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int d = 3;
        rotateByKPlaces(arr, d);
        System.out.println(Arrays.toString(arr));
    }
    static void rotateByKPlaces(int[] arr, int d){
        int n = arr.length;;
        d = d%n;
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }
    static void reverse(int[] arr, int s, int e){
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
