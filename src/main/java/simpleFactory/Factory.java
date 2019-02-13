package simpleFactory;

/**
 * @author poorguy
 * @version 0.0.1
 * @E-mail 494939649@qq.com
 * @created 2019/2/12
 */
public class Factory {
    public static Product getProduct(String arg){
        Product product=null;
        if(arg.equals("A")){
            product=new ConcreteProductA();
        }else if(arg.equals("B")){
            product=new ConcreteProductB();
        }else if(arg.equals("C")){
            product=new ConcreteProductC();
        }
        return product;
    }
}
