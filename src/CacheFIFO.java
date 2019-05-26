import java.util.LinkedHashMap;
import java.util.Map;

//Utilizando LinkedHashMap, pois consegue armazenar a ordem de
//inserção dos elementos
//k = keys, v = values: chaves e valores mapeados
public class CacheFIFO<K,V> extends LinkedHashMap <K,V>{
	
	//Necessário para implementação
	private static final long serialVersionUID = 2L;
	private int tamanho;
	
	private CacheFIFO(int tamanho) {
		//Parâmetros para o construtor dar LinkedHashMap:
		//Capacidade inicial, Fator de carregamento(0.75 é o padrão)
		//E boolean true: para ordem de acesso
		//False para ordem de inserção
		super(tamanho, 0.75f, false);
		this.tamanho = tamanho;
	}
	
	
	//Para saber se irá remover o ultimo elemento ou não,
	//utilizar containsValue()
		
	//Inclusa na biblioteca do LinkedHashMap
	//Irá mapear o tamanho da cache para conferir o último elemento
	//acessado
	//Irá remover o último elemento acessado
	protected boolean removeOldestEntry(Map.Entry<K, V> eldest) {
		//Irá remover o último elemento percorrendo
		//toda lista de acordo com o tamanho setado
		return size() > tamanho;
	}
	

	
	//Gerando uma nova cache com política de substituição LRU
	public static <K,V>CacheFIFO<K,V> novaCacheFIFO(int tamanho){
		return new CacheFIFO<K,V>(tamanho);
	}

}
