public class SingletonclassLan {
    //默认是不安全的，因此需要加锁
    //只能创建一个实例
    public static SingletonclassLan instance;//一开始不创建实例，什么时候调用方法，
    // 什么时候创建实例
    //将构造器设为私有的
    private SingletonclassLan(){

    }
    //同步代码块效率太低
    public synchronized  static SingletonclassLan getInstance() {
        //其它方法
        //A，B有可能同时进来，这样就造成创建的实例
        // 有可能不是同一个，达不到单例。因此是线程不安全的。解决办法上一把锁
        //方法上锁sychronized
        if (instance==null){
            instance=new SingletonclassLan();
        }
        return instance;
    }
}
