package entendendo.estruturadedados.atribuicao;

/**
 * Atribuição por referência
 */

public class Main {

    public static void main(String[] args) {

        //atribuição por tipos primitivos.
        int intA= 1;
        int intB = intA; // tipos primitivos: copia exatamente o valor da memória

        System.out.println("intA = " + intA + " - intB = " + intB);
        intA = 2;
        System.out.println("intA = " + intA + " - intB = " + intB);
        System.out.println("---------------------");

        // atribuição por objeto.
        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA; // objeto: aponta para o mesmo endereço de memória (referência de memória)

        System.out.println("objA = " + objA + " - objB = " + objB);
        objA.setNum(2);
        System.out.println("objA = " + objA + " - objB = " + objB);
    }
}
