import java.util.*;
public class arraySort {
    public static void inputArr(int i, int n, int arr[]){
        Scanner sc = new Scanner(System.in);
        for(i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
    }
    public static boolean isSorted(int arr[], int n){
        if(n==0 || n==1){
            return true; 
        }

        if(arr[n-1]>=arr[n-2]){
            return isSorted(arr, n-1);
        } else {
            return false; 
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter how many number you want to put: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter " +  n + " numbers: ");
        inputArr(0, arr.length, arr);
        //int arr[] = {1, 2, 4, 4, 5};
        boolean ans = isSorted(arr, arr.length);
        if(ans == true)
            System.out.print("Your array is sorted: "+ans);
        else 
            System.out.print("Your array is NOT sorted: " + ans);
        sc.close();
    }
}