package chainOfResponsibility;

/**
 * @author poorguy
 * @version 0.0.1
 * @E-mail 494939649@qq.com
 * @created 2019/2/18
 */
abstract class Handler {
    //设为protected使successor对子类可用
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
    public abstract void handlerRequest(String request);
}
