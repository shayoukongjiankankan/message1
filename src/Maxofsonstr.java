public class Maxofsonstr {
    //动态规划的思想
    public static void main(String[] args) {
        String str="arabcacfr";
        System.out.println(getMaxofson(str));
    }
    public static int getMaxofson(String str) {
        int []position=new int[26];
        for (int i = 0; i <position.length ; i++) {
            position[i]=-1;
        }
        int maxlength=0;
        int currentlength=0;
        for (int i = 0; i <str.length() ; i++) {
            int posi=position[str.charAt(i)-'a'];
            if (posi<0||i-posi>currentlength){
                currentlength++;
            }else{
                if (currentlength>maxlength){
                    maxlength=currentlength;
                }
                currentlength=i-posi;
            }
            position[str.charAt(i)-'a']=i;
        }
        if (currentlength>maxlength){
            maxlength=currentlength;
        }
        return currentlength;
    }
}
