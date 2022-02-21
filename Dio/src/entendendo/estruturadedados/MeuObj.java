package entendendo.estruturadedados;

/**
 * Atribuição por referência.
 */
public class MeuObj {

    Integer num;

    public MeuObj(Integer num) {
        this.num = num;
    }

    public void setNum(Integer num){
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }
}
