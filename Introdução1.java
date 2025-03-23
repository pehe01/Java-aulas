import java.util.Scanner;

public class Introdução1{                       
    public static void main(String[] args){
        System.out.println("Hello World!");   //Assim que se imprime um "Hello World" (ou qualquer outro texto) na linguagem Java

        //=================================
        //Declaração e "input" de variáveis
        //=================================

        int idade; //Declaração de uma variável do tipo "int"
        String nome; //Declaração de uma variável do tipo "String"
        double altura = 1.75; //Declaração de uma variável do tipo "double"
        boolean estaTrabalhando = true; //Declaração de uma variável do tipo "boolean"
        char sexo = 'M'; //Declaração de uma variável do tipo "char"


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: "); //Entrada do usuário (input da idade)
        idade = scanner.nextInt(); //Leitura do input

        System.out.println("Digite seu nome: "); //Input do nome
        nome = scanner.next(); //Leitura do input

        //Output (saída dos dados)
        System.out.println("Sua idade é: " + idade);
        System.out.println("Seu nome é: " + nome);  
        System.out.println("Sua altura é: " + altura);
        System.out.println("Você está trabalhando?: " + estaTrabalhando);
        System.out.println("Seu sexo é: " + sexo);
    }
}
