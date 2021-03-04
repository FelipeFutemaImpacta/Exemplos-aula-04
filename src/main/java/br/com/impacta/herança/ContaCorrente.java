package br.com.impacta.herança;

public class ContaCorrente extends Conta {

	@Override
	public String exibeInfoConta() {
		return "Conta: " + super.getNumero() + 
				" - Titular: " + super.getTitular() +
				" - Saldo: " + super.getSaldo();
	}

}
