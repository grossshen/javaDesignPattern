package interpreter;

/**
 * @author poorguy
 * @version 0.0.1
 * @E-mail 494939649@qq.com
 * @created 2019/2/20
 */
public class NonTerminalExpression extends AbstractExpression {
    private AbstractExpression expression;

    public NonTerminalExpression(AbstractExpression expression) {
        this.expression = expression;
    }

    public void interpret(Context context) {
        //
    }
}
