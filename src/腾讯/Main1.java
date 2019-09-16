package 腾讯;

import javax.swing.plaf.synth.SynthScrollPaneUI;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int []array=new int[n+1];
        array[0]=0;
        for (int i = 1; i <=n ; i++) {
            array[i]=sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i <=n ; i++) {
            sum+=array[i]*i;
        }
        int time=0;
        int k=1;
        int abitity=m;
        while(k<n){
            while(k<=n&&abitity>array[k]&&time>k){
                abitity-=array[k]*k;
                k++;
            }
            abitity+=m;
            time++;
        }
        if (m<sum){
            System.out.println(123);
            time=time+n-1;
        }
        System.out.println(time);
    }
}
