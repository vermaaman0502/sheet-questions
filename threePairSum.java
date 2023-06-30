import java.util.*;
public class threePairSum {
    public static boolean Sum(int arr[]) {
        Arrays.sort(arr);
        for(int i=0; i<arr.length-2; i++) {
            int L = i+1,   R =arr.length-1;
            while(L<R) {
                if(arr[i] + arr[L] +arr[R] ==0) {
                    return true;
                } else if(arr[i] + arr[L] +arr[R] <0) {
                    L++;
                } else{
                    R--;
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int arr[] = {0,-1,2,-3,1};
        System.out.println(Sum(arr));

    }
    
}
