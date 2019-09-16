package 新浪;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int num=Integer.parseInt(str.substring(0, str.length()-1));

        String[] strarray=new String[num];
        for (int i = 0; i <num ; i++) {
            if (i!=num-1){
                String str1=sc.next();

                strarray[i]=str1.substring(0, str1.length()-1);
            }else {
                strarray[i]=sc.next();
            }

        }
        String minstr=strarray[0];
        for (int i = 1; i <num ; i++) {
            boolean an=deside1(minstr,strarray[i]);

            if (an){
                minstr=strarray[i];
//                System.out.println(minstr);
            }

        }
        System.out.println(minstr);
    }

    private static boolean deside1(String s, String s1) {

        String[] strarray2=s.split("\\.");
        String[] strarray3=s1.split("\\.");



        int minlength=Math.min(strarray2.length,strarray3.length);
        for (int i = 0; i <minlength ; i++) {

            if (Integer.parseInt(strarray3[i])<Integer.parseInt(strarray2[i])){
                return true;

            }
        }
        return false;
    }


}
