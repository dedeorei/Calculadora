/**
 * <p><strong>Classe de Teste da Calculadora</strong></p>
 *
 * <p>Esta classe contém o método principal responsável por executar testes
 * simples da classe {@code Calculadora}, demonstrando o funcionamento das
 * operações básicas: soma, subtração, multiplicação e divisão.</p>
 *
 * <p>Também são realizados testes com cenários excepcionais para validar o
 * tratamento de erros, como tentativa de divisão por zero e uso de operador
 * inválido.</p>
 *
 * <ul>
 *     <li>Teste de operações válidas</li>
 *     <li>Teste de exceções esperadas</li>
 *     <li>Exibição dos resultados no console</li>
 * </ul>
 *
 * <p>Esta classe não faz parte da lógica da calculadora, mas é utilizada apenas
 * para fins de demonstração e verificação do comportamento dos métodos.</p>
 */
package calculadora;

public class TesteCalculadora {

    /**
     * <p>Método principal da aplicação.</p>
     *
     * <p>Cria uma instância de {@code Calculadora} e realiza diversas chamadas ao
     * método {@code calcular}, exibindo os resultados no console. Também demonstra
     * o lançamento e captura de exceções ao utilizar operações inválidas.</p>
     *
     * @param args argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
 
        System.out.println(calc.calcular(2, 3, "+")); 
        System.out.println(calc.calcular(10, 4, "-")); 
        System.out.println(calc.calcular(3, 5, "*")); 
        System.out.println(calc.calcular(8, 2, "/")); 
        
        try {
            System.out.println(calc.calcular(8, 0, "/")); 
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            System.out.println(calc.calcular(5, 5, "x")); 
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

        
}