package builder;

class ConcreteBuilderB extends Builder{

    public void buildPartA() {
        product.setPartA("a");
    }

    public void buildPartB() {
        product.setPartB("b");
    }

    public void buildPartC() {
        product.setPartC("c");
    }
    //添加钩子方法
    public boolean useC(){
        return true;
    }
}
