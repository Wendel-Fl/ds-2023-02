# Design de software para ler arquivo .csv

## Objetivo
O objetivo é produzir um software que lê um arquivo no formato CSV e, para cada linha, calcula a soma das duas primeiras colunas e gera um arquivo CSV. O arquivo gerado deve conter as mesmas linhas, mas com uma coluna adicional contendo a soma das duas primeiras colunas.

## Design
### Interface de usuário
   - O software pode ter uma interface de usuário simples para que os usuários possam selecionar o arquivo de entrada e especificar o nome do arquivo de saída.

### Funcionalidade principal:
   - Entrada de Arquivo: 
     - Selecionar o arquivo csv de entrada.
   - Processamento do Arquivo:
     - O software lê o arquivo CSV de entrada linha por linha.
     - Para cada linha, ele extrai os valores das duas primeiras colunas e calcula a soma.
     - Adiciona a soma como um novo valor à linha.
   - Saída do Arquivo:
     - O software cria um novo arquivo CSV de saída com um nome especificado pelo usuário ou com um nome padrão.
     - Ele escreve as linhas processadas, incluindo a nova coluna com a soma, no arquivo de saída.

### Tratamento de Erros:
   - O software deve ser capaz de lidar com erros, como arquivos de entrada ausentes, formatos de arquivo inválidos ou valores não numéricos nas colunas.

### Considerações Adicionais:
   - Uma barra de progresso ou indicador de progresso pode ser útil para mostrar o progresso do processamento, especialmente se o arquivo de entrada for grande.

### Fluxo de Uso:
   1. O usuário inicia o aplicativo.
   2. Seleciona o arquivo CSV de entrada.
   3. Define as opções de configuração, se necessário.
   4. Escolhe um nome de arquivo para o arquivo de saída.
   5. Inicia o processo de processamento.
   6. O aplicativo processa o arquivo e cria um novo arquivo CSV com as somas.
   7. O usuário recebe uma notificação ou mensagem de conclusão quando o processo é concluído.
   8. O usuário pode acessar o arquivo de saída gerado.