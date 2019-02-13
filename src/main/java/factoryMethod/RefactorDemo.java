package factoryMethod;

/**
 * @author poorguy
 * @version 0.0.1
 * @E-mail 494939649@qq.com
 * @created 2019/2/13
 */
public class RefactorDemo {
    public static void main(String[] args){
        String string="ConcreteProductA";
        try {
            Class aClass=Class.forName(string);
            Product product=(Product) aClass.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
