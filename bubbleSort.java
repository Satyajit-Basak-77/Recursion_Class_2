public class bubbleSort {
    public static void SortArr(int arr[], int n){
        if(n==0 || n==1){
            return;
        }
        for(int i = 0; i<n-1; i++){ // (n-1) because when i = 4 (when n=5) it is comparing with arr[i=5] which does not exist that's why.
            if(arr[i]>= arr[i+1]){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            SortArr(arr, n-1);
            }
        }
        
    }

    public static int bubbleSortedArr(int start, int end, int arr[], int tar){
        SortArr(arr, arr.length);
        if(start<=end){
            int mid = start + (end - start)/2;

        if(tar == arr[mid]){
            return mid;
        }

        if(tar < arr[mid]){
            return bubbleSortedArr(start, mid-1, arr, tar);
        } else if(tar > arr[mid]){
            return bubbleSortedArr(mid+1, end, arr, tar);
        }
    }
    return -1;
}
    public static void main(String[] args) {
        int arr[] = {-1, 0, 3, 5, 9, 12};
        int tar = 90;
        int ans = bubbleSortedArr(0, arr.length-1, arr, tar);
        System.out.print("Your target " + tar + " was at index "+ ans);
    }
}