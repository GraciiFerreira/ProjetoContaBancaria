package Agencia;

public class Conta {
	
		private int numeroConta;
		private long cpf;
		private int dataAniversario;
		protected float saldo;
		private boolean ativo;

	  public Conta(int numeroConta, long cpf) {
	    this.numeroConta = numeroConta;
	    this.cpf = cpf;
	  }

	  public Conta(int numeroConta, long cpf, int dataAniversario, float saldo, boolean ativo) {
		
	}

	public int getNumero() {
	    return numeroConta;
	  }

	  public void setNumero(int numero) {
	    this.numeroConta = numero;
	  }

	  public long getCpf() {
	    return cpf;
	  }

	  public void setCpf(long cpf) {
	    this.cpf = cpf;
	  }
	  
	  public void setdata(int dataAniversario) {
		    this.dataAniversario = dataAniversario;
		  }

		  public int getdata() {
		    return dataAniversario;
		  }

	  public float getSaldo() {
			return saldo;
		}

		public void setSaldo(float saldo) {
			this.saldo = saldo;
		}

	public void debito(float valor) {
	    if(this.ativo) {
	      this.saldo -= valor; 
	    }       
	  }
	    
	  public void credito(double d) {
	    if(this.ativo) {
	      this.saldo += d;
	    }  
	  }

	public void debito(double d) {
		// TODO Auto-generated method stub
		
	}   
	 }

