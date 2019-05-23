import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    static Cache cache;
    public static void main(String[] args) {
        entrada(args);
    }

    public static void entrada(String[] args){
        //Verifica se a entrada contem algum argumento
        if(args.length == 0){
            System.out.println("Entrada inválida, por favor forneça os argumentos");
        }

        //O unico argumento entrado sera o arquivo de entrada
        if(args.length == 1){
            cache = new Cache();
        }
        //configuração inteira da cache
        if(args.length == 2){
            cache = new Cache(args[0]);
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("./arqTexto1.txt"));
            while(br.ready()){
                Conjuntos conjuntos = new Conjuntos(br.readLine());
                conjuntos.aloca();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
