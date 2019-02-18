package chainOfResponsibility;

/**
 * @author poorguy
 * @version 0.0.1
 * @E-mail 494939649@qq.com
 * @created 2019/2/18
 */
class Main {
    public static void main(String[] args){
        Handler handler1=new ConcreteHandlerA();
        Handler handler2=new ConcreteHandlerB();
        handler1.setSuccessor(handler1);
        handler1.handlerRequest("xxx");
    }
}
