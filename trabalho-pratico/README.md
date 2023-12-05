# Sistema de Ensino

## Proposta:

Sistema web educativo voltando para o ensino de matemática infantojuvenil.

## Público alvo:

* Crianças em nível escolar em período entre 1ª a 6ª série.

## Produto:

* Plataforma digital voltada para a educação de crianças que utiliza de mecanismos da _gamificação_ a fim de criar um ambiente divertido, conectado com a realidade do usuário e que busca motivá-los por meio de dinâmicas semelhantes à jogos. Dessa forma, a aplicação será voltada para o estudo introdutório de álgebra, que consiste na resolução de expressões numéricas envolvendo operações fundamentais.

## Motivação e Objetivos

* Necessidade de inovação educacional diante da transformação tecnológica da sociedade
* Incentivar estudantes através de estímulos visuais e um contexto similar a jogos digitais, diferentemente dos métodos de ensino tradicionais, facilitando o aprendizado
* Reconhecer a diversidade de estilos de aprendizado
* Promover engajamento, motivação e uma formação holística, visando o desenvolvimento cognitivo da criança
* Permitir que os usuários aprendam de forma independente e flexível
* Estimular a curiosidade e a busca pelo conhecimento através da abordagem interativa

## Funcionalidades:

* As questões serão geradas automaticamente e aleatoriamente através de um algoritmo baseado em 4 níveis de dificuldade. Em cada nível o aluno resolverá questões de:
    
    * Iniciante: Adição e subtração </p>
      Exemplos:
        * 5 + 8 - 4
        * 7 - 2 + 3
    
    * Moderado: Multiplicação e divisão </p>
      Exemplos: 
        * 8 * 2 + 4 - 8 / 2
        * 10 / 2 - 4 * 3
    
    * Experiente: Potenciação </p>
      Exemplos: 
        * 3<sup>2</sup> + 12 / 6 - 3 + 12 - 2
        * 20 / 4 * 4<sup>3</sup> + 24 / 8 * 3
    
    * Mestre: Radiciação </p>
      Exemplos: 
        * $\sqrt[2]{4}$ * 25 - 40 / 4 + 15 * 9<sup>2</sup> + 88<sup>0</sup>
        * 65 / 5 + 7<sup>3</sup> - 42 + $\sqrt[3]{9}$ * 12 + 102
          
* Ao gerar uma questão, o algoritmo será capaz de fornecer 4 alternativas de resposta e reconhecer a resposta correta quando o usuário selecionar uma alternativa.
  
* Ao resolver um exercício corretamente, o aluno recebe uma conquista baseada no tema da _gamificação_ do sistema e será incrementado seu progresso no nível de dificuldade selecionado.
  
* As questões não serão registradas no banco de dados, serão registradas apenas as informações do usuário (Nome, email, senha, conquistas obtidas e progresso atual em cada nível de dificuldade).
  
* Sessões em que o usuário pode aprender a parte teórica do conteúdo, ou seja, como resolver as operações (como funciona cada opração e qual ordem correta de resolvê-las dentro de uma expressão) e exemplos comentados de resoluções.

## Serviços e sistemas habilitadores

* Serviço de _gamificação_: fornece funcionalidades como a criação de conquistas/recompensas e feedbacks positivos para motivar os usuários
(Proposta inicial: utilizar a API disponível em "https://pokeapi.co/" que fornece diversas informações e imagens acerca de _Pokémon_, uma franquia de mídia criada em 1995 centrada em criaturas ficcionais chamadas _Pokémon_ e amplamente conhecida na cultura pop por meio de desenhos animados e jogos digitais)
* Serviço de autenticação: proteger as informações do usuário (nome, email e senha)
* Sistema de geração e validação de questões: capaz de gerar questõs automaticamente a partir de um algoritmo, incluindo a geração de alternativas e validação das respostas dos usuários
