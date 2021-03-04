package br.com.impacta.herança;

public class AppHerança 
{
    public static void main( String[] args )
    {
        Conta cc = new ContaCorrente();
        cc.setNumero(123);
        cc.setSaldo(1500.00);
        cc.setTitular("Titular da Silva");
        
        Conta cp = new ContaPoupança();
        cp.setNumero(987);
        cp.setSaldo(10000.00);
        cp.setTitular("Titular da Silva");
        
        System.out.println(cc.exibeInfoConta());
        System.out.println(cp.exibeInfoConta());
        
        /*
        	Conta: 123 - Titular: Titular da Silva - Saldo: 1500.0
			Conta: 987 - Titular: Titular da Silva - Saldo: 10000.0 - Rendimento: 0
        */
    }
}
