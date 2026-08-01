public class binarySearch {
    public static void printArr(int i, int n, int arr[]){
        for(i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void isSorted(int arr[], int n){
        if(n==0 || n==1){
            return;
        }
        for(int i = 0; i<n-1; i++){ // (n-1) because when i = 4 (when n=5) it is comparing with arr[i=5] which does not exist that's why.
            if(arr[i]>= arr[i+1]){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            isSorted(arr, n-1);
            }
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 4, 5};
        isSorted(arr, arr.length);
        printArr(0, arr.length, arr);
    }
}