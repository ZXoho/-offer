package algorithm;

/**
 * 单例模式 静态内部类方式
 */
public class singleton2 {

    //懒加载
    // 只有第一次使用这个单例的实例才会被加载
    private static class SingletonHolder {
        private static final singleton2 INSTANCE = new singleton2();
    }

    private singleton2(){}

    public static final singleton2 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
