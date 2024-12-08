package Arrays;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1};
        System.out.println(brute(arr));

    }
    static int brute(int[] arr){
        int count = 0;
        int max = 0;
        for (int j : arr) {
            if (j == 0) {
                count = 0;
            } else {
                count++;
            }
            max = Math.max(count, max);
        }
        return max;
    }
}
