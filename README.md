# Java-Estudo

## Aula 4

## Lançando uma exception

```
System.out.println(10/0);
```  

## Usando a classe Scanner

```
import java.util.Scanner;
Scanner scanner = new Scanner(System.in);
scanner.nextInt(); // Armazenar o valor de uma variável
```  

# cria nova pasta
```
mkdir src
```

# entra no diretório/arquivo
```
mv Programa.java src
```

# melhor forma de estruturar arquivos
```
 ls -a
./  ../  .git/  .gitignore  README.md  src/ -->src em uma pasta fora os arquivos 
```

# entar na pasta src
```
cd src
```

# para voltar uma pasta no git hub
```
cd ..
```

# git add fazer sempre na raiz (neste caso Java Estudo + branch escolhida
-->se eu fizer git add . por exemplo assim: /Java-Estudos/src (aula4)
--> não vai commitar o que preciso
--> para ficar correto é necessário voltar uma pasta e fazer commit na raiz
cd ..
/Java-Estudos (aula4) -->agora sim estou na raiz e posso fazer commit



# O eclipse fica conectado a JVM fazendo inspeção de compilação evitando com isso os erros de sintaxe

# A JVM roda no processador do computador e este por sua vez abre thread para tudo que ele faz, como se ele abrisse um espaço no computador para fazer algo ali, 
então quando acontece msg thread no java é uma msg inesperada

System.out.println(10/0); //valores chumbados no código font
                          // produz erro na execução thread porque não se divide //número por 0
						              Picked up _JAVA_OPTIONS: -Djava.net.preferIPv4Stack=true
						              Exception in thread "main" java.lang.ArithmeticException: / by zero at Programa.main(Programa.java:4)
                          
						              //Para tratar Exception usamos try {}catch {};

# classe Scanner --> não é nativa, ou seja, para utilizar ter que ser importada
```
import java.util.Scanner;
```

Scanner scanner = new Scanner (System.in); --> O "System.in" método de entrada no sistema (existem varios) , neste caso usamos classe System

# Alterando arquivos no git hub
```
1-clicar no objeto caneta e começar editar
```
2-para salvar ir no fim da pagina e clicar no botão commit changes
```
3-ir no git bash e fazer comando pull da branch correspondente
git pull origin aula4

Se não fizer o git pull, quando quiser mexer no git bash(commit) vai mostrar msg de erro alertando que o código remoto está diferente do git bash


			
