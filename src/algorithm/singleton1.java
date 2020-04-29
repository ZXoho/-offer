package algorithm;

/**
 * 单例模式 懒汉式
 * 懒加载
 */
public class singleton1 {

    //volatile 保证uniqueInstance在实例化时，多线程可正确操作uniqueInstance
    private static volatile singleton1 uniqueInstance;

    private singleton1(){}

    public static singleton1 getInstance(){
        //检查实例是否存在
        if(uniqueInstance == null){
            synchronized (singleton1.class){
                //再次检查实例是否存在，不存在则创建实例
                if(uniqueInstance == null)
                    uniqueInstance = new singleton1();
            }
        }
        return uniqueInstance;
    }
}
