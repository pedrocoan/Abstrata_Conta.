package brContas.com;


// Criando a classe abstrata Contabancaria/*
public abstract class ContaBancaria {
	
	// criando a variavel protected saldo/*
	 protected double saldo;

	    //Criando o construtor da superclasse/*
	    public ContaBancaria(double saldoInicial) {
	        this.saldo = saldoInicial;
	    }

	    // Criando os metodos abstratos/*
	    public abstract void sacar(double valor);

	    
	    public abstract void depositar(double valor);

	    
	    public abstract void consultarSaldo();
	}
	


