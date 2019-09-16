package 浪潮;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[]array=new int[num];
        for (int i = 0; i <num ; i++) {
            array[i]=sc.nextInt();
        }
        ArrayList<Integer>al1=new ArrayList<>();
        ArrayList<Integer>al2=new ArrayList<>();
        for (int i = 2; i <=100 ; i+=2) {
            boolean flag=false;
            for (int j = 0; j <array.length ; j++) {
                if (i==array[j]){
                    flag=true;
                }
            }
            if (flag==false){
                al1.add(i);
            }
        }
        for (int i = 1; i <100 ; i+=2) {
            int count=0;
            for (int j = 0; j <array.length ; j++) {
                if (i==array[j]){
                    count++;
                }
            }
            if (count==0){
                al2.add(i);
            }
        }
        int maxo=0,maxj=0;
        int max1=0,max2=0;
        int end1=0;
        int end2=0;
        for (int i = 0; i <al1.size() ; i++) {
            if (i!=al1.size()-1){
                if (al1.get(i)==al1.get(i+1)-2){
                    max1++;

                }else{
                    max1++;
                    if (max1>maxo){
                        maxo=max1;
                        max1=1;
                        end1=al1.get(i);
                    }
                }
            }else {
                if (al1.get(i)-2==al1.get(i-1)){

                    max1++;
                    if (max1>maxo){
                        maxo=max1;
                        max1=1;
                        end1=al1.get(i);
                    }
                }else {

                    if (max1>maxo){
                        maxo=max1;
                        max1=1;
                        end1=al1.get(i);
                    }
                }
            }
        }

        for (int i = 0; i <al2.size() ; i++) {
            if (i!=al2.size()-1){
                if (al2.get(i)==al2.get(i+1)-2){
                    max2++;

                }else{
                    max2++;
                    if (max2>maxj){
                        maxj=max2;
                        max2=0;
                        end2=al2.get(i);
                    }
                }
            }else {
                if (al2.get(i)-2==al2.get(i-1)){
                    max2++;
                    if (max2>maxj){
                        maxj=max2;
                        max2=1;
                        end2=al2.get(i);
                    }
                }else {

                    if (max2>maxj){
                        maxj=max2;
                        max2=0;
                        end2=al2.get(i);
                    }
                }
            }
        }

        if (maxj<maxo){
            for (int i = 1; i <maxo ; i++) {
                end1-=2;
            }
            System.out.print(end1+" "+maxo);
        }else if (maxj>maxo){
            for (int i = 1; i <maxj ; i++) {
                end2-=2;
            }
            System.out.print(end2+" "+maxj);
        }else {
            for (int i = 1; i <maxo ; i++) {
                end1-=2;
            }
            for (int i = 1; i <maxj ; i++) {
                end2-=2;
            }
            System.out.print(Math.min(end1,end2)+" "+maxo);
        }


    }

}
