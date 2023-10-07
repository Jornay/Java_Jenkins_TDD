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

| Author | Description |
| :---: | :--- |
| <img src="https://avatars.githubusercontent.com/u/70240646?v=4" width="170"> | **Matheus Jacob Bendel (https://github.com/Matheus-jacobb)**<br> Developer/Student.<br> ||
<img src="https://avatars.githubusercontent.com/u/69996623?v=4" width="170"> | **Antonio Luis Canno de Araujo (https://github.com/tonicocanno)**<br> Developer/Student.<br> 
||
<img src="https://avatars.githubusercontent.com/u/70176420?v=4" width="170"> | **Guilherme Koji Yamada (https://github.com/gkojiyamada)**<br> Developer/Student.<br> ||
||
<img src="https://avatars.githubusercontent.com/u/52716819?v=4" width="170"> | **Lucas de Abreu Furtado Garcia (https://github.com/Jornay)**<br> Developer/Student.<br> ||

## Licença

Este projeto está licenciado sob a [Licença MIT](https://choosealicense.com/licenses/mit/).

