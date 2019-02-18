package proxy;

/**
 * @author poorguy
 * @version 0.0.1
 * @E-mail 494939649@qq.com
 * @created 2019/2/18
 */
class RealSubject extends Subject {
    private void preRequest(){}
    private void postRequest(){}
    public void request() {
        preRequest();
        //todo
        postRequest();
    }
}
