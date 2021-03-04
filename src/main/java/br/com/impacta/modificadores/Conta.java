package br.com.impacta.modificadores;

public final class Conta {

	public static final int TEMPO_ESPERA_ABERTURA_CONTA = 10;
	
	int numero;
	String titular;
	double saldo;

	public static int getTempoDeEsperaParaFuncionarios() {
		return TEMPO_ESPERA_ABERTURA_CONTA / 2;
	}

}
