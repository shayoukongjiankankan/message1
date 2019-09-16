package 腾讯;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int []array1=new int[num1];
        int []array2=new int[num2];
        for (int i = 0; i <num1 ; i++) {
            array1[i]=sc.nextInt();
        }
        for (int i = 0; i <num2 ; i++) {
            array2[i]=sc.nextInt();
        }

        ArrayList<Integer> al1=new ArrayList<>();//偶数宝箱
        ArrayList<Integer> al2=new ArrayList<>();//奇数宝箱
        ArrayList<Integer> al3=new ArrayList<>();//偶数钥匙
        ArrayList<Integer> al4=new ArrayList<>();//奇数钥匙
        for (int i = 0; i <num1 ; i++) {
            if (array1[i]%2==0){
                al1.add(array1[i]);
            }else {
                al2.add(array1[i]);
            }
        }
        for (int i = 0; i <num2 ; i++) {
            if (array2[i]%2==0){
                al3.add(array2[i]);
            }else{
                al4.add(array2[i]);
            }
        }
        int length1=al1.size();
        int length2=al2.size();
        int length3=al3.size();
        int length4=al3.size();
        int answer1=Math.min(length1,length4);
        int answer2=Math.min(length2,length3);
        int answer=answer1+answer2;

        System.out.println(answer);
    }

}
