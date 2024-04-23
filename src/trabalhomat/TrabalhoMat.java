
package trabalhomat;

import java.util.Scanner;

/**
 *
 * @author José Mauro <josemaurosilva600@gmail.com>
 */
public class TrabalhoMat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a expressão da função:");
        String expression = scanner.nextLine();
        
        Function function = new Function(expression);
        
        System.out.println("Digite o valor de x para calcular a derivada:");
        double x = scanner.nextDouble();
        
        double derivative = function.calculateDerivative(x);
        System.out.println("A derivada da função em x = " + x + " é: " + derivative);
        
        scanner.close();
        System.out.println("Se a expressão não corresponder a nenhum dos padrões cadastrados, retornamos NaN (não é uma função polinomial suportada)");
    }
    }
    

