package Agencia;

public class ContaCorrente extends Conta {
		
	int contadorTalao;
	
	public ContaCorrente(int numero, long cpf, int dataAniversario, float saldo, boolean ativo) {
	    super(numero, cpf, dataAniversario, saldo, ativo);
	  }

	  public int getContadorTalao() {
	    return contadorTalao;
	  }

	  public void setContadorTalao(int contadorTalao) {
	    this.contadorTalao = contadorTalao;
	  }

	  public void pedirTalao(int contadorTalao) {
	    this.contadorTalao = contadorTalao; 
	  }

	public static void getContadorTalao(int qtdCheque) {
		// TODO Auto-generated method stub
		
	}
	
}


