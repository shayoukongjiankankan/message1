//空间与时间相结合
public class Getuglynumber {
    public static int GetUglyNumber_Solution(int index) {
        if (index<7){
            return index;
        }
        int [] uglyarray=new int[index];
        uglyarray[0]=1;
        int nextindex=1;
        int []mutify2=uglyarray;//这里uglyarray改变mutify也随之改变
        int []mutify3=uglyarray;
        int []mutify5=uglyarray;
        int t2=0;
        int t3=0;
        int t5=0;
        while (nextindex<index){
            int num=Math.min(mutify2[t2]*2,Math.min(mutify3[t3]*3,mutify5[t5]*5));
            uglyarray[nextindex]=num;

            if (num==mutify2[t2]*2){
                t2++;//前面乘以三的后面也有可能乘以2
            }
            if (num==mutify3[t3]*3){
                t3++;
            }
            if (num==mutify5[t5]*5){
                t5++;
            }
            nextindex++;

        }
        return uglyarray[index-1];

    }
}
