package entendendo.estruturadedados.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("Peugeot")));
        System.out.println(queueCarros);

        // retorna falso senão conseguir executar. Bem parecido com o add.
        System.out.println(queueCarros.offer(new Carro("Renault")));
        System.out.println(queueCarros);

        // vai pegar o primeiro carro da fila e não remove
        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        // vai pegar o primeiro e remover
        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty());


        System.out.println(queueCarros.size());




    }
}
