import java.util.ArrayList;

//体积为vbag ,
public class Packageof01 {
    public static void main(String[] args) {
        int[] vm = {2, 3, 4, 5};
        int[] reword = {3, 4, 5, 6};
//        System.out.println(Package02(vm, reword, 8));
        System.out.println(Package01(vm,reword,8));
    }
//m*n的算法
    public static int Package02(int[] vm, int[] rewoard, int vmax) {
        int[][] array = new int[vm.length + 1][vmax + 1];

        for (int i = 0; i < array.length; i++) {//首先让数组周边为0；
            array[i][0] = 0;
        }
        for (int i = 0; i < array[0].length; i++) {
            array[0][i] = 0;
        }
        int[] vmm = new int[vm.length + 1];
        int[] rewardd = new int[rewoard.length + 1];
        vmm[0] = 0;
        rewardd[0] = 0;
        for (int i = 1; i < vmm.length; i++) {
            vmm[i] = vm[i - 1];
        }
        for (int i = 1; i < rewardd.length; i++) {
            rewardd[i] = rewoard[i - 1];
        }
int[]select=new int[array.length];
        for (int i = 1; i < vmm.length; i++) {
            for (int j = 1; j <= vmax; j++) {
                if (j < vmm[i]) {
                    array[i][j] = array[i - 1][j];
                } else {
                    if (array[i-1][j-vmm[i]]+rewardd[i]>array[i-1][j]){
                        array[i][j] =array[i - 1][j - vmm[i]] + rewardd[i];

                    }

                }

            }

        }

//        findwhat(array,array.length-1,array[0].length-1,vmm,rewardd,select);
//        for (int i = 0; i <select.length ; i++) {
//            System.out.println(select[i]);
//        }
        return array[array.length-1][array[0].length-1];
    }
    //优化空间的算法
        public static int Package01(int[]vm,int[]rewoard,int vmax){
            int []array=new int[vmax+1];
            array[0]=0;
            int[]vmm=new  int[vm.length+1];
            int[]rewardd=new int[rewoard.length+1];
            vmm[0]=0;
            rewardd[0]=0;
            for (int i = 1; i <vmm.length ; i++) {
                vmm[i]=vm[i-1];
            }
            for (int i =1; i <rewardd.length ; i++) {
                rewardd[i]=rewoard[i-1];
            }
            int []select=new int[vmm.length];
//            for (int i = 0; i <select.length ; i++) {
//                select[i]=0;
//            }
            for (int i = 1; i <vmm.length ; i++) {
                for (int j=vmax;j>=0;j--){
                    if (j>=vmm[i]&&array[j]<=array[j-vmm[i]]+rewardd[i]){
                        array[j]=array[j-vmm[i]]+rewardd[i];
                    }
                }
            }

            find(array,vmax,vmm.length-1,vmm,rewardd,select);
            for (int i = 0; i <select.length ; i++) {
                System.out.println(select[i]);
            }
        return array[vmax];
    }

    private static void find(int[] array, int j, int i,int[] vmm, int[] rewoardd,int[]select) {
        if (i>0){
            if (j>=vmm[i]&&array[j]==array[j-vmm[i]]+rewoardd[i]){
                System.out.println(rewoardd[i]);
                select[i]=1;
                find(array,j-vmm[i],i-1,vmm,rewoardd,select);
            }else {
                select[i]=0;
                find(array,j,i-1,vmm,rewoardd,select);
            }
        }
    }

    private static void findwhat(int[][] array, int i, int j,int[]vmm,int[] rewardd,int[]selected) {//找出包中装的几个物品
        if (i>0){
            if (array[i][j]==array[i-1][j]){
                selected[i]=0;
                findwhat(array,i-1,j,vmm,rewardd,selected);
            }else if (j-vmm[i]>=0&&array[i][j]==array[i-1][j-vmm[i]]+rewardd[i]){
                selected[i]=1;
                findwhat(array,i-1,j-vmm[i],vmm,rewardd,selected);
            }
        }

    }
    }
