package builder;
//相比于工厂模式，builder模式的关注点更多的在于建造的过程
abstract class Builder {
    Product product=new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    public boolean useC(){
        return false;
    }
    public Product getProduct(){
        return product;
    }
}
