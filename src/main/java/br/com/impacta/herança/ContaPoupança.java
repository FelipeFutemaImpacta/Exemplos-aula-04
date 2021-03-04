package br.com.impacta.herança;

public class ContaPoupança extends Conta {

	private int rendimentoMensal;

	public int getRendimentoMensal() {
		return rendimentoMensal;
	}

	public void setRendimentoMensal(int rendimentoMensal) {
		this.rendimentoMensal = rendimentoMensal;
	}

	@Override
	public String exibeInfoConta() {
		return "Conta: " + super.getNumero() + 
				" - Titular: " + super.getTitular() + 
				" - Saldo: " + super.getSaldo() +
				" - Rendimento: " + this.rendimentoMensal;
	}

}
