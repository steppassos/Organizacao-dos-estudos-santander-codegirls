# Organização dos Estudos Santander Code Girls 

## Anotações sobre Git/Github:

O que é o Github: Sistema de Controle de versões mais utilizado no mundo. A forma de interagir com o Git é através de linhas de comando.

Alguns comandos no Windows:

 - CD: Muda o diretório;
 - LS: Lista o repositório;
 - MKdir: Cria diretórios;
 - Clear/Cls: Limpa o terminal;
 
 Os comandos levam o nome Git na frente. Exemplo:
 
 - Git init: inicia um repositório no git;
 - Git add: Move arquivos e dá os primeiros comandos;
 - Git Commit: Pega todos os arquivos Staged, envelopa em uma mensagem com significado e une tudo em um objeto chamado commit;
 .git commit -m (comando)
 - Git status: informa como está o trabalho, qual é o status da operação.
 
 ### Passo para "comitar" o arquivo:
 
 - git add (nome do arquivo) . ou * (enter);
 - git commit -m "ação desejada" (enter);
 - git status - confere se deu tudo certo; 
 
 ### Para clonar o repositório para a minha maquina: 
 
 - Copia o link do repositório em HTTPS ou SSH no Github;
 - Criar uma pasta no computador ou selecionar a pasta que vai receber o repositório;
 - Na pasta do pc, abrir o Git Bash; 
 - Aplicar o comando git clone (link copiado do repositório do Github);
 - Se pedir a senha - incluir a senha que usa geralmente; 
 
Para confirmar informações e ver o status: 

 - Cd + nome do repositório clonado (vai para a pasta do repositório no seu pc);  
 - git status
 
 ### Para subir o arquivo no Github
 
 - Cria um novo repositório no Github;
 - Copia o link do repositório em HTTPS ou SSH;
 - Acessa o GitBash /ls;
 - Git remote add origin (Link)/
 - Git remote -v (Listar o que está no remote);
 - Git status - Working tree clean (certifica que não tem pendencias no repositório).
 
 


