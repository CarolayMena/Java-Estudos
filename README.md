# Java-Estudo

## Aula  8

## Lista e foreach

```

```  

### Homework

## must to have

Explicar por que o array precisa ser inicializado.
_Aqui você aprenderá sobre inicilização de variáveis_

R:(https://www.devmedia.com.br/trabalhando-com-arrays-em-java/25530#Inicializando) and (https://www.youtube.com/watch?v=QWNQ1brbdZY)
  Array precisa ser inicializado porque o compilador utiliza a lista inicializadora para alocar um array

////// neste código o valor de cada índice não é impresso porque é somente  inicializado e atribuído o tamanho que o array irá ter
int array[];         // declara o array  // inicializa
array = new int[10]; // cria o espaço // atribui tamanho do array // ARRAY COM 10 ELEMENTOS

ou 

int array[] = new int[10]; 

System.out.printf("%s %10s \n", "Index", "Valores");
for(int i = 0; i < arrayBase.length; i++)
    System.out.printf("%3d %10d \n", i, arrayBase[ i ]);
   }
   
//////   

// Inicializando um array no momento da declaração   //LISTA  DE VALORES
int array[] = { 32, 27, 64, 18, 95, 14, 90, 70, 69}; 

// gera saída do valor de cada elemento do array //PERCORRE CADA ELEMENTO E IMPRIME O ÍNDICE COM O VALOR 
for ( int counter = 0; counter < array.length; counter++ ) {  //array.length retorna o tamanho do array
System.out.printf( "%5d%8d\n", counter, array[counter] );
//ou 
System.out.printf("%5d %4s %4d \n", counter, "=>" , array[ counter ]);
}

//////  

//formas de inicializar
String[] myStringArray = new String[3];
String[] myStringArray = {"a", "b", "c"};
String[] myStringArray = new String[]{"a", "b", "c"};

String[] myStringArray;
myStringArray = new String[]{"a", "b", "c"};

Ou (menos preferido)
int num[] = new int[5];	

Ou (menos preferido)
int num[] = {1, 2, 3, 4, 5};





//Exemplo do for aprimorado.
//a variável arrayNum, passa os valores armazenados para a variável i, fazendo com que o loop possa selecionar um valor a partir do array percorrido. 
        int[] arrayNum = {87, 68, 52, 5, 49, 83, 45, 12, 64};
        int total = 0;
        //ADICIONA O VALOR DE CADA ELEMENTO AO TOTAL
        for(int i : arrayNum)
            total += i;
        System.out.printf("Total de elementos arrayNum: %d\n", total);
    }

//




Explicar por que precisa fornecer um comprimento do array.
_Aqui você aprenderá como o java reserva espaço para armazenar arrays_

<<<<<<< HEAD

R:(https://www.devmedia.com.br/trabalhando-com-arrays-em-java/25530#Inicializando) and (https://www.youtube.com/watch?v=QWNQ1brbdZY) Array precisa ser inicializado porque o compilador utiliza a lista inicializadora para alocar um array

////// neste código o valor de cada índice não é impresso porque é somente inicializado e atribuído o tamanho que o array irá ter 
int array[]; // declara o array // inicializa 
array = new int[10]; // cria o espaço // atribui tamanho do array // ARRAY COM 10 ELEMENTOS

ou

int array[] = new int[10];

System.out.printf("%s %10s \n", "Index", "Valores"); for(int i = 0; i < arrayBase.length; i++) System.out.printf("%3d %10d \n", i, arrayBase[ i ]); }

//////
// Inicializando um array no momento da declaração //LISTA DE VALORES 
int array[] = { 32, 27, 64, 18, 95, 14, 90, 70, 69};

// gera saída do valor de cada elemento do array //PERCORRE CADA ELEMENTO E IMPRIME O ÍNDICE COM O VALOR 
for ( int counter = 0; counter < array.length; counter++ ) { //array.length retorna o tamanho do array 
System.out.printf( "%5d%8d\n", counter, array[counter] ); 
//ou
 System.out.printf("%5d %4s %4d \n", counter, "=>" , array[ counter ]); }

//////

//formas de inicializar
String[] myStringArray = new String[3];
String[] myStringArray = {"a", "b", "c"};
String[] myStringArray = new String[]{"a", "b", "c"};

String[] myStringArray; myStringArray = new String[]{"a", "b", "c"};

Ou (menos preferido) int num[] = new int[5];

Ou (menos preferido) int num[] = {1, 2, 3, 4, 5};

//Exemplo do for aprimorado.//a variável arrayNum, passa os valores armazenados para a variável i, fazendo com que o loop possa selecionar um valor a partir do array percorrido.
(https://www.it-swarm.dev/pt/java/como-faco-para-declarar-e-inicializar-um-array-em-java/967359361/)
int[] arrayNum = {87, 68, 52, 5, 49, 83, 45, 12, 64}; 
int total = 0; //ADICIONA O VALOR DE CADA ELEMENTO AO TOTAL
for(int i : arrayNum)
total += i; 
System.out.printf("Total de elementos arrayNum: %d\n", total); }
=======
R:(https://cursos.alura.com.br/forum/topico-tipos-da-array-e-tamanho-39359)
R: O comprimento do array é fundamental da inicialização/declaração do array
O tamanho do array, precisa sempre ser passado em algum lugar, caso contrário ocorrerá uma exception.

Quando se mexe em uma posição, funciona como se fosse um ponteiro, se esta indo naquela posição do array e alterando o valor que tem lá, se for primitivo você altera o valor, caso for um objeto você altera a referencia que ele está armazenando.

Quando é criado um vetor, ele já aloca um espaço na memória, ou seja, ao adicionar alguma coisa lá dentro só se está manipulando esse espaço. 
>>>>>>> 941a89abdd9e87760e493a6a2b85ea9ff8f76d10


## good to have



Fazer os programas serem variaveis usando Scanner e se necessário do while

_Digite quantas pessoas voce quer cadastrar_
_Digite o nome da primeira_
_Digite a idade_
_Se tiver a segunda_
_Digite o nome da segunda_
_Digite a idade da segunda_
_Lista as pessoas cadastradas na memoria_

			
