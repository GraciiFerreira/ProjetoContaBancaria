package Agencia;

public class ContaEstudantil extends Conta{
	
	private float limiteEstudantil;
	
	public ContaEstudantil(int numero, long cpf, int dataAniversario, float saldo, boolean ativo) {
	    super(numero, cpf,dataAniversario , saldo, ativo);   
	    
	}
	    
	    public float getLimiteEstudantil() {
	        return limiteEstudantil;
	      }

	      public void setLimiteEstudantil(float limiteEstudantil) {
	        this.limiteEstudantil = limiteEstudantil;
	      }
	      
	      public void usarEstudantil(float valor) {
	        limiteEstudantil -= valor;
	  }

}
