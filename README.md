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
			
