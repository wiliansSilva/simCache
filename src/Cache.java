public class Cache {

    private int nset;
    private int bsize;
    private int assoc;
    private char subs;
    Conjuntos conjuntos;

    public Cache(){
        nset = 256;
        bsize = 4;
        assoc = 1;
        subs = 'r';
    }

    public Cache(String param){
        String[] cache_config = param.split(":");

        nset = Integer.parseInt(cache_config[0]);
        bsize = Integer.parseInt(cache_config[1]);
        assoc = Integer.parseInt(cache_config[2]);

        if(cache_config.length == 4){
            subs = cache_config[3].charAt(0); // Retorna o caracter da posição n da String, nesse caso R,F ou L
        }else{
            subs = 'r';
        }
    }

    //acessa o byte a partir de um endereço
    void acessarByte(int end){
        int indice = (end / bsize) % nset;
        int tag = end/bsize/nset;


    }
}
