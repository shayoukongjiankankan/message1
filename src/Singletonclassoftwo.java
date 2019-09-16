//双重验证懒汉式（DCL）
//实现比较复杂
//效率较高
//线程安全
public class Singletonclassoftwo {
   public  static Singletonclassoftwo instance=new Singletonclassoftwo();
    private Singletonclassoftwo(){

    }
    public static Singletonclassoftwo getInstance(){
       if (instance==null){//B挡住
           synchronized (Singletonclassoftwo.class){//A进去锁住
               if (instance==null){
                   instance=new Singletonclassoftwo();
               }
           }
       }

        return instance;
    }
}
