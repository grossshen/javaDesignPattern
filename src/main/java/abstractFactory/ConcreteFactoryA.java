package abstractFactory;

/**
 * @author poorguy
 * @version 0.0.1
 * @E-mail 494939649@qq.com
 * @created 2019/2/15
 */
class ConcreteFactoryA implements AbstractFactory {
    public Button createButton() {
        return new AButton();
    }

    public TextField createTextField() {
        return new ATextField();
    }
}
