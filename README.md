# Java Jenkins TDD

Este é um projeto Java que utiliza o Jenkins para integração contínua e segue a metodologia de desenvolvimento orientado a testes (TDD).

## Pré-requisitos

- Java 8 ou superior
- Jenkins
- Maven

## Configuração

1. Clone o repositório para a sua máquina local utilizando o seguinte comando:
`git clone https://github.com/Jornay/Java_Jenkins_TDD.git`


2. Navegue até a pasta do projeto e execute o seguinte comando para instalar as dependências:
`mvn clean install`

## Executando os Testes

Os testes podem ser executados utilizando o comando:
`mvn test`


## Configurando o Jenkins

Para configurar o Jenkins para este projeto, siga os passos abaixo:

1. Instale o Jenkins na sua máquina.
2. Crie um novo job no Jenkins e configure-o para utilizar este repositório.
3. Configure o job para executar `mvn clean install` como uma etapa de build.
4. Configure o job para executar os testes com `mvn test`.

## Contribuições

Pull requests são bem-vindos. Para alterações significativas, por favor, abra uma issue primeiro para discutir o que você gostaria de mudar.

## Licença

Este projeto está licenciado sob a [Licença MIT](https://choosealicense.com/licenses/mit/).

