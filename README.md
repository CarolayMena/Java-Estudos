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

			
