package br.com.impacta.herança;

public class AppInstanceof 
{
    public static void main( String[] args )
    {
        Conta cc = new ContaCorrente();       
        
        if (cc instanceof ContaCorrente) {
        	System.out.println("É uma conta corrente");
        } else {
        	System.out.println("Não é uma conta corrente");
        }
        
        /*
         	É uma conta corrente
         */

    }
}
