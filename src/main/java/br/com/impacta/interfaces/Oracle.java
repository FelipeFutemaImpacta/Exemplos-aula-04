package br.com.impacta.interfaces;

public class Oracle implements BancoDeDados{

	public String getConnectionDescription() {
		return "jdbc:oracle://192.188.0.1";
	}

	public String getNome() {
		return "";
	}

	public String executaProcedure(){
		return "Executando Procedure no Oracle";
	}

	public String salvarDado() {
		return "Salvando dados no Oracle";
	}

	public String pegarDado() {
		return "Buscando dados no Oracle";
	}

}
