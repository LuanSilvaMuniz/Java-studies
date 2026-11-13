package week01_basic_syntax.day02;

public class Declaration {
    public static void main(String[] args){

        int x; //declaração da variavel x.
        x = 10; //inicialização da variavel x.

        System.out.println(x);

        final double y = 3.14d;
        // Se declarasse depois y = 20 seria é um erro de compilação

        System.out.println(y);

        String nome = "Luan"; //String armazena um conjunto de caracteres.

        var variavel1 = 10; // var determina a tipagem da variavel sozinho a partir do valor declarado.
        var variavel2 = "joao";

        System.out.println(variavel1);
        System.out.println(variavel2);

        // não da pra mudar o tipo apos usar var, ele é determinado na inicialização da variavel.
    }
}

