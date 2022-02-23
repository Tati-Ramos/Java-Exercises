package entendendo.estruturadedados.stack;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Carro> stackCarros = new Stack<>();

        // insere
        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));

        System.out.println(stackCarros);

        // remove um elemento do topo
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);

        // coleta um elemento do topo e não remove da pilha
        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);

        System.out.println(stackCarros.empty());

    }
}
