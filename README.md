# Java Jenkins TDD

Este é um projeto Java que utiliza Jenkins para integração contínua e segue a metodologia de desenvolvimento orientado a testes (TDD).

## Pré-requisitos

- Java 8 ou superior
- Jenkins
- Maven

## Configuração

1. Clone o repositório para a sua máquina local usando `https://github.com/Jornay/Java_Jenkins_TDD.git`.
2. Navegue até a pasta do projeto e execute `mvn clean install` para instalar as dependências.

## Executando os testes

Os testes podem ser executados com o comando `mvn test`.

## Jenkins

Para configurar o Jenkins para este projeto, siga os passos abaixo:

1. Instale o Jenkins na sua máquina.
2. Crie um novo job no Jenkins e configure-o para usar este repositório.
3. Configure o job para executar `mvn clean install` como um passo de build.
4. Configure o job para executar os testes com `mvn test`.

## Contribuindo

Pull requests são bem-vindos. Para mudanças importantes, por favor, abra uma issue primeiro para discutir o que você gostaria de mudar.

## Licença

[MIT](https://choosealicense.com/licenses/mit/)
