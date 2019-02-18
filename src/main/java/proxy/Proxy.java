package proxy;

/**
 * @author poorguy
 * @version 0.0.1
 * @E-mail 494939649@qq.com
 * @created 2019/2/18
 */
class Proxy extends Subject{
    private RealSubject realSubject=new RealSubject();
    public void request() {
        realSubject.request();
    }
}
