package singleton;

/**
 * @author poorguy
 * @version 0.0.1
 * @E-mail 494939649@qq.com
 * @created 2019/2/15
 */
//饿汉模式
public class EagerSingleton {
    public static final EagerSingleton singleton=new EagerSingleton();
    private EagerSingleton(){};
    public static EagerSingleton getInstance(){
        return singleton;
    }
}
