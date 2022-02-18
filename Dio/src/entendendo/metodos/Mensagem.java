package entendendo.metodos;

/**
 * Classe de exemplo para o exercício da aula de Métodos
 */
public class Mensagem {

    public static void obterMensagem(int hora){

        switch (hora){
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println(hora);
                mensagemBomDia();
                System.out.println("------------");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                System.out.println(hora);
                mensagemBoaTarde();
                System.out.println("------------");
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println(hora);
                mensagemBoaNoite();
                System.out.println("--------------------");
                break;
            default:
                System.out.println("Hora Inválida!");
                System.out.println("--------------------");


        }
    }

    public static void mensagemBomDia(){
        System.out.println("Bom dia!");
    }

    public static void mensagemBoaTarde(){
        System.out.println("Boa tarde!");
    }

    public static void mensagemBoaNoite(){
        System.out.println("Boa Noite!");
    }

}
