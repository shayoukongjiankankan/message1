//二分法不用使用递归！
public class Minofarray {
    public static void main(String[] args) {
        int []array={3,4,5,1,2};
        System.out.println(minNumberInRotateArray(array));
    }
    public  static  int minNumberInRotateArray(int [] array) {
        if (array.length==0){
            return 0;
        }
        if (array.length==1){
            return array[0];
        }
        int lo=0;
        int hi=array.length-1;
        int middle=lo+(hi-lo)/2;
        int min=findMin(array,lo,hi,middle);
        return min;
    }

    private static int findMin(int[] array, int lo, int hi, int middle) {
        while (lo<hi){
            if (array[middle]>array[hi]){
                lo=middle+1;
                middle=lo+(hi-lo)/2;

            }else if (array[middle]==array[hi]){
                hi--;
                middle=lo+(hi-lo)/2;
            }else {
                hi=middle;
                middle=lo+(hi-lo)/2;

            }
        }
        return array[lo];
        }

}
