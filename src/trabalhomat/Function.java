

package trabalhomat;

/**
 *
 * @author José Mauro <josemaurosilva600@gmail.com>
 * @date 19/04/2024
 * @brief Class Function
 */
public class Function {
private String expression;

    public Function(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

    public double calculateDerivative(double x) {
        // Remove espaços em branco da expressão
    String expressionWithoutSpaces = expression.replaceAll("\\s", "");

    // Derivada de uma constante é sempre zero
    if (expressionWithoutSpaces.matches("-?\\d+(\\.\\d+)?")) {
        return 0.0;
    }

    // Derivada de uma constante multiplicada por x é a constante
    if (expressionWithoutSpaces.matches("-?\\d+(\\.\\d+)?\\*x")) {
        return Double.parseDouble(expressionWithoutSpaces.split("\\*")[0]);
    }

    // Derivada de uma constante multiplicada por x elevado a uma potência é a constante multiplicada pela potência de x
    if (expressionWithoutSpaces.matches("-?\\d+(\\.\\d+)?\\*x\\^\\d+")) {
        String[] parts = expressionWithoutSpaces.split("\\*x\\^");
        double coefficient = Double.parseDouble(parts[0]);
        int power = Integer.parseInt(parts[1]);
        return coefficient * power * Math.pow(x, power - 1);
    }

    // Se a expressão não corresponder a nenhum dos padrões acima, retornamos NaN (não é uma função polinomial suportada)
    return Double.NaN;
    }
}
