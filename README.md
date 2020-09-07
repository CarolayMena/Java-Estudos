# Java-Estudo

## Aula 5

## Trabalhando com laços de repetição


# FOR (pendente) 
```

```

# WHILE 

https://www.youtube.com/watch?v=2fawKjR8d4c
contador inicia valendo zero 
contador < 0

contador recebe zero
int contador =0;

verificando uma condição
contador < 4

quando finaliza a primeira verificação incrementa o contador-->looping
contador +1



```
int contador = 0;
while (contador<4) {          // faz teste lógico antes 
System.out.println("Contador"); 
contador++ ;                    // repete as fezes com for necessário
}

RESULTADO 
Contador 
Contador
Contador
Contador
```

```
int contador =0;
while(contador <4) {
System.out.println("Contador " + contador ); // começa a contar do número 0
contador++ ;
}

RESULTADO 
Contador 0
Contador 1
Contador 2
Contador 3
```


```
int contador =0;
while(contador <4) {
System.out.println("Contador " + (contador+1) ); // começa a contar do número 1 
contador++ ;
}


ou outra forma de fazer 

int contador=1;
while (contador <=4){
System.out.println("Contador " + contador ); // começa a contar do número 1 
contador++ ;
}


RESULTADO 
Contador 1
Contador 2
Contador 3
Contador 4
```


## MUDAR O FLUXO DE UM LAÇO ATRAVÉS DE UM COMANDO
1) CONTINUE -->ignora/interrompe o próximo comando e volta a executar o looping

```
int contador =0;
while (comtador <=4) {
contador++ ;

if (contador == 2 || contador ==3) {
continue;
}
System.out.println("Contador" + contador);

}

RESULTADO 
Contador 1
Contador 4

```

2) BREAK --> interrompe o laço
```
int caontador =0;
while (contador <5){
contador ++
if (contador == 3) {
break;
}
System.out.println("Contador" + contador);
}
```

(https://www.youtube.com/watch?v=9_12LPVMJYc)

while --> enquanto a condição for verdadeira --> executa o looping --> expressão entre chaves

while (i < max)   { // a primeira vez o valor de i começa com 1 e verifica se i <10 
System.out.println("Valor de i" + i); // imprime msg na tela + valor de i (primeira vez i vale 1
i++ ;  // incrementa o valor de i --> aqui i passar a valer 2 e volta para while e pergunta de i<10
								-- ou seja, se 2 <10	

}

System.out.println(i); // na última vez que faz verificação do while i vale 10 porque quando i tinha valor de 9, i incrementou mais 1, passando a i a valer 10-->i volta para while e pergunta i<max -->10 < 10
                          então finaliza looping e imprime o valor de i.
