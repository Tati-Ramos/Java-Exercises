package entendendo.tratamentodeexcecoes;

public class DivisaoNaoExataException extends Exception {

    private int numerador;
    private int denominadorr;

    public DivisaoNaoExataException(String message, int numerador, int denominadorr) {
        super(message);
        this.numerador = numerador;
        this.denominadorr = denominadorr;
    }
}
