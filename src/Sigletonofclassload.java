//静态内部类加载方式；
//彩蛋，使用一种方法入侵单例
public class Sigletonofclassload {
    //构造方法私有化
    private  Sigletonofclassload(){

    }

    private  static class Inner{
        //把实例创建出来
        private static Sigletonofclassload instance=new Sigletonofclassload();
    }
    public static Sigletonofclassload getInstance(){
        return Inner.instance;//可以引用内部类的静态
    }
}
