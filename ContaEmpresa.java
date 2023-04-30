package Agencia;

public class ContaEmpresa extends Conta{
	
	float emprestimoEmpresa;
	
	 public ContaEmpresa(int numero, long cpf, int dataAniversario, float saldo, boolean ativo) {
		    super(numero, cpf,dataAniversario , saldo, ativo);   
		  }

		  public float getEmprestimoEmpresa() {
		    return emprestimoEmpresa;
		  }

		  public void setEmprestimoEmpresa(float emprestimoEmpresa) {
		    this.emprestimoEmpresa = emprestimoEmpresa;
		  }
		  
		  public void Emprestimo(float valor) {
		    emprestimoEmpresa -= valor;
		    saldo += valor;
		  }
}
