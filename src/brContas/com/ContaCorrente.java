package brContas.com;


// Criando a subclasse ContaCorrente/*
public class ContaCorrente extends ContaBancaria {
	//Criando as variaveis para armazenar o valor das taxas/*
	 private double limite;
	    private double taxaSaque = 5.0;  // Taxa de saque
	    private double taxaDeposito = 2.0;  // Taxa de depósito
	    private double taxaConsulta = 1.0;  // Taxa de consulta

	    // Criando o construtor da classe /*
	    public ContaCorrente(double saldoInicial, double limite) {
	        super(saldoInicial);//Chamando o construtor da superclasse/*
	        this.limite = limite;
	    }

	    
	    //Rescrevendo o metodo e aplicano a logica para aplicar a taxa e o saque/*
	    @Override
	    public void sacar(double valor) {
	        double valorTotal = valor + taxaSaque;
	        if (saldo + limite >= valorTotal) {
	            saldo -= valorTotal;
	            System.out.println("Saque de R$" + valor + " realizado. Taxa: R$" + taxaSaque + ". Saldo atual: R$" + saldo);
	        } else {
	            System.out.println("Saque de R$" + valor + " excede o saldo e o limite. Saldo atual: R$" + saldo + ", Limite: R$" + limite);
	        }
	    }

	    // Rescrevendo o metodo e aplicando a logica para aplicar a taxa e o deposito/*
	    @Override
	    public void depositar(double valor) {
	        double valorFinal = valor - taxaDeposito;
	        if (valorFinal > 0) {
	            saldo += valorFinal;
	            System.out.println("Depósito de R$" + valor + " realizado. Taxa: R$" + taxaDeposito + ". Saldo atual: R$" + saldo);
	        } else {
	            System.out.println("O valor de depósito é insuficiente após a taxa de R$" + taxaDeposito);
	        }
	    }

	    //Rescrevendo o metodo de consultar o saldo/*
	    @Override
	    public void consultarSaldo() {
	        saldo -= taxaConsulta;
	        System.out.println("Saldo atual: R$" + saldo + " (Taxa de consulta: R$" + taxaConsulta + ")");
	    }
	}


