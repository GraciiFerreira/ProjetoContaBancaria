package Agencia;

public class ContaPoupanca extends Conta{
	
	private int diaAniversario;

	  public ContaPoupanca(int numeroConta, long cpf, int dataAniversario, float saldo, boolean ativo) {
	    super(numeroConta, cpf, dataAniversario, saldo, ativo);
	    this.diaAniversario = dataAniversario;
	  }

	  public int getDiaAniversario() {
	    return diaAniversario;
	  }

	  public void setDiaAniversario(int diaAniversario) {
	    this.diaAniversario = diaAniversario;
	  }

	 
	  public void correcao(int dataAniversario) {
	   
				
			}
	
}	
		
			
				
		

		
	
	 
	
		
	
	


		

	
	
	
	


