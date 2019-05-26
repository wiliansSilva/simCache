import java.io.*;
import java.util.Scanner;

public class Main {

    static Cache cache;
    static String data[];
    static int i = 0;
    public static void main(String[] args) {
        entrada(args);
    }

    public static void entrada(String[] args){

            try{
                //Verifica se a entrada contem algum argumento
                if(args.length == 0){
                    System.out.println("Entrada inválida, por favor forneça os argumentos");
                }

                //case tenha apenas um argunto, ele sera o arquivo de entrada
                if(args.length == 1){
                    File file = new File(args[0]);
                    if(file.exists()){
                        FileReader fr = new FileReader(file);
                        BufferedReader br = new BufferedReader(fr);
                        data = new String[200];
                        while(br.ready()){
                            data[i] = br.readLine();
                            i++;
                        }
                    }
                    cache = new Cache();
                }

                //configuração inteira da cache com arquivo de entrada
                if(args.length == 2){
                    cache = new Cache(args[0]);
                    acessos();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    //faz a simulação de acesso aos endereços fornecidos
    public static void acessos(){
        //percorrer todo DATA
        cache.acessarByte(2);
    }
}
