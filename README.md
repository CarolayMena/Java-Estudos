# Java-Estudo

## Git Commands - aula2


## Delata arquivo md
```
rm README.md
```

## Entra na branch  ## Teste --nome da branch
mv README.md ../Teste
```

## Cria arquivo
```
touch NomeArquivo.java
```

## Entra no arquivo criado
```
nano NomeArquivo
```

## cria arquivo para ignorar um tipo de arquivo (neste caso .class)
# arquivo .gitignore --> arquivo oculto
```
touch .gitignore
```

## Indicar o tipo de arquivo que preciso que seja ignorado
```
nano .gitignore *.class
tecla ctrl + X + Y 
``` 

## -am Usar somente para salvar arquivo que ja existia
```
git -am "nome do ajuste"
``` 

## enviar branch para github
```
git push origin nomeBranch
```

## Faz foto da master, cria branch e entra na branch
```
git checkout -b nomeBranch
```

## Para voltar o status da branch no passado
# passo 1
```
git checkout nomeBranch 
git log --oneline
```
## resultado passo 1  --pegar o endereco do commit
aedd5e9 (HEAD -> master, origin/master, origin/aula2, aula2) Adicionando arquivos
8d97f80 initial commit
6ca474d Add Useful commands
565e85d git commands
f6a4fe7 initial commit
#passo 2
```
git checkout 8d97f80
```
#passo 3 --mandar o que resgatei do commit para uma nova branch
```
git checkout -b nomeBranch
git push origin nomeBranch
```

## Para fazer add . , commit e push tudo de uma vez
```
git git add . && git commit -m "descrever ajuste" && git push origin nomeBranch
```

## Deletar branch
```
git branch -d master
```

## Push do delete no repositoria
```
git push origin nomeBranch --delete
```
##  se ao fazer push o delete nao funcionar --> ir no github --settings --branch --nomeBranch -- update
# e logo volta a fazer o comando anterior

## Para listar arquivos ocultos
```
ls -a
```

## Para listar arquivos de um repositorio
```
ls
```

## Para listar repositorio e arquivos ocultos
```
ls -la
```
## Resultado do ls -la
## d -->diretorio  
## rwx --> permissao do owner
## r-x --> permissáo de outros
total 35
drwxr-xr-x 1 AzureAD+JanettCarolayMenaPor 4096   0 ago 20 08:26 ./
drwxr-xr-x 1 AzureAD+JanettCarolayMenaPor 4096   0 ago 20 08:09 ../
drwxr-xr-x 1 AzureAD+JanettCarolayMenaPor 4096   0 ago 20 08:25 .git/
-rw-r--r-- 1 AzureAD+JanettCarolayMenaPor 4096   0 ago 20 08:26 .gitignore
-rw-r--r-- 1 AzureAD+JanettCarolayMenaPor 4096 421 ago 20 08:19 Programa.class
-rw-r--r-- 1 AzureAD+JanettCarolayMenaPor 4096 112 ago 20 08:19 Programa.java
-rw-r--r-- 1 AzureAD+JanettCarolayMenaPor 4096 309 ago 18 08:58 README.md


####### OUTROS
 
## SALVA ARQUIVO NO NANO
```
tecla Ctrl + X + Y
```

## COMPILA 
```
tecla Ctrl + x + y 
javac NomePrograma
```

## no github
```
tecla ctrl + R
```
