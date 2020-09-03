# Java-Estudo

## Git Commands - aula3


## Alterando um commit

Ao alterar um commit você precisará, sair da tela de edição do Vi que é um editor de texto igual ao nano que o git usa na edição de commits

```
( terminou a edicao ) tecla esc e depois :wq! (salva e fecha o editor)
```  

```
git commit --amend && git push origin aula3 --force
```


code review --etapa do ciclo de desenvolvimento que pessoas aprovam o código fonte , avaliam seu código.

jenkis--continuos integration, olha se o código canditato a entrar vai quebrar o que está funcionando
se quebrar ele não entra, garantindo que vai subir coisas que funciona. 

## hash do commit
quando se faz commit o gitbash cria hash de commit (89d0098f--> esse número é a hasc curta

## commit através da rasch
é possível fazer o checkout pela rasch, por exemplo quando precisamos voltar no tempo

## Compila e executa
javac Programa.java && java Programa

## Alterando um commit
Ao alterar um commit você precisará, sair da tela de edição do Vi que é um editor de texto igual ao nano que o git usa na edição de commits
( terminou a edicao ) tecla esc e depois :wq! (salva e fecha o editor)

git commit --amend

git commit --amend && git push origin aula3 --force

## Comparação em java 
		String a = "oi";  --> aqui é só uma reserva de memória que está guardando a informação 
		String b =  "oi"; --> a mesma reserva de memória que está guardando a informação do a
		String c = new String ( "oi" ); --> quando tem um new estou criando objeto
		String d = new String ( "oi" );
		System.out.println(a==b); //true  --> é verdadeiro porque está comparando o mesmo local armazenado e não a palavra "Oi" (devido ao gerenciamento de memória da JVM)
		
		System.out.println(a==c); //false --> a (reserva da memória) é diferente de c que é um objeto
		
		System.out.println(c==d); //false --> c é diferente do d porque são objetos distintos
		
		System.out.println(c.equals(d)); //true --> aqui está fazendo comparação de igualdade
		
		==            usar para comparar referência de memória
		(x.equals(y)) usar para comparar o conteúdo do objeto 
		


## Melhor forma de comparar conteúdo de um objeto é usando equals
		String nome = "Janett";
		if( nome.equals("Janett") ) { 
		
		

public static void main(String[] qualquerNome) -->no lugar do args pode ser qualquer Nome porem convem colocar args


		Integer a = 127;
		Integer b = 127;
		Integer c = 129;
		Integer d = 129;
		Integer e = 128;
		Integer f = 128;
		int g = 130;
		int h = 130;


		System.out.println(a==b); //true
		System.out.println(c==d); //false --> falso porque o Integer só tem capacidade de armazenar 127bits
		                                      se a variável de comparação tiver mais que 127bits retorna falso
		System.out.println(e.equals(f)); //true --> comparação utilizando .equals e com f devido que é um Interger.
                                                --> se variaveis f e fossem int não posso usar o .equal para comparar 
												--> tipos primitivos não pode usar .equals para comparar
												--> .equals usado para comparar tipo String e Interger
		System.out.println(g==h); //true 



Integer é a classe
O Interger foi feito para o primitivo int, uma alternativa para o primitivo int wrapper -->para um primitivo sempre existe um wrapper que tem varios métodos

(https://www.alura.com.br/artigos/diferenca-entre-int-e-integer-em-java)
int é um primitivo que nada mais é do que um tipo que não representa uma classe. 
primitivo não tem métodos
o padrão de int é 0
o int nao é é um objeto. Não é a instância de uma classe, logo não possui métodos

Em tanto o Integer tem métodos --atributo possa ser adicionado a uma coleção, você pode ter um List por exemplo
O Interger tem métodos estáticos, que são os mais usados das classes wrappers --mais usado método valueOf(), que transforma o parâmetro para o wrapper que chamou este método.
transformar um int em Integer
int tipoPrimitivo = 0;
Integer tipoPrimitivoTransformadoEmWrapper = Integer.valueOf(tipoPrimitivo);

Então, como Integer é uma classe não abstrata, podemos instânciá-la:

int tipoPrimitivo = 0;
Integer tipoPrimitivoTransformadoEmWrapper = new Integer(tipoPrimitivo);

O autoboxing é um recurso que automaticamente converte tipos primitivos em seu wrapper equivalente. Por exemplo, vamos supor que eu queira transformar o atributo 
idade que está com o tipo int para uma nova variável do tipo Integer.
Com o autoboxing eu poderia fazer dessa forma:

'''
Integer idadeWrapper = idade;
'''

Por baixo dos panos” o compilador compila para o seguinte código:
'''
Integer idadeWrapper = Integer.valueOf(idade);
'''

E o unboxing é o inverso do autoboxing, ou seja, ele pega um wrapper e o transforma em seu tipo primitivo. Assim:

'''
int idadePrimitivo = idadeWrapper;
'''
E por baixo dos panos, temos o seguinte:
'''
int idadePrimitivo = idadeWrapper.intValue();
'''

#Todos os tipos não primitivos são, por padrão, nulos caso não seja atribuído nenhum valor a eles.

Em java existe Wrapper-- classe que representa um tipo primitivo
exemplo o Wrapper de int é o Integer

Mas o que eu ganho usando esse Wrapper? 
a maior vantagem é conseguir atribuir nulo
cuidado para não atribuir valores nulos a rodo, pois seu código fica muito propenso a tomar NullPointerException.

