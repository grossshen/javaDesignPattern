package builder;

class ConcreteBuilderA extends Builder{
    public void buildPartA() {
        product.setPartA("x");
    }

    public void buildPartB() {
        product.setPartB("y");
    }

    public void buildPartC() {
        product.setPartC("z");
    }
}
