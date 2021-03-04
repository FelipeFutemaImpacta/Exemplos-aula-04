package br.com.impacta.interfaces;

public class Mysql implements BancoDeDados{

	public String getConnectionDescription() {
		return "jdbc:mysql://localhost";
	}

	public String getNome() {
		return "MYSQL";
	}

	public String salvarDado() {
		return "Salvando dados no MYSQL";
	}

	public String pegarDado() {
		return "Buscando dados no MYSQL";
	}

}
