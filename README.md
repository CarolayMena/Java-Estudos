# Java-Estudo

## Aula 5

## Trabalhando com laços de repetição

(https://www.youtube.com/watch?v=2fawKjR8d4c)

# WHILE 
```
int contador = 0;
while (contador<4) {          // faz teste lógico antes 
System.out.println("Contador"); 
contador++ ;                    // repete as vezes que for necessário
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

  


			
