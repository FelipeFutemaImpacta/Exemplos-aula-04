package br.com.impacta.interfaces;

public class SQLServer implements BancoDeDados{

	public String getConnectionDescription() {
		return "jdbc:sqlserver://192.188.0.1";
	}

	public String getNome() {
		return "SQL Server";
	}

	public String salvarDado() {
		return "Salvando dados no SQL Server";
	}

	public String pegarDado() {
		return "Buscando dados no SQL Server";
	}

}
