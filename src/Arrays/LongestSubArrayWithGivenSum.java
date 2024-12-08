package Arrays;

import java.util.HashMap;

public class LongestSubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1};
        int n = 7, k = 3;
        System.out.println(optimalSolution(arr,n,k));
    }

    static int bruteApproach(int[] arr, int k, int n){
        int len = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int sum = 0;
                for(int l = i; l < j; l++){
                    sum += arr[l];
                }
                if(k == sum){
                    len = Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }
    static int betterApproach(int[] arr, int k, int n){
        int len = 0;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += arr[j];
                if(sum == k){
                    len = Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }
    static int optimalSolution(int[] arr, int n, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, len = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(sum == k){
                len = Math.max(len, i+1);
            }
            int rem = sum-k;
            if(map.containsKey(rem)){
                int temp = i - map.get(rem);
                len = Math.max(len, temp);
            }
            if(!map.containsKey(rem)){
                map.put(sum, i);
            }
        }
        return len;
    }
    static int using2Pointer(int[] arr, int n, int k){
        int left = 0, right = 0;
        long sum = arr[0];
        int maxLen = 0;
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if (right < n){
                sum += arr[right];
            }
        }
        return maxLen;
    }
}
