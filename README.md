# FrontCode - EcoSys
## Versão: 1.0.0
## Status do Projeto: Concluído

## Tópicos
🔹 Funcionalidades

🔹 Distribuição

🔹 Pré-requisitos

🔹 Como rodar a aplicação

🔹 Testes realizados

🔹 Banco de Dados

🔹 Linguagens, dependências e libs utilizadas
  Java, MySQL Workbench
  
🔹 Novas Recursos
  
🔹 Resolvendo problemas

🔹 Recursos inseridos 

🔹 Desenvolvedores/Contribuintes
  
🔹 Informações Extras


...

## Descrição do projeto

  Sistema que visa auxiliar empresas de descarte de lixo eletrônico com o monitoramento e gerenciamento de estoque.
  
## Funcionalidades ⚙️
✔️ Gerenciar recebimento e estoque de todo lixo eletrônico.
  
✔️ Analisar e avisar em tempo real sobre capacidade máxima atingida do estoque.

✔️ Cálcular e mostrar previsões de lucro.

✔️ Gerenciar funcionários supervisionando o cadastro de usuários.

## Distribuição
A versão para testes pode ser encontrada disponível no github: https://github.com/KawanWan/FrontCode

## Pré-requisitos ⚠️    
- Java Development Kit 21
- MySQL Connector Java 8.2.0
- MySQL Community Server 8.0.35

## Como rodar a aplicação 
Baixe a útlima versão disponível na aba [releases](https://github.com/KawanWan/FrontCode/releases/) e em seguida execute o script sql disponível na pasta 'db' utilizando o Workbench, PHPMyAdmin, console ou meio preferível, tenha certeza que o MySQL esteja instalado e em execução em sua máquina. Após isso, execute o App.java e o sistema deverá estar funcionando.

## Testes realizados
Utilização de imagens e descrição do que foi testado.

## Banco de Dados 🗂️
O arquivo para utilização do banco de dados vem junto ao sistema quando baixado, encontrado na pasta 'db'.

## Linguagens, dependencias e libs utilizadas 📚
Java
MySQL WorkBench
MySQL Server
MySQL Connector Java

## Resolvendo Problemas 
- As telas eram inicialmente separadas e avulsas dentro do sistema, foi resolvido inserindo uma tela "HomeView", onde se utiliza a interface de uma forma mais intuitiva para o usuário.
- Inicialmente os campos CNPJ e Quantidade estavam atribuidos como inteiros no sistema, o que poderia causar divergência em algumas utilizações. Foi corrigido alterando o campo CNPJ para varchar, e o Quantidade para decimal, podendo ser cadastrado resíduos adicionados por peso.

## Recursos de inseridos 🧰
Funcionalidades que ainda precisam ser inseridas:

📝 Tela de cálculo de lucro e todas as suas funcionalidades.

## Desenvolvedores/Contribuintes:
Equipe - FrontCode

Cicero Augusto Oliveira do Nascimento, 236723,  Gerente de Projeto

Kawan Wan Der Maas do Nascimento, 236737, Programador Java

Gustavo Silva Santos, 236703, Design

Augusto Melo Vernek, 236186, Programador Java

Pedro Henrique Duarte, 236519, Programado Banco de Dados

## Licença
The MIT License (MIT)

## Copyright ©️ 2023 - EcoSys
