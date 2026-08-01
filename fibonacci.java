public class fibonacci {
    // public static void Fibseries(int n , int a, int b){
    //     if(n ==0 ){
    //         return; 
    //     }
    //     int c = a+b;
    //     System.out.print(c + " ");
    //     Fibseries(n-1, b, c);
    // }

    // Only for nth term. If starting term is 1
    public static int Fibseries (int n){
        if(n == 0 || n ==1){
            return n;
        }
        // if( n == 1){
        //     return Fibseries(n) + Fibseries(n-1); 
        // }

        return Fibseries(n-1) + Fibseries(n-2);
    }
    public static void main(String[] args) {
        //int a = 0, b = 1;
        // System.out.print(a + " " + b + " ");
        int ans = Fibseries(9/*, a, b*/);
        System.out.print(ans);
        
    }
}
