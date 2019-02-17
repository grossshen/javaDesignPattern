package abstractFactory;

/**
 * @author poorguy
 * @version 0.0.1
 * @E-mail 494939649@qq.com
 * @created 2019/2/15
 */
class Main {
    public static void main(String[] args){
        AbstractFactory factory;
        Button button;
        TextField textField;
//        factory=new ConcreteFactoryA();
        factory=(AbstractFactory) XMLUtil.getBean();
        button=factory.createButton();
        textField=factory.createTextField();
    }
}
