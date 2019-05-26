import java.lang.Math; 

public class Cache {

    private int nset;
    private int bsize;
    private int assoc;
    private char subs;
    Conjuntos[] conjuntos;

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

    Conjuntos novoConjunto(){
        switch (subs){
            default:
            case 'r':
                return null;
            case 'l':
                return null;
            case 'f':
                return null;
        }
    }

    //Calculando log na base 2
    public static final int log2(float f)
    {
        return (int)Math.floor(Math.log(f)/Math.log(2.0));
    }
    
    //acessa o byte a partir de um endereço
    void acessarByte(int end){
        int indice = end % nset;
        int tamanhoDaCache = nsets * bsize;
        int indiceTamanho = log2(tamanhoDaCache)
        //supondo processador 64bits
        int tamanhoTag = (64 - indiceTamanho) * tamanhoDaCache;	
        int tag = Math.round(end/(10*tamanhoTag));

        conjuntos = new Conjuntos[200];

        if(conjuntos[indice] == null){
            conjuntos[indice] = novoConjunto();
        }
    }
}
