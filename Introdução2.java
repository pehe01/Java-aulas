import java.util.ArrayList; //Importa a classe ArrayList da biblioteca padrão

/*
 * Exemplo de Introdução ao Java:
 * - Tipos primitivos e suas variáveis
 * - Wrappers (classes que representam os tipos primitivos)
 * - Arrays (vetores)
 * - ArrayList (lista dinâmica)
 */
public class Introdução2{ //classe "main"

    public static void main(String[] args) { //main
        
        //================================
        //Tipos Primitivos e Variáveis
        //================================

        int numero = 10;         //Inteiro (32 bits)
        double preco = 19.99;    //Número com ponto flutuante (64 bits)
        char letra = 'A';        //Caractere (16 bits, Unicode)
        boolean ativo = true;    //Valor booleano (true ou false)

        //Exibindo valores dos tipos primitivos
        System.out.println("Valor do número: " + numero);
        System.out.println("Valor do preço: " + preco);
        System.out.println("Valor da letra: " + letra);
        System.out.println("Está ativo: " + ativo);

        //================================
        //Wrappers
        //================================

        //Wrappers são classes que encapsulam tipos primitivos e fornecem métodos úteis
        //Exemplo: Integer, Double, Character e Boolean
        Integer numeroWrapper = Integer.valueOf(numero);  //Converte int para Integer
        Double precoWrapper = Double.valueOf(preco);        //Converte double para Double
        Character letraWrapper = Character.valueOf(letra);  //Converte char para Character
        Boolean ativoWrapper = Boolean.valueOf(ativo);      //Converte boolean para Boolean

        // Utilizando métodos das classes wrapper
        System.out.println("Número em String (wrapper): " + numeroWrapper.toString());
        System.out.println("Preço arredondado: " + precoWrapper.intValue());
        System.out.println("É dígito? " + Character.isDigit(letraWrapper)); // Verifica se o caractere é dígito
        System.out.println("Valor booleano: " + ativoWrapper.booleanValue());

        //================================
        //Arrays (Vetores)
        //================================

        //Declarando e inicializando um array de inteiros com 5 posições
        int[] numerosArray = new int[5];
        
        //Atribuindo valores aos elementos do array
        for (int i = 0; i < numerosArray.length; i++) {
            numerosArray[i] = i * 10;  //Cada posição recebe o valor i * 10
        }

        //Exibindo os valores armazenados no array
        System.out.println("\nConteúdo do array:");
        for (int i = 0; i < numerosArray.length; i++) {
            System.out.println("Elemento na posição " + i + ": " + numerosArray[i]);
        }

        //================================
        //ArrayList (Lista Dinâmica)
        //================================

        //ArrayList permite adicionar e remover elementos dinamicamente
        ArrayList<String> listaDeFrutas = new ArrayList<>();

        //Adicionando elementos na ArrayList
        listaDeFrutas.add("Maçã");
        listaDeFrutas.add("Banana");
        listaDeFrutas.add("Laranja");
        listaDeFrutas.add("Uva");

        //Exibindo os elementos da ArrayList utilizando um loop "for-each"
        System.out.println("\nLista de frutas:");
        for (String fruta : listaDeFrutas) {
            System.out.println(fruta);
        }

        //Removendo um elemento da ArrayList 
        listaDeFrutas.remove("Banana");
        System.out.println("\nLista de frutas após remover 'Banana':");
        for (String fruta : listaDeFrutas) {
            System.out.println(fruta);
        }
    }
}

