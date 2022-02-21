package entendendo.estruturadedados.pilha;

public class Pilha {

    private NoPilha refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(NoPilha novoNo){
        NoPilha refAuxiliar = refNoEntradaPilha; // guarda a referência do topo
        refNoEntradaPilha = novoNo; //pega referência do topo e define para novoNo
        refNoEntradaPilha.setRefNo(refAuxiliar); // se refere a antiga referência do topo
    }

    public NoPilha pop(){
        if (!this.isEmpty()){ // se minha pilha não estiver vazia
            NoPilha noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public NoPilha top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){
//        if (refNoEntradaPilha == null){
//            return true;
//        }
//        return false;
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {

        String stringRetorno = "-----------------\n";
        stringRetorno += "     Pilha\n";
        stringRetorno += "-----------------\n";

        NoPilha noAuxiliar = refNoEntradaPilha;

        while (true){
            if (noAuxiliar != null) {
                stringRetorno += "[No{dados=" +noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else {
                break;
            }
        }
            stringRetorno += "=================\n";
            return stringRetorno;
    }
}
