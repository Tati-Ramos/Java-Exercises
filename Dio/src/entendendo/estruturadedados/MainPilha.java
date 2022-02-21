package entendendo.estruturadedados;

/**
 * Referência de memória
 */

public class MainPilha {

    public static void main(String[] args) {

        Pilha minhaPilha = new Pilha();

        //insere
        minhaPilha.push(new NoPilha(1));
        minhaPilha.push(new NoPilha(2));
        minhaPilha.push(new NoPilha(3));
        minhaPilha.push(new NoPilha(4));
        minhaPilha.push(new NoPilha(5));
        minhaPilha.push(new NoPilha(6));
        System.out.println(minhaPilha);

        // remove
        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha);

        // insere
        minhaPilha.push(new NoPilha(99));
        System.out.println(minhaPilha);



    }

}
