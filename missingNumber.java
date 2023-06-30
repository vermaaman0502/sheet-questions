public class missingNumber {
    public static int missing(int arr[], int n) {
        
        int sum = n*((n+1)/2);
        int s2 = 0;
        for(int i=0; i<n-1; i++) {
            s2+=arr[i];
        }
        return (sum-s2);
    }
    public static void main(String[] args) {
        int n=5;
        int arr[] = {5,2,1,3};
        System.out.println(missing(arr, n));
    }
    
}
