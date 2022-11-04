
public class Cliente {
	
	//Cria��o dos atributos que ser�o utilizados.

	private String cliente;

	private int saldoEspecial;
	private int saqueEspecial;

	private int saldoComum;
	private int saqueComum;
	
	/**
	 * 
	 * - Cria��o do construtor vazio da classe.
	 * 
	 */
	
	public Cliente() {
		super();
	}
	
	// - Cria��o dos getters e setters dos atributos criados.
	// - Os metodos v�o ser utilizados na classe "Conta" quando instanciados e chamados.

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getSaldoEspecial() {
		return saldoEspecial;
	}

	public void setSaldoEspecial(int saldoEspecial) {
		this.saldoEspecial = saldoEspecial;
	}

	public int getSaqueEspecial() {
		return saqueEspecial;
	}

	public void setSaqueEspecial(int saqueEspecial) {
		this.saqueEspecial = saqueEspecial;
	}

	public int getSaldoComum() {
		return saldoComum;
	}

	public void setSaldoComum(int saldoComum) {
		this.saldoComum = saldoComum;
	}

	public int getSaqueComum() {
		return saqueComum;
	}

	public void setSaqueComum(int saqueComum) {
		this.saqueComum = saqueComum;
	}

}
