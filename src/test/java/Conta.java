import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Conta {
	
	boolean tipoCliente = false;
	
	int solicitasaque;
	
	int saqueEspecial;
	int saldoEspecialAtual;
	int saldoEspecial;
	
	int saqueComum;
	int saldoComumAtual;
	int saldoComum;
	
	String erro = "Falha no metodo";

	
	Cliente cliente = new Cliente();
	
	@Given("Um cliente especial com saldo atual de {int} reais")
	public void um_cliente_especial_com_saldo_atual_de_reais(Integer int1) {
		
		
		cliente.setSaldoEspecial(int1);
		saldoEspecial = cliente.getSaldoEspecial();

		if (saldoEspecial != -200) {

			throw new io.cucumber.java.PendingException(erro);
		}
	}
	
	

	@When("For solicitado um saque no valor de {int} reais")
	public void for_solicitado_um_saque_no_valor_de_reais(Integer int1) {

		cliente.setSaqueEspecial(int1);
		solicitasaque = cliente.getSaqueEspecial();
		if (solicitasaque != 100) {
			throw new io.cucumber.java.PendingException(erro);
		}
	}

	@Then("deve efetuar o saque e atualizar o saldo da conta para {int} reais")
	public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(Integer int1) {

		if (tipoCliente = true && saldoEspecial < 0) {
			cliente.setSaldoEspecial(int1);
			saldoEspecialAtual = cliente.getSaldoEspecial();

		} else {
			throw new io.cucumber.java.PendingException(erro);
		}
	}

	
	@Given("Um cliente comum com saldo atual de {int} reais")
	public void um_cliente_comum_com_saldo_atual_de_reais(Integer int1) {

		cliente.setSaldoComum(int1);
		saqueComum = cliente.getSaldoComum();
		
		if (saqueComum != -300) {

			throw new io.cucumber.java.PendingException(erro);
		}
	}

	@When("Solicitar um saque de {int} reais")
	public void solicitar_um_saque_de_reais(Integer int1) {
		
		cliente.setSaqueComum(int1);
		solicitasaque = cliente.getSaqueComum();
		
		if(solicitasaque != 200) {
		
		throw new io.cucumber.java.PendingException(erro);
		}
	}

	@Then("Nao deve efetuar o saque e deve retornar a mensagem saldo insuficiente")
	public void nao_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() {
		
		if((saldoComumAtual != -300 && tipoCliente == false) && saqueComum < 0) {
			cliente.setSaqueComum(saqueComum);

		}else {
		throw new io.cucumber.java.PendingException(erro);
		}
	}
}