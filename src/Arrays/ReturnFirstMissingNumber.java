package Arrays;

public class ReturnFirstMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = 6;
        System.out.println(brute(arr,n));
        System.out.println(better(arr,n));
        System.out.println(usingSumMethod(arr, n));
        System.out.println(usingXORMethod(arr,n));
    }
    static int brute(int[] arr, int n){
        for(int i = 1; i < n; i++){
            boolean flag = false;
            for(int j = 0; j < n-1; j++){
                if(arr[j] == i){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                return i;
            }
        }
        return n;
    }
    static int better(int[] arr, int n){
        int[] hash = new int[n+1];

        for(int i = 0; i < n-1; i++){
            hash[arr[i]] = 1;
        }

        for(int i = 1; i < n; i++){
            if(hash[i] == 0){
                return i;
            }
        }
        return n;
    }
    static int usingSumMethod(int[] arr, int n){
        int sum = (n*(n+1))/2;
        for(int i : arr){
            sum -= i;
        }
        return sum;
    }
    static int usingXORMethod(int[] arr, int n){
        int xor1 = 0;
        for(int i = 0; i < n-1; i++){
            xor1 = xor1 ^ arr[i] ^ i+1;
        }
        return xor1^n;
    }
}
