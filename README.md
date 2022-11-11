# # ♦ Exercicio de testes em Cucumber - Facens ♦

##  :desktop_computer:  Arquitetura de Software no Desenvolvimento

* Eclipse - backend.

## 🛠️ Construído com

*  Java / Gherkin (Cucumber)

## 📚 Descrição
Exercicio para composição de nota e obtenção de conhecimentos em Testes de Software, criação de uma feature com 4 cenários, coloca-la em um ambiente de testes.

## 🎬 Features e Cenários
* Feature: Cliente faz saque de dinheiro como um cliente, eu gostaria de sacar dinheiro em caixa eletrônico,
para que eu não tenha que esperar numa fila de banco.

* Cenário 1: Cliente especial com saldo negativo
Given - Um cliente especial com saldo atual de -200 reais 
When - For solicitado um saque no valor de 100 reais
Then - Deve efetuar o saque e atualizar o saldo da conta para -300 reais

* Cenário 2: Cliente comum com saldo negativo
Given - Um cliente comum com saldo atual de -300 reais
When - Solicitar um saque de 200 reais
Then - Não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente

## 🎯 Objetivo
Efetuar os testes nos cemários, descobrir a importancia de testes e implanta-lo na aplicação, obter conhecimento em como os testes devem ser implementados e organizados, evitar falhas e problemas futuros.

## ⁉ Como Acessar?
Para ter o projeto em sua máquina, é necessário efetuar o clone em uma pasta desejada, e abrir com sua IDE de preferência.

## 🧑 Integrantes
* Lucas Machado Vieira - Contato: vieiraalucas1@gmail.com.
