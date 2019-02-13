package factoryMethod;

/**
 * @author poorguy
 * @version 0.0.1
 * @E-mail 494939649@qq.com
 * @created 2019/2/13
 */
class ConcreteFactoryA implements Factory{
    public Product getProduct() {
        Product product=new ConcreteProductA();
        return product;
    }
}
