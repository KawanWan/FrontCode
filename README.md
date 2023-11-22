# FrontCode - Descarte Consciente
## Versão: 1.0.0
## Status do Projeto: ⚠️ Em andamento

## Tópicos
🔹 Site 

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
Baixe a útlima versão disponível na aba (realese)[https://github.com/KawanWan/FrontCode/releases/tag/beta] e em seguida execute o script sql disponível na pasta 'db' utilizando o Workbench, PHPMyAdmin, Console ou meio preferível, tenha certeza que o MySQL esteja instalado e em execução em sua máquina. Após isso, execute o App.java e o sistema deverá estar funcionando.

## Testes realizados
Utilização de imagens e descrição do que foi testado.

## Banco de Dados 🗂️
O arquivo para utilização do banco de dados pode ser encontrado na aba [https://github.com/KawanWan/FrontCode/releases/tag/beta], em um script sql disponível na pasta 'db'.

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

📝 Tela de recuperação de senha do usuário e todas as suas funcionalidades.

📝 Tela de cálculo de lucro e todas as suas funcionalidades.

📝 Tela de cadastro e exclusão de empresas e todas as suas funcionalidades.

📝 Inserção de uma ComboBox na interface de adição de resíduos ligada à tabela EMPRESA do banco, onde se é possível inserir um CNPJ já cadastrado no sistema.

📝 Inserção do design em algumas telas do sistema para que siga todo o estilo do projeto.

## Desenvolvedores/Contribuintes:
Equipe - FrontCode

Cicero Augusto Oliveira do Nascimento , 236723, augustocicero831@gmail.com, Gerente de Projeto

Kawan Wan Der Maas do Nascimento, kawan.wan18@gmail.com, 236737, Programador Java

Gustavo Silva Santos , 236703, ,Design

Augusto Melo Vernek , 236186, Programador Java

Pedro Henrique Duarte -236519, Programado Banco de Dados

## Licença
The MIT License (MIT)

## Copyright ©️ 2023 - Descarte Consciente
