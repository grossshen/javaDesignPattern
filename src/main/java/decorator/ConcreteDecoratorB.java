package decorator;

public class ConcreteDecoratorB extends Decorator {
    private Component component;
    public ConcreteDecoratorB(Component component) {
        super(component);
    }
    public void operation(){
        component.operation();
        addAnotherMethod();
    }
    public void addAnotherMethod(){}
}
