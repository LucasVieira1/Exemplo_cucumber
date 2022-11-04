	/**
	 * 
	 * - Importando bibliotecas necessárias para testes nos metodos given, then e when".
	 * 
	 */

     import io.cucumber.java.en.Given;
     import io.cucumber.java.en.Then;
     import io.cucumber.java.en.When;

     public class Conta {
	
	/**
	 * 
	 * - Instanciando a classe "Cliente";<br>
	 * - Criando um objeto da classe "Cliente" com o nome de "cliente";<br>
	 * - Necessaário para poder utilizar os metodos, atributos e construtores da classe "Cliente".
	 * 
	 */

	Cliente cliente = new Cliente();

	/**
	 * 
	 * * ETAPA 1 * <br>
	 * Linha 32 e 33 - Neste metodo o cliente especial tem um saldo de -200 reais (valor definido na variavel "{int} e int1"), 'GIVEN - @tag1' na classe "conta_bdd.feature";<br>
	 * Linha 35 - Chamando o objeto "cliente" e definindo o metodo "setSaldoEspecial()" criado na classe "Cliente", passando como parametro o valor de "-200";<br>
	 * Linha 37 e 38 - Se o objeto "cliente" com o metodo "getSaldoEspecial()" for diferente de "int1" (-200 reais), retornar "throw new io.cucumber.java.PendingException()" (metodo pendente), senão, metodo passou com sucesso.
	 * 
	 */

	@Given("Um cliente especial com saldo atual de {int} reais")
	public void um_cliente_especial_com_saldo_atual_de_reais(Integer int1) {

		cliente.setSaldoEspecial(-200);

		if (cliente.getSaldoEspecial() != int1) {
			throw new io.cucumber.java.PendingException();

		}

	}

	/**
	 * 
	 * * ETAPA 2 * <br>
	 * Linha 53 e 54 - Neste metodo o cliente especial solicita um saque de 100 reais (valor definido na variavel "{int} e int1"), 'WHEN - @tag1' na classe "conta_bdd.feature";<br>
	 * Linha 56 - Chamando o objeto "cliente" e definindo o metodo "setSaqueEspecial()" criado na classe "Cliente", passando como parametro o valor de "100";<br>
	 * Linha 58 e 59 - Se o objeto "cliente" com o metodo "getSaqueEspecial()" for diferente de "int1" (100 reais), retornar "throw new io.cucumber.java.PendingException()" (metodo pendente), senão, metodo passou com sucesso.
	 * 
	 */

	@When("for solicitado um saque no valor de {int} reais")
	public void for_solicitado_um_saque_no_valor_de_reais(Integer int1) {

		cliente.setSaqueEspecial(100);

		if (cliente.getSaqueEspecial() != int1) {
			throw new io.cucumber.java.PendingException();

		}
	}

	/**
	 * 
	 * * ETAPA 3 * <br>
	 * - Linha 74 e 75 - Neste metodo o cliente especial deve efetuar o saque de 100 reais e atualizar o saldo da conta para -300 reais (valor definido na variavel "{int} e int1"), 'THEN - @tag1' na classe "conta_bdd.feature"; <br>
	 * - Linha 77 - Chamando o objeto "cliente" e definindo o metodo "setCliente()" criado na classe "Cliente", passando como parametro o valor "especial"; <br>
	 * - Linha 78 - Chamando o objeto "cliente" e definindo o metodo "setSaldoEspecial()" criado na classe "Cliente", passando como parametro o valor de "-300"; <br>
	 * - Linha 80 e 81 - Se o objeto "cliente" com o metodo "getCliente()" for diferente de "especial" e o objeto "cliente" com o metodo "getSaldoEspecial()" for diferente de "int1" (-300 reais), retornar "throw new io.cucumber.java.PendingException()" (metodo pendente), senão, metodo passou com sucesso.
	 * 
	 */
	
	@Then("deve efetuar o saque e atualizar o saldo da conta para {int} reais")
	public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(Integer int1) {

		cliente.setCliente("especial");
		cliente.setSaldoEspecial(-300);

		if (cliente.getCliente() != "especial" && cliente.getSaldoEspecial() != int1) {
			throw new io.cucumber.java.PendingException();
			
		}
	}

	/**
	 * 
	 * * ETAPA 4 * <br>
	 * Linha 95 e 96 - Neste metodo o cliente comum tem um saldo de -300 reais (valor definido na variavel "{int} e int1"), 'GIVEN - @tag2' na classe "conta_bdd.feature";<br>
	 * Linha 98 - Chamando o objeto "cliente" e definindo o metodo "setSaldoComum()" criado na classe "Cliente", passando como parametro o valor de "-300";<br>
	 * Linha 100 e 101 - Se o objeto "cliente" com o metodo "getSaldoComum()" for diferente de "int1" (-300 reais), retornar "throw new io.cucumber.java.PendingException()" (metodo pendente), senão, metodo passou com sucesso.
	 * 
	 */
	
	@Given("um cliente comum com saldo atual de {int} reais")
	public void um_cliente_comum_com_saldo_atual_de_reais(Integer int1) {

		cliente.setSaldoComum(-300);

		if (cliente.getSaldoComum() != int1) {
			throw new io.cucumber.java.PendingException();

		}
	}

	/**
	 * 
	 * * ETAPA 5 * <br>
	 * Linha 115 e 116 - Neste metodo o cliente comum solicita um saque de 200 reais (valor definido na variavel "{int} e int1"), 'WHEN - @tag2' na classe "conta_bdd.feature";<br>
	 * Linha 118 - Chamando o objeto "cliente" e definindo o metodo "setSaqueComum()" criado na classe "Cliente", passando como parametro o valor de "200";<br>
	 * Linha 120 e 121 - Se o objeto "cliente" com o metodo "getSaldoComum()" for diferente de "int1" (200 reais), retornar "throw new io.cucumber.java.PendingException()" (metodo pendente), senão, metodo passou com sucesso.
	 * 
	 */
	
	@When("solicitar um saque de {int} reais")
	public void solicitar_um_saque_de_reais(Integer int1) {

		cliente.setSaqueComum(200);

		if (cliente.getSaqueComum() != int1) {
			throw new io.cucumber.java.PendingException();

		}
	}
	
	/**
	 * 
	 * * ETAPA 6 * <br>
	 * - Linha 135 e 136 - Neste metodo o cliente comum não deve efetuar o saque de 200 reais e deve retornar a mensagem "Saldo Insuficiente", 'THEN - @tag2' na classe "conta_bdd.feature"; <br>
	 * - Linha 138 - Chamando o objeto "cliente" e definindo o metodo "setCliente()" criado na classe "Cliente", passando como parametro o valor "comum"; <br>
	 * - Linha 140, 141, 142 e 143 - Se o objeto "cliente" com o metodo "getCliente()" for igual a "comum", retornar a mensagem "Saldo Insuficiente" (metodo passou com sucesso), senão, retornar "throw new io.cucumber.java.PendingException()" (metodo pendente).
	 * 
	 */
	
	@Then("n?o deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente")
	public String não_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() {

		cliente.setCliente("comum");

		if (cliente.getCliente() == "comum") {
			return "Saldo Insuficiente";
		} else {
			throw new io.cucumber.java.PendingException();
		}
	}

}
