# Java Jenkins TDD

This is a Java project that utilizes Jenkins for continuous integration and follows the Test-Driven Development (TDD) methodology.

## Prerequisites

- Java 8 or higher
- Jenkins
- Maven

## Configuration

1. Clone the repository to your local machine using the following command:

`git clone https://github.com/Jornay/Java_Jenkins_TDD.git`

2. Navigate to the project folder and execute the following command to install the dependencies:
`mvn clean install`


## Running Tests

Tests can be executed using the following command:
`mvn test`

## Setting up Jenkins

To configure Jenkins for this project, follow the steps below:

1. Install Jenkins on your machine.
2. Create a new Jenkins job and configure it to use this repository.
3. Configure the job to execute `mvn clean install` as a build step.
4. Configure the job to run tests with `mvn test`.

## Contributions

Pull requests are welcome. For significant changes, please open an issue first to discuss what you would like to change.

| Author | Description |
| :---: | :--- |
| <img src="https://avatars.githubusercontent.com/u/70240646?v=4" width="130"> | **Matheus Jacob Bendel (https://github.com/Matheus-jacobb)**<br> Developer/Student.<br> ||
<img src="https://avatars.githubusercontent.com/u/69996623?v=4" width="130"> | **Antonio Luis Canno de Araujo (https://github.com/tonicocanno)**<br> Developer/Student.<br> 
||
<img src="https://avatars.githubusercontent.com/u/70176420?v=4" width="130"> | **Guilherme Koji Yamada (https://github.com/gkojiyamada)**<br> Developer/Student.<br> ||
||
<img src="https://avatars.githubusercontent.com/u/52716819?v=4" width="130"> | **Lucas de Abreu Furtado Garcia (https://github.com/Jornay)**<br> Developer/Student.<br> ||

## License

This project is licensed under the [MIT License](https://choosealicense.com/licenses/mit/).

