import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double n1;
        double n2;
        char operator;
        double result = 0;
        boolean validOp = true;

        System.out.print("Informe o primeiro valor: ");
        n1 = sc.nextDouble();

        System.out.print("Informe o operador (+, -, *, /, ^): ");
        operator = sc.next().charAt(0);

        System.out.print("Informe o segundo valor: ");
        n2 = sc.nextDouble();

        switch(operator){
            case '+' -> result = n1 + n2;
            case '-' -> result = n1 - n2;
            case '*' -> result = n1 * n2;
            case '/' ->{
                if(n2 == 0){
                    System.out.println("Não pode ser dividido por 0");
                    validOp = false;
                }else{
                    result = n1 / n2;
                }
            }
            case '^' -> result = Math.pow(n1, n2);
            default -> {
                System.out.println("Operador inválido!");
                validOp = false;
            }
        }

        if(validOp){
            System.out.println(result);
        }

        sc.close();
    }
}
