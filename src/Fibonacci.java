public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fibonacci1(4));
    }
    public int Fibonacci(int n) {
       if (n==0){
       return 0;
       }
       if (n==1){
           return 1;
       }
       return Fibonacci(n-1)+Fibonacci(n-2);
    }
    public static int Fibonacci1(int n){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        int t=0;
        int k=1;
        int i=2;
        int fbnq=0;
        while (i<=n){
            fbnq=t+k;
            t=k;
            k=fbnq;

            i++;
        }
        return fbnq;

    }
}
