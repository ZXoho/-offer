package algorithm;

/**
 * 单例模式 饿汉式
 */
public class singleton3 {

    //在类加载时时已经实例化
    private static final singleton3 INSTANCE = new singleton3();

    private static singleton3 getInstance(){
        return INSTANCE;
    }
}
