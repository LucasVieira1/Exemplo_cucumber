
public class Cliente {
	
	//Criação dos atributos que serão utilizados.

	private String cliente;

	private int saldoEspecial;
	private int saqueEspecial;

	private int saldoComum;
	private int saqueComum;
	
	/**
	 * 
	 * - Criação do construtor vazio da classe.
	 * 
	 */
	
	public Cliente() {
		super();
	}
	
	// - Criação dos getters e setters dos atributos criados.
	// - Os metodos vão ser utilizados na classe "Conta" quando instanciados e chamados.

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
