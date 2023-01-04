# Calculadora do Teorema de Pitágoras

## Nome
Calculadora do Teorema de Pitágoras

## Descrição
Desenvolver a camada de front-end utilizando angular, typescript, html, css e bootstrap, onde é possível visualizar a calculadora que é capaz de calcular a relação entre os lados de um triângulo retângulo (teorema de Pitágora), vinculando ao back-end para fazer os serviços.

## Funcionalidades
A calculadora recebe os valores dos catetos (adjacente e oposto) para calcular o valor da hipotenusa.

## Tecnologias
- Angular v15.0
- TypeScript v4.8
- HTML 
- CSS 
    - Bootstrap v5.2
    - Theme -> <a href="https://preview.themeforest.net/item/appui-web-app-bootstrap-admin-template/full_screen_preview/8603616?_ga=2.73952081.2106764338.1664374441-134612274.1658964739&_gac=1.249766388.1664399279.CjwKCAjw4c-ZBhAEEiwAZ105RfVFkki2LhG_EEcKRf8QDWSipGxg97bLkIrKy7zWRz2XKmRbX-_1FBoClqMQAvD_BwE" target="_blank">pixelcave</a> 

## Requisitos
- Angular CLI: v15.0
- Node: v16.17
## Inicialização 
### Docker
1 - Construa a imagem no seu docker:
```bash
docker build . -t front-calculator-pythagoras
```
2 - Inicializar a imagem na porta 80:
```bash
docker run --name front-calculator-pythagoras -p 80:80 -d front-calculator-pythagoras
```
3 - Acesse o front-end em <a href="http://localhost" target="_blank">http://localhost
### Local
1 - Instale as dependências do npm:
```
npm install
```
2 - Construa seu projeto no node/ng:
```bash
ng build
```
3 - Inicializar via terminal:
```bash
ng serve --port 80
```
4 - Acesse o front-end em <a href="http://localhost" target="_blank">http://localhost
<p>Observações:
<p><ul>- Para um funcionamento adequado, inicialize o back-end.</ul>
<p><ul>- Caso não tenha docker alterar o arquivo proxy.conf.json no campo target deixar 'http://localhost', para evitar problemas de CORS .</ul>

## Colaboradores
Bruna Stefani Moreira Torres Francisco - <a href="https://www.linkedin.com/in/bruna-moreira-torres-francisco/" target="_blank">LinkedIn</a>

## Status do Projeto
Concluído.
