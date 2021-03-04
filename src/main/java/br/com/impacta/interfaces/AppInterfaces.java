package br.com.impacta.interfaces;

import br.com.impacta.interfaces.BancoDeDados;
import br.com.impacta.interfaces.Mysql;
import br.com.impacta.interfaces.SQLServer;

public class AppInterfaces 
{
    public static void main( String[] args )
    {
        BancoDeDados banco1 = new Mysql();
        System.out.println(banco1.getNome());
        System.out.println(banco1.salvarDado());
        System.out.println(banco1.pegarDado());
        
        BancoDeDados banco2 = new SQLServer();
        System.out.println(banco2.getNome());
        System.out.println(banco2.salvarDado());
        System.out.println(banco2.pegarDado());
        
        /*
          Retorno console:
          	MYSQL
			Salvando dados no MYSQL
			Buscando dados no MYSQL
			SQL Server
			Salvando dados no SQL Server
			Buscando dados no SQL Server       
         */
    }
}
