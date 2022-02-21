package entendendo.estruturadedados.fila;

public class MainFila {

    public static void main(String[] args) {

        Fila<String> minhaFila = new Fila<>();

        // enfileirar
        minhaFila.enqueue("Primeiro");
        minhaFila.enqueue("Segundo");
        minhaFila.enqueue("Terceiro");
        minhaFila.enqueue("Quarto");

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue("Ultimo");
        System.out.println(minhaFila);

        System.out.println(minhaFila.first());
        System.out.println(minhaFila);

    }
}