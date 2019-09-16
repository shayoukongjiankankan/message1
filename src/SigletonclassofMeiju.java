//枚举式
public class SigletonclassofMeiju {
    private SigletonclassofMeiju(){

    }
    public static SigletonclassofMeiju getInstance(){
        return Sington.INSTANCE.getInstance();
    }
    //使用枚举类型(类似一个内部类)
    private static enum Sington{
        INSTANCE;
        private SigletonclassofMeiju singleton;
        //JVM保证此方法绝对只调用一次
        private Sington(){
            singleton=new SigletonclassofMeiju();
        }
        public SigletonclassofMeiju getInstance(){
            return singleton;
        }
    }
}
