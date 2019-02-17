package decorator;

class Main {
    public static void main(){
        Component component;
        component=new ConcreteComponent();
        component=new ConcreteDecoratorA(component);
        component = new ConcreteDecoratorB(component);
    }
}
