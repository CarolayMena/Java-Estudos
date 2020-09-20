# Java-Estudo

## Comandos gits 
(https://gist.github.com/leocomelli/2545add34e4fec21ec16)
  

#Branches
O master é o branch principal do GIT.

O HEAD é um ponteiro especial que indica qual é o branch atual. Por padrão, o HEAD aponta para o branch principal, o master.

##Criar um novo branch e trocar
'''
git checkout -b bug-456
'''

##Resolver merge entre os branches
Para realizar o merge, é necessário estar no branch que deverá receber as alterações.
O merge pode automático ou manual. O merge automático será feito em arquivos textos que não sofreram alterações nas mesmas linhas,
já o merge manual será feito em arquivos textos que sofreram alterações nas mesmas linhas.

'''
git merge bug-123
'''

##Listar branches que já foram fundidos (merged) com o master
'''
git branch --merged
'''

##Listar branches com informações dos últimos commits
'''
git branch -v
'''

##Listar branches que não foram fundidos (merged) com o master
'''
git branch --no-merged
'''

##Criando um branch remoto com nome diferente
'''
git push origin bug-123:new-branch
'''

##Baixar um branch remoto para edição
'''
git checkout -b bug-123 origin/bug-123
'''

##Apagar branch remoto
'''
git push origin:bug-123
'''

##Fazendo o rebase entre um o branch bug-123 e o master.
'''
git checkout experiment
git rebase master
'''

##Alterando mensagens de commit
'''
git commit --amend -m "Minha nova mensagem"
'''

##Alterar últimos commits
'''
git rebase -i HEAD~3
'''

O editor de texto será aberto com as linhas representando os três últimos commits.
'''
pick f7f3f6d changed my name a bit
pick 310154e updated README formatting and added blame
pick a5f4a0d added catfile
'''

Altere para edit os commits que deseja realizar alterações.
'''
edit f7f3f6d changed my name a bit
pick 310154e updated README formatting and added blame
pick a5f4a0d added catfile
'''

Digite o comando para alterar a mensagem do commit que foi marcado como edit.
'''
git commit –amend -m “Nova mensagem”
'''

Aplique a alteração
'''
git rebase --continue
'''

##Juntando vários commits
'''
Seguir os mesmos passos acima, porém marcar os commtis que devem ser juntados com *squash
'''

##Remover todo histórico de um arquivo
'''
git filter-branch --tree-filter 'rm -f passwords.txt' HEAD
'''




















			
