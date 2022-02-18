package entendendo.metodos;

import javax.lang.model.util.ElementScanner6;

/**
 * Classe principal dos exercícios da aula de Métodos
 */

public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercício Calculadora");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9,1.0);
        Calculadora.multiplicacao(7,8);
        Calculadora.divisao(5,2.5);

        //Mensagem
        System.out.println("Exercício Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //Empréstimo
        System.out.println("Exercício Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,5);
    }
}
