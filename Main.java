package Agencia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Conta contaPoupanca = new ContaPoupanca(2626, 445578578, 26, 0, true);
		Conta contaCorrente = new ContaCorrente(2626, 445578578, 26, 0, true);
		Conta contaEspecial = new ContaEspecial(2626, 445578578, 26, 0, true);
		Conta contaEmpresarial = new ContaEmpresa(2626, 445578578, 26, 0, true);
		Conta contaEstudantil = new ContaEstudantil(2626, 445578578, 26, 0, true);
	    int opcao, dia, x = 10, qtdCheque=0, limite=1000, debitar = 0;
	    char movimento = 0, continuar = 'S', Cheque, pegarEmprestimo = 'S';
	    float valor = 0, valorEmprestimo=10000, valorPego=0, EmprestimoE=5000;
		double soma=0, soma1=0, soma2=0, somaTotal=0, somaTotal1=0;
		double saldo=0, saldoAtual=0;
		
		
		System.out.println("\n\n************************************************************");
		System.out.println("BANCO REALIZE");
		System.out.println("****************************************************************");
		System.out.println("Onde seus sonhos se tornam realidade.");
		System.out.println("****************************************************************");
		System.out.println("1. Conta Poupança");
		System.out.println("2. Conta Corrente");
		System.out.println("3. Conta Especial");
		System.out.println("4. Conta Empresarial");
		System.out.println("5. Conta Estudantil");
		System.out.println("6. Sair");
		System.out.print("\nDIGITE O CODIGO DA OPÇÃO SELECIONADA:");
		opcao = leia.nextInt();
		
		 switch(opcao) {
	      case 1:
	      while(continuar == 'S' || continuar == 's' || x < 0) {
	       
	        System.out.println("\n\n************************************************************");
	        System.out.println("[BANCO REALIZE] + G[2626]");
	        System.out.println("Onde seus sonhos se tornam realidade");
	        System.out.println("****************************************************************");
	        System.out.println("CONTA [POUPANCA]");
	        System.out.println("\nSaldo Atual: R$ " +saldoAtual);
	        System.out.println("Digite o dia do aniversario da poupanca: ");
	        dia = leia.nextInt();
	         if(dia == 26) {
	        saldoAtual= saldo*0.05;
	        soma1= saldoAtual + saldo;
	        System.out.println("\nSeu novo saldo é: "+soma1);	        
	        System.out.println("CONTA [POUPANCA]");
	        System.out.println("MOVIMENTO - D- débito ou C-crédito: ");
	        movimento = leia.next().charAt(0);
	        System.out.println("Valor movimento: R$: " );
	        valor = leia.nextFloat();
	        soma = soma1 + valor;
	        System.out.println("Seu saldo atual é: " +soma );
	          if(movimento == 'D' || movimento == 'd' ) {
	            contaPoupanca.debito(valor);
	          }  
	          if(movimento == 'C' || movimento == 'c') {
	            contaPoupanca.credito(valor);
	          }
	        System.out.println("Continuar S/N: ");
	        continuar = leia.next().charAt(0);
	        
	      }
	         else {
	        	System.out.println("CONTA [POUPANCA]");
	 	        System.out.println("MOVIMENTO - D- débito ou C-crédito: ");
	 	        movimento = leia.next().charAt(0);
	 	        System.out.println("Valor movimento: R$: " );
	 	        valor = leia.nextFloat();
	 	        soma= saldo +- valor;
	 	        System.out.println("Seu saldo atual é: " +soma);
	 	          if(movimento == 'D' || movimento == 'd' ) {
	 	            contaPoupanca.debito(valor);
	 	          }  
	 	          if(movimento == 'C' || movimento == 'c') {
	 	            contaPoupanca.credito(valor);
	 	          }
	 	        System.out.println("Continuar S/N: ");
	 	        continuar = leia.next().charAt(0);
	         }
	             
	    }break;
	    
	      case 2:
	    	 while(continuar == 'S' || continuar == 's' || x < 0) {
	    		 
	    		System.out.println("\n\n************************************************************");
	 	        System.out.println("[BANCO REALIZE] + G[2626]");
	 	        System.out.println("Onde seus sonhos se tornam realidade");
	 	        System.out.println("****************************************************************");
	 	        System.out.println("CONTA [CORRENTE]");
	 	        System.out.println("\nSaldo Atual: R$ " + (saldo+valor));
	 	        System.out.println("MOVIMENTO - D- débito ou C-crédito: ");
	 	        movimento = leia.next().charAt(0);
	 	        System.out.println("Valor movimento: R$: " );
	 	        valor = leia.nextFloat();
	 	        System.out.println("Seu saldo atual é: " +valor);
	 	        
	 	       x -= 1;
	           System.out.println("Continuar S/N: ");
	           continuar = leia.next().charAt(0);
	              if(continuar == 'S' || continuar == 's' || x < 0) {
	            	  System.out.println("Gostaria de solicitar talão de cheque?: " );
	            	  continuar = leia.next().charAt(0);
	            	  System.out.println("Quantos você gostaria?: " );
	            	  qtdCheque = leia.nextInt();
	            	  if (qtdCheque <= 3) {
	                      ((ContaCorrente) contaCorrente).pedirTalao(qtdCheque);
	                      contaCorrente.debito((qtdCheque * 30));
	                      soma2= valor- (qtdCheque *30);
	                      System.out.println("Seu saldo atual é: " +soma2);
	                      System.out.println("Continuar S/N: ");
	                      continuar = leia.next().charAt(0);
	                    } else {
	                      System.out.println("Limite maximo atingido!");
	                      System.out.println("Continuar S/N: ");
	                      continuar = leia.next().charAt(0);
	                    }           	  
	              }
	              
	    	 }break;
	 	       
	      	case 3:
	            while (continuar == 'S' || continuar == 's' || x < 0){
	            System.out.println("\n\n************************************************************");
	 	        System.out.println("[BANCO REALIZE] + G[2626]");
	 	        System.out.println("Onde seus sonhos se tornam realidade");
	 	        System.out.println("****************************************************************");
	 	        System.out.println("CONTA [ESPECIAL]");
	 	        System.out.println("\nSaldo Atual: R$ " + (saldo+ limite));
	 	        System.out.println("MOVIMENTO - D- débito ou C-crédito: ");
	 	        movimento = leia.next().charAt(0);
	 	        System.out.println("Valor movimento: R$: ");
	 	        valor = leia.nextFloat();
	 	        
				if (limite != 0) {
	                if (movimento == 'D' || movimento == 'd') {
	                  if (saldo == 0) {
	                    limite -= valor;
	                    saldo = 0;
	                  }
	                  if (saldo < valor && saldo != 0) {
	                    valor = (float) (valor - saldo);
	                    saldo = 0;
	                    limite -=valor ;
	                  }
	                  if (saldo >= valor) {
	                    debitar +=valor ;
	                  }
	                  System.out.println("Seu limite atual é: " + limite);
	                  System.out.println("Seu saldo da Conta Especial é: " + saldo);
	                }
				} else {
					System.out.println("Você usou todo seu limite");
					break;
				}
					x -= 1;
					System.out.println("Continuar S/N: ");
					continuar = leia.next().charAt(0);
				
			}break;
			
	      	case 4:
	      		 while (continuar == 'S' || continuar == 's' || x < 0){
	 	            System.out.println("\n\n************************************************************");
	 	 	        System.out.println("[BANCO REALIZE] + G[2626]");
	 	 	        System.out.println("Onde seus sonhos se tornam realidade");
	 	 	        System.out.println("****************************************************************");
	 	 	        System.out.println("CONTA [EMPRESARIAL]");
	 	 	        System.out.println("\nSaldo Atual: R$ " + (saldo+soma));
	 	 	        System.out.println("MOVIMENTO - D- débito ou C-crédito: ");
	 	 	        movimento = leia.next().charAt(0);
	 	 	        System.out.println("Valor movimento: R$: ");
	 	 	        valor = leia.nextFloat();
	 	 	        System.out.println("Você deseja fazer um emprestimo? Você tem R$ " + (valorEmprestimo-somaTotal) + " liberado!! Podemos prossegir? S/N: ");
	 	 	        pegarEmprestimo = leia.next().charAt(0);
	 	 	      if(pegarEmprestimo == 'S' || pegarEmprestimo == 's') {
	                    if(valorEmprestimo > 0) {
	                      System.out.println("Valor Emprestimo: ");
	                      valorPego = leia.nextFloat();
	                      soma =valor + valorPego;
	                      somaTotal= valorEmprestimo-valorPego;
	                      System.out.println("Saldo Atual: R$ " + soma);
	                      System.out.println("Você ainda possui um limite de: R$ " + somaTotal);
	                    }else {
	                      System.out.println("Você não possui mais valor de limite para emprestimo");
	                      
	                    
	                    }  
	                    x -= 1;
	    	 	 	      System.out.println("Continuar S/N: ");
	    	 	 	      continuar = leia.next().charAt(0);
                
	      		 }else {
                    if(x== 10) {
                      System.out.println("Valor Emprestimo: ");
                      valorPego = leia.nextFloat();
                      System.out.println("Saldo Atual: R$ " + (soma+valorPego));
                      System.out.println("Você ainda possui um limite de: R$ " + somaTotal);
                    }
                    System.out.println("Você atingiu as 10 movimentações disponíveis");
	      		 break;
	      		 }
	      		 }
	      		 
              case 5:
            	  
            	  while (continuar == 'S' || continuar == 's' || x < 0){
  	 	            System.out.println("\n\n************************************************************");
  	 	 	        System.out.println("[BANCO REALIZE] + G[2626]");
  	 	 	        System.out.println("Onde seus sonhos se tornam realidade");
  	 	 	        System.out.println("****************************************************************");
  	 	 	        System.out.println("CONTA [ESTUDANTIL]");
  	 	 	        System.out.println("\nSaldo Atual: R$ " + (saldo+soma));
  	 	 	        System.out.println("MOVIMENTO - D- débito ou C-crédito: ");
  	 	 	        movimento = leia.next().charAt(0);
  	 	 	        System.out.println("Valor movimento: R$: ");
  	 	 	        valor = leia.nextFloat();
  	 	 	        System.out.println("Você deseja fazer um emprestimo? Você tem R$ " + (EmprestimoE-somaTotal1) + " liberado!! Podemos prossegir? S/N: ");
  	 	 	        pegarEmprestimo = leia.next().charAt(0);
  	 	 	      if(pegarEmprestimo == 'S' || pegarEmprestimo == 's') {
  	                    if(EmprestimoE > 0) {
  	                      System.out.println("Valor Emprestimo: ");
  	                      valorPego = leia.nextFloat();
  	                      soma =valor + valorPego;
  	                      somaTotal1= EmprestimoE-valorPego;
  	                      System.out.println("Saldo Atual: R$ " + soma);
  	                      System.out.println("Você ainda possui um limite de: R$ " + somaTotal1);
  	                    }else {
  	                      System.out.println("Você não possui mais valor de limite para emprestimo");
  	                      
  	                    
  	                    }  
  	                    x -= 1;
  	    	 	 	      System.out.println("Continuar S/N: ");
  	    	 	 	      continuar = leia.next().charAt(0);
                  
  	      		 }else {
                      if(x== 10) {
                        System.out.println("Valor Emprestimo: ");
                        valorPego = leia.nextFloat();
                        System.out.println("Saldo Atual: R$ " + (soma+valorPego));
                        System.out.println("Você ainda possui um limite de: R$ " + somaTotal1);
                      }
                      System.out.println("Você atingiu as 10 movimentações disponíveis");
  	      		 }
            	  
  	      		 
            	  } break;
                  case 6:
                	  System.out.println("OBRIGADA, VOLTE SEMPRE!");
                  break;
                  }          
	      		
	
	}
	} 



