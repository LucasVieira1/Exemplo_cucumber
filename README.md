# # ♦ Implementação do JUnit - Facens ♦

##  :desktop_computer:  Arquitetura de Software no Desenvolvimento

* Eclipse - backend.

## 🛠️ Construído com

*  Java / JUnit

## 📚 Descrição
Implementação dos testes em JUnit e testar os cenários criados.

## 📄 Testes com JUnit
JUnit é uma API de código aberto para a criação de testes unitários em Java, bem como outras linguagem compatíveis com a JVM, com o junit é permitido criar testes que são fáceis de escrever e executar, evitandos problemas futuros na sua aplicação.

## 🔧 Tipo de cliente
Ao iniciar os testes, existe a opção de escolher testar por cliente Comum (false) ou cliente especial (true).

![image](https://user-images.githubusercontent.com/92065269/201441315-a3dd685e-646e-448d-a43d-898a99e5be14.png)![image](https://user-images.githubusercontent.com/92065269/201441250-ed44e226-7816-4162-b491-d992c07315c3.png)

## 🤵 Cliente especial
 Se o cliente for especial e seu saldo for negativo, ao tentar efetuar qualquer saque o sistema deve deixar e bloquear o cliente comum de efetuar um saque com saldo negativo (seu saldo é insuficiente), 5 medotodos passam e 1 não .

![image](https://user-images.githubusercontent.com/92065269/201438779-5ba99e12-6666-41b0-ac23-fd0e677c1d2c.png)

![image](https://user-images.githubusercontent.com/92065269/201439001-fdadc8a9-6c3f-4aeb-8d69-d75ff39a8e8d.png)

![image](https://user-images.githubusercontent.com/92065269/201439518-7ee703ba-ccba-4b85-9415-585c0344c989.png)

O metodo nao_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() não deve passar.

![image](https://user-images.githubusercontent.com/92065269/201441396-d8cc6838-e6ff-43e6-9f92-868e8f6a314c.png)

## 🙍‍♂️ Cliente comum
Se o cliente for comum e seu saldo for negativo, ao tentar efetuar qualquer saque o sistema não deve deixar e todos os testes devem passar, pois os metodos foram criados para gerar o erro "saldo insuficiente".

![image](https://user-images.githubusercontent.com/92065269/201439194-80c137c4-2fa1-4a64-abe3-3d1db254dc1e.png)

![image](https://user-images.githubusercontent.com/92065269/201439098-47ddbc58-a327-403c-b21f-856d839c257c.png)

## ⁉ Como Acessar?
Para ter o projeto em sua máquina, é necessário efetuar o clone em uma pasta desejada, e abrir com sua IDE de preferência.

## 🧑 Integrantes
* Lucas Machado Vieira - Contato: vieiraalucas1@gmail.com.
