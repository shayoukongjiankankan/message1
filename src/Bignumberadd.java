public class Bignumberadd {

    public static void main(String[] args) {
        int a=12;
        int b=1222;
        String str1=String.valueOf(a) ;
        String str2=String.valueOf(b) ;
        System.out.println(add2(str1,str2));
    }
    public static String add2(String n1, String n2) {
        StringBuffer result = new StringBuffer();
        // 1、反转字符串
        n1 = new StringBuffer(n1).reverse().toString();
        n2 = new StringBuffer(n2).reverse().toString();
        int len1 = n1.length();
        int len2 = n2.length();
        int maxLen = len1 > len2 ? len1 : len2;
        boolean nOverFlow = false; // 是否越界
        // 2.把两个字符串补齐，即短字符串的高位用0补齐
        if (len1 < len2) {
            for (int i = len1; i < len2; i++) {
                n1 += "0";
            }
        } else if (len1 > len2) {
            for (int i = len2; i < len1; i++) {
                n2 += "0";
            }
        }
        // 3.把两个正整数相加，一位一位的加并加上进位
        int nTakeOver = 0; // 溢出数量
        for (int i = 0; i < maxLen; i++) {
            int nSum = Integer.parseInt(n1.charAt(i) + "") + Integer.parseInt(n2.charAt(i) + "");
            if ((nSum + nTakeOver) >= 10) {
                if (i == (maxLen - 1)) {
                    nOverFlow = true;
                }
                result.append(nSum + nTakeOver - 10);
                nTakeOver=1;
            } else {
                result.append(nSum + nTakeOver);
                nTakeOver = 0;
            }
        }
        // 如果溢出的话表示位增加了
        if (nOverFlow) {
            result.append(1);
        }
        return result.reverse().toString();
    }
}
