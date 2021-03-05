package br.com.impacta.interfaces;

public class ArquivoDeTexto implements BancoDeDados {

	public String salvarDado() {
		// TODO Auto-generated method stub
		return "Salvando no arquivo Texto";
	}

	public String pegarDado() {
		// TODO Auto-generated method stub
		return "Pegando de um arquivo Texto";
	}

	public String getConnectionDescription() {
		// TODO Auto-generated method stub
		return "file://x/temp";
	}

	public String getNome() {
		// TODO Auto-generated method stub
		return "Arquivo de texto";
	}

}
