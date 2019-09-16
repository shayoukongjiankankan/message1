import java.lang.reflect.Constructor;
public class Testofruqin {
    public static void main(String[] args) {
        SingletonclassLan c1=SingletonclassLan.getInstance();
        //使用反射
        SingletonclassLan c2=SingletonclassLan.getInstance();
        System.out.println(c1==c2);
    }
}
