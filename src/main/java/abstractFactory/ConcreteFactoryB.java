package abstractFactory;

/**
 * @author poorguy
 * @version 0.0.1
 * @E-mail 494939649@qq.com
 * @created 2019/2/15
 */
class ConcreteFactoryB implements AbstractFactory {
    public Button createButton() {
        return new BButton();
    }

    public TextField createTextField() {
        return new BTextField();
    }
}
