package bridge;

public class RefinedAbstraction extends Abstraction{
    public void operation() {
        implementor.operationImpl();
    }
}
