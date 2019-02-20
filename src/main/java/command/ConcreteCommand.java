package command;

/**
 * @author poorguy
 * @version 0.0.1
 * @E-mail 494939649@qq.com
 * @created 2019/2/20
 */
public class ConcreteCommand {
    private Receiver receiver;
    public void execute(){
        receiver.action();
    }
}
