# Java-Estudo

## Aula 9

## toString para classes nativas


```
public class Programa {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		String nome = "Carolay";
		int idade = 36;
		lista.add(nome);
		lista.add(Objects.toString(idade));
		System.out.println(lista);
	}
}
```  

Irá imprimir corretamente por que o Tipo String tem um método para este fim conforme abaixo: 

_String.class_
```
/**
* This object (which is already a string!) is itself returned.
*
* @return  the string itself.
*/
public String toString() {
return this;
}
```

_Integer.class_
```
    /**
     * Returns a {@code String} object representing this
     * {@code Integer}'s value. The value is converted to signed
     * decimal representation and returned as a string, exactly as if
     * the integer value were given as an argument to the {@link
     * java.lang.Integer#toString(int)} method.
     *
     * @return  a string representation of the value of this object in
     *          base&nbsp;10.
     */
    public String toString() {
        return toString(value);
    }
```

_Obs: Primitivos não tem tratamento são impressos 'cru' exatamente com o valor que eles possuem_



## Diferenca de List e List<> e também ArayList ArrayList<>  ####
(https://www.devmedia.com.br/java-collections-set-list-e-iterator/29637)

'''
List<T> //lista de objetos tipados onde se pode obter acceso por índice.
        //Proporciona métodos para buscar, ordenar e manipular listas.
'''

'''
List carros = new LinkedList(); //Criamos uma instância qualquer para o nosso objeto do tipo List, sendo que essa instância deve obrigatoriamente implementar a interface List
'''


(https://cursos.alura.com.br/forum/topico-diferenca-entre-list-e-arraylist-104645)

List é uma interface e ArrayList é uma classe que implementa List.
ArrayList vai implementar os métodos de List e pode ter métodos mais específicos que List não vai ter.


'''
List<String> lista = new ArrayList<String>();
'''
usando a interface (List) ao invés de uma implementação específica (ArrayList) na hora de declarar o tipo da lista, permite que você mude,
futuramente, o tipo de implementação da lista com muita facilidade (ArrayList para LinkedList, por exemplo).


'''
ArrayList<String> lista = new ArrayList<String>();
'''
faz com que o código fique muito acoplado/preso a um tipo específico de implementação (ArrayList), e caso você se arrependa um dia de ter usado o tipo ArrayList e 
queira mudar para uma LinkedList (ou vice-versa), fazer essa mudança pode te dar uma dor de cabeça já que em um sistema maior, nada garante que outras partes do código não 
estejam usando métodos específicos do ArrayList. Por outra lado, se desde o começo você tivesse implementado a interface List, bastaria mudar uma instancia dela
'''
List<String> lista = new ArrayList<String>();

se torna

List<String> lista = new LinkedList<String>();
'''




























			
