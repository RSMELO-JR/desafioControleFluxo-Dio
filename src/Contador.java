import java.util.Scanner;

// Classe customizada para a exceção de parâmetros inválidos
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

public class Contador {

    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt(); // Lê o primeiro parâmetro como um número inteiro;
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt(); // Lé o segundo parâmetro como um némero inteiro;

        try { //chamando o método contendo a lógica de contagem
            contar (parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage()); // Imprime a mensagem de exceção

        }
    }

    static void contar (int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

            //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException ("O segundo deve ser maior que o primeiro");
       }

       int contagem = parametroDois - parametroUm + 1; //adicionado 1 para incluir o próprio parametroDois na contagem

      //realizar o for para imprimir os números com base na variável contagem
      for (int i = 0; i < contagem; i++) {
          System.out.println("Imprimindo o número " + (parametroUm + i));
      }
   }
}

