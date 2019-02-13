package simpleFactory;

/**
 * @author poorguy
 * @version 0.0.1
 * @E-mail 494939649@qq.com
 * @created 2019/2/12
 */
class Main {
    public static void main(String[] args){
        Product product=null;
        String productType= XMLUtil.getProductType();
        product=Factory.getProduct(productType);
        product.univesalMethod();
        product.uniqueMethod();
    }
}
