import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Basketselect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Integer []arrays=new Integer[num+1];
        arrays[0]=0;
        int sum=0;
        for (int i = 1; i <num+1 ; i++) {
            arrays[i]=sc.nextInt();
            sum+=arrays[i];
        }

        Arrays.sort(arrays, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return  o2-o1;
            }
        });
//        for (int i = 0; i <arrays.length ; i++) {
//            System.out.println(arrays[i]);
//        }
        System.out.println(sum);
        long []numofmethod=new long[sum+1];
        long ans=0;
        numofmethod[0]=1;
        for (int i = 0; i <=num ; i++) {//这里i 必须从零开始；
            for (int j =sum; j >=0; j--) {
                if (j>=arrays[i]){
                    if (numofmethod[j-arrays[i]]>0&&j-arrays[i]<sum-j+arrays[i]&&j>sum-j){
                        ans+=numofmethod[j-arrays[i]];
                    }
                    numofmethod[j]+=numofmethod[j-arrays[i]];
                }

            }
        }
        System.out.println(ans);

    }


}

