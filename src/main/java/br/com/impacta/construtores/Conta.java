package br.com.impacta.construtores;

public class Conta {

	private int numero;
	private String titular;
	private double saldo;

	//Construtor padrão, só é necessário coloca-lo aqui porque
	//temos mais construtores definidos nessa classe
	public Conta() {};
	
	//Construtor para contas que necessitam de todos os dados para ser criada
	public Conta(int numero, String titular, double saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	//Construtor para contas que iniciam com saldo zerado
	public Conta(int numero, String titular) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = 0;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

}
