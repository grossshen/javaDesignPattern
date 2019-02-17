package state.singleton;

/**
 * @author poorguy
 * @version 0.0.1
 * @E-mail 494939649@qq.com
 * @created 2019/2/15
 */
class Singleton {
    public static Singleton singleton=null;
    private Singleton(){System.out.println(this);}
    public static Singleton getInstance(){
        //线程不安全
        if(null==singleton){
            singleton=new Singleton();
        }
        return singleton;
    }
}
