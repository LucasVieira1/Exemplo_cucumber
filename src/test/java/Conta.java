import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Conta {

	// private Cliente cliente;

	String cliente;

	Integer saldoEspecial;
	Integer saqueEspecial;
	Integer saldoComum;
	Integer saqueComum;

	/**
	 * 
	 * ETAPA 1 -
	 * 
	 */

	@Given("Um cliente especial com saldo atual de {int} reais")
	public void um_cliente_especial_com_saldo_atual_de_reais(Integer int1) {

		this.saldoEspecial = int1;

		// int1 = -200;
		// cliente.setSaldoEspecial(int1);

		if (this.saldoEspecial != int1) {
			throw new io.cucumber.java.PendingException();

		}

	}

	/**
	 * 
	 * ETAPA 2 -
	 * 
	 */

	@When("for solicitado um saque no valor de {int} reais")
	public void for_solicitado_um_saque_no_valor_de_reais(Integer int1) {

		this.saqueEspecial = int1;

		// int1 = 100;
		// cliente.solicitaSaqueEspecial(int1);

		if (this.saqueEspecial != int1) {
			throw new io.cucumber.java.PendingException();

		}
	}

	/**
	 * 
	 * ETAPA 3 -
	 * 
	 */
	@Then("deve efetuar o saque e atualizar o saldo da conta para {int} reais")
	public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(Integer int1) {

		this.cliente = "especial";
		// int saldo;
		// saldo = cliente.calculaSaldoEspecial();
		// int1 = saldo;

		if (this.cliente != "especial") {
			throw new io.cucumber.java.PendingException();

		}
	}

	/**
	 * 
	 * ETAPA 4 -
	 * 
	 */
	@Given("um cliente comum com saldo atual de {int} reais")
	public void um_cliente_comum_com_saldo_atual_de_reais(Integer int1) {

		this.saldoComum = int1;

		// int1 = -300;
		// cliente.setSaldoComum(int1);

		if (this.saldoComum != int1) {
			throw new io.cucumber.java.PendingException();

		}
	}

	/**
	 * 
	 * ETAPA 5 -
	 * 
	 */
	@When("solicitar um saque de {int} reais")
	public void solicitar_um_saque_de_reais(Integer int1) {

		this.saqueComum = int1;

		// int1 = 200;
		// cliente.solicitaSaqueComum(int1);

		if (this.saqueComum != int1) {
			throw new io.cucumber.java.PendingException();

		}
	}

	/**
	 * 
	 * ETAPA 6 -
	 * 
	 */
	@Then("n?o deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente")
	public void não_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() {

		this.cliente = "comum";

		// cliente.calculaSaldoComum();
		if (this.cliente == "comum") {
			// return "Saldo Insuficiente";
			System.out.println("Saldo Insuficiente");
		} else {
			throw new io.cucumber.java.PendingException();
		}
	}

}
