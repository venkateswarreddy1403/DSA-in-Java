package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,5,27,58,19,6,3,25,15,36,47,8,9};
        System.out.println(sLargest(arr));
    }

    static int sLargest(int[] arr){
        if(arr.length < 2){
            return -1;
        }
        int largest = arr[0];
        int sLargest = arr[0];
        for(int num : arr){
            if(num > largest){
                sLargest = largest;
                largest = num;
            } else if (sLargest < num && num < largest) {
                sLargest = num;
            }
        }
        return sLargest;
    }
}
