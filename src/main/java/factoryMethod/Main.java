package factoryMethod;

/**
 * @author poorguy
 * @version 0.0.1
 * @E-mail 494939649@qq.com
 * @created 2019/2/13
 */
class Main {
    public static void main(String[] args){
        Factory factory=null;
//        factory=new ConcreteFactoryA();
        factory=(Factory) XMLUtil.getBean();
        Product product=null;
        product=factory.getProduct();
    }
}
