
public class Cliente {

	private int saldoEspecial = 0;
	private int saqueEspecial;
	private int saldoEspecialAtt;

	private int saldoComum = 0;
	private int saqueComum;
	private int saldoComumAtt;
	

	public Cliente() {
		super();
	}

	public int solicitaSaqueEspecial(int saque) {
		this.saldoEspecial = this.saldoEspecial - saque;
		return saque;
	}

	public int calculaSaldoEspecial() {
		saldoEspecialAtt = this.saldoEspecial - this.saqueEspecial;
		return saldoEspecialAtt;
	}

	public int solicitaSaqueComum(int saque) {
		this.saldoComum = this.saldoComum - saque;
		return saque;
	}

	public String calculaSaldoComum() {
		if (this.saqueComum <= this.saldoComum) {
			return "Saque efetuado";
		}
		saldoComumAtt = this.saldoComum - this.saldoComum;
		return "Saldo Insuficiente";

	}

	public int getSaldoComum() {
		return saldoComum;
	}

	public void setSaldoComum(int saldoComum) {
		this.saldoComum = saldoComum;
	}

	public int getSaldoEspecialAtt() {
		return saldoEspecialAtt;
	}

	public void setSaldoEspecialAtt(int saldoEspecialAtt) {
		this.saldoEspecialAtt = saldoEspecialAtt;
	}

	public int getSaldoEspecial() {
		return saldoEspecial;
	}

	public void setSaldoEspecial(int saldoEspecial) {
		this.saldoEspecial = saldoEspecial;
	}

}
