package calculadora;

public class Calculadora {

    
    public int r = 0;

    public int calc(int a, int b, String operador) {
        //Calculadora
        if (operador.equals("+")){
            r = a + b;
        } else if (operador.equals("-")){
            r = a - b;
        } else if (operador.equals("*")){
            r = a * b;
        } else if (operador.equals("/")){
            if (b != 0) {
                r = a / b;
            } else {
                System.out.println("Erro: divisão por zero, operação irregular");
                r = 0;
            }
        } else {
            System.out.println("Operação Inválida");
            r = 0;
        }

        System.out.println("Resultado = " + r);
        return r;
    }
}