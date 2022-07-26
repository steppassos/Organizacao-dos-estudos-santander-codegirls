package Metodo.java1;

public class Main {
    public static void main(String[] args) {

        //calculadora
        System.out.println("Exercicio Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);


        // Mensagens
        System.out.println("Exercicio mensagem");
        Mensagem.obtermensagem(9);
        Mensagem.obtermensagem(14);
        Mensagem.obtermensagem(1);

        // Emprestimo
        System.out.println("Exercicio Emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
