<<<<<<< HEAD
public class Conjuntos {

    private String[] entradas = new String[100];
    private String tag;
    private int i = 0;

    public Conjuntos(String tag){ //Passa o tamanho da entrada
        this.tag = tag;
    }

    public int aloca(){
        entradas[i] = tag;
        i++;
        return 0;
    }
=======
import java.util.*;
public class Conjuntos {

   
    ArrayDeque<String> conjunto; 
    int tamanho;

    public Conjuntos(int tamanho){
        this.tamanho = tamanho;
    }
    
    int confereTag(String tag) {
    	//Vai percorrer todo o conjunto e conferir se possui a tag
    	if(conjunto.contains(tag)) {
    		//Caso a tag esteja presente atualizar que o dado foi acessado
    		//Isso permite que consigamos analisar o ultimo dado acessado 
    		//Possibilitando a verificação pra implementaçao de substituição LRU
    		atualizaConjunto(tag){//A ser implementado
    			return 1
    		}
    	//Caso a tag não esteja no conjunto
    	} else {
			insereNoConjunto(tag)//A ser implementado
		}
    }

>>>>>>> master
}
