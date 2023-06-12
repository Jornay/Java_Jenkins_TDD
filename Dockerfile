# Define a imagem base
FROM openjdk:11-jdk-slim

# Define o diretório de trabalho
WORKDIR /AF

# Copia o arquivo JAR para o diretório de trabalho
COPY target/*.war /AF/AF-1.0-SNAPSHOT.war

EXPOSE 8080

# Define o comando de inicialização da aplicação
CMD java -XX:+UseContainerSupport -Xmx512m -jar AF-1.0-SNAPSHOT.war
