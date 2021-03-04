package br.com.impacta.construtores;

public class AppConstrutores 
{
    public static void main( String[] args )
    {
    	Conta conta1 = new Conta();
    	conta1.setNumero(555);
    	conta1.setTitular("Titular Numero Um");
    	conta1.setSaldo(150.00);
    	
    	Conta conta2 = new Conta(123, "Titular Numero Dois");
    	Conta conta3 = new Conta(658, "Titular Numero Tres", 5000.00);
    	
    	System.out.println("Conta 1 -> Numero: " + conta1.getNumero() +
    						" - Titular: " + conta1.getTitular() +
    						" - Saldo: " + conta1.getSaldo());
    	

    	System.out.println("Conta 2 -> Numero: " + conta2.getNumero() +
    						" - Titular: " + conta2.getTitular() +
    						" - Saldo: " + conta2.getSaldo());
    	

    	System.out.println("Conta 2 -> Numero: " + conta3.getNumero() +
    						" - Titular: " + conta3.getTitular() +
    						" - Saldo: " + conta3.getSaldo());
    	
    }
}
