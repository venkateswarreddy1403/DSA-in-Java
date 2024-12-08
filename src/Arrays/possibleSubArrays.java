package Arrays;

//Printing all teh possible sub-arrays of given array.
//The total number of sub-arrays in an array of size N is N * (N + 1) / 2.

public class possibleSubArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,7,8,9,12};
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
    //Using strings and optimised way to write
    static void possibleSubs(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            String subArray = "";
            for (int j = i; j < arr.length; j++) {
                subArray += arr[j] + " ";
                System.out.println(subArray.trim());
            }
        }
    }
}
