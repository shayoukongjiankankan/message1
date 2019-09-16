package 新浪;

public class Test {
    public static void main(String[] args) {
        String str="4.3.5.4";
        String[]strarray=str.split("\\.");
        System.out.println(strarray.length);
        for (int i = 0; i <strarray.length ; i++) {
            System.out.println(strarray[i]);
        }
    }


}
