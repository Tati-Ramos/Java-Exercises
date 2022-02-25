package entendendo.io;

import java.io.*;

// Faça uma cópia do arquivo "recomendacoes.txt" e agora adicione 3 recomendações de livros;
public class Exercicio3IOCaracter {
    public static void copiarArquivo() throws IOException {
        File f = new File("C:\\Users\\tatia\\Documents\\Java Exercises\\Dio\\recomendacoes.txt");
        String nameArquivo = f.getName();

        /*FileReader r = new FileReader(nameArquivo);
        BufferedReader br = new BufferedReader(r);*/

        BufferedReader br = new BufferedReader(new FileReader(nameArquivo));
        String line = br.readLine();

        String nameArquivoCopy = nameArquivo.substring(0,nameArquivo.indexOf(".")).concat("-copy.txt");
        File fcopy = new File(nameArquivoCopy);

        BufferedWriter bw = new BufferedWriter(new FileWriter(fcopy.getName()));

        do {
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = br.readLine();
        }while (!(line == null));
        System.out.printf("Arquivo \"%s\" copiado com sucesso! Com o tamanho '%d' bytes.\n", f.getName(), f.length());
        System.out.printf("Arquivo \"%s\" criado com sucesso! Com o tamanho '%d' bytes.", fcopy.getName(), fcopy.length());

    }


public static void adicionarInfoNoArquivo(){}

    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }

}