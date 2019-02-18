package chainOfResponsibility;

/**
 * @author poorguy
 * @version 0.0.1
 * @E-mail 494939649@qq.com
 * @created 2019/2/18
 */
public class ConcreteHandlerB extends Handler {
    public void handlerRequest(String request) {
        if(2==2){
            //todo
        }else {
            this.successor.handlerRequest(request);
        }
    }
}
