public class SingletonClass {//饿汉式
    //立即创建，线程安全JVM加载时就创建，JVM加载时安全，因此它是安全的
    //只能创建一个实例
    public static SingletonClass instance=new SingletonClass();
    //将构造器设为私有的
    private SingletonClass(){

    }
    public static SingletonClass getInstance() {
        //其它方法
        return instance;
    }
}
