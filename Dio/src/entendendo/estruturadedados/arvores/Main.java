package entendendo.estruturadedados.arvores;

import entendendo.estruturadedados.arvores.model.Obj;

public class Main {

    public static void main(String[] args) {

        ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<>();

        minhaArvore.inserir(new Obj(13));
        minhaArvore.inserir(new Obj(10));
        minhaArvore.inserir(new Obj(25));
        minhaArvore.inserir(new Obj(2));
        minhaArvore.inserir(new Obj(12));
        minhaArvore.inserir(new Obj(20));
        minhaArvore.inserir(new Obj(31));
        minhaArvore.inserir(new Obj(29));

// primeiro a sub-árvore esquerda em in ordem, seguido pelo nó raiz e finalmente pela sub-árvore direita em in ordem - ordem crescente
        minhaArvore.exibirInOrdem();

// primeiro nó é o nó raiz, seguido pela sub-árvore esquerda em pré-ordem e finalmente pela sub-árvore direita em pré-ordem
        minhaArvore.exibirPreOrdem();

// primeiro lê-se os nós da sub-árvore esquerda em pós-ordem, depois os nós da sub-árvore direita em pós-ordem e finalmente o nó raiz
        minhaArvore.exibirPosOrdem();

    }
}


/*
Uma árvore de busca binária tem as seguintes propriedades:

todos os elementos na subárvore esquerda de um determinado nó n são menores que n;
todos os elementos na subárvore direita de um determinado nó n são maiores ou iguais a n.
 */

/*
Caminhamento Prefixado
Basicamente no caminhamento prefixado será utilizado o algoritmo abaixo:

Executa-se a ação a ser realizada Recursivamente percorre-se a subárvore esquerda
Recursivamente percorre-se a subárvore direita
 */

/*
Caminhamento Pós-fixado
Basicamente no caminhamento Pós-fixado será utilizado o algoritmo abaixo:

Recursivamente percorre-se a subárvore esquerda
Recursivamente percorre-se a subárvore direita
Executa-se a ação a ser realizada
 */


/*
Caminhamento Em Ordem
Basicamente no caminhamento Em Ordem será utilizado o algoritmo abaixo:

Recursivamente percorre-se a subárvore esquerda
Executa-se a ação a ser realizada
Recursivamente percorre-se a subárvore direita
 */