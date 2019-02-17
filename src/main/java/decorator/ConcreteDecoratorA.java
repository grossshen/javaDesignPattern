package decorator;

class ConcreteDecoratorA extends Decorator {
    private Component component;

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    public void operation(){
        component.operation();
        addedBehavior();
    }

    public void addedBehavior(){
        //todo
    }
}
