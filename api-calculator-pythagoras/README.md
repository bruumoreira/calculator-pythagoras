# Calculadora do Teorema de Pitágoras

## Nome
Calculadora do Teorema de Pitágoras

## Descrição
Desenvolver a camada de back-end de uma calculadora que seja capaz de calcular a relação entre os lados de
um triângulo retângulo (teorema de Pitágora).

## Funcionalidades
A calculadora recebe os valores dos catetos (adjacente e oposto) para calcular o valor da
hipotenusa.

## Tecnologias
- Java v17
- Springboot v2.7
- Maven v5.4

## Requisitos
- JDK v17

## Inicialização
### Docker
1 - Construa a imagem no seu docker:
```bash
docker build . -t api-calculator-pythagoras
```
2 - Inicializar a imagem na porta 8080:
```bash
docker run --name api-calculator-pythagoras -p 8080:8080 -d api-calculator-pythagoras
```
3 - Acesse a api em <a href="http://localhost:8080/swagger-ui/index.html#/" target="_blank">http://localhost:8080/swagger-ui/index.html
### Local
1 - Construa seu projeto no maven: 
```bash
mvn clean install
```
2 - Importe o seu projeto no eclipse ou intelliJ
3 - Inicializar o arquivo CalculatorPyhtagorasApplication
4 - Acesse a api em <a href="http://localhost:8080/swagger-ui/index.html#/" target="_blank">http://localhost:8080/swagger-ui/index.html

## Colaboradores
Bruna Stefani Moreira Torres Francisco <a href="https://www.linkedin.com/in/bruna-moreira-torres-francisco/" target="_blank">LinkedIn</a>

## Status do Projeto
Concluído.
