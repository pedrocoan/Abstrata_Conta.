package brContas.com;

public class ContaPoupanca extends ContaBancaria {

	//Criando as variaveis para armazenar o valor das taxas/*
	   private double taxaSaque = 3.0;  
	    private double taxaDeposito = 1.0;  
	    private double taxaConsulta = 0.5;  

	    //Criando o construtor da classe /*
	    public ContaPoupanca(double saldoInicial) {
	        super(saldoInicial);//Chamando o construtor da superclasse/*
	    }

	    
	    // Rescrevendo o metodo de saque e aplicando a logica da taxa do saque/*
	    @Override
	    public void sacar(double valor) {
	        double valorTotal = valor + taxaSaque;
	        if (saldo >= valorTotal) {
	            saldo -= valorTotal;
	            System.out.println("Saque de R$" + valor + " realizado. Taxa: R$" + taxaSaque + ". Saldo atual: R$" + saldo);
	        } else {
	            System.out.println("Saque de R$" + valor + " excede o saldo disponível. Saldo atual: R$" + saldo);
	        }
	    }

	    
	 // Rescrevendo o metodo de deposito e aplicando a logica da taxa do deposito/*
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
	    

	    //Rescrevendo o metodo da consulta/*
	    @Override
	    public void consultarSaldo() {
	        saldo -= taxaConsulta;
	        System.out.println("Saldo atual: R$" + saldo + " (Taxa de consulta: R$" + taxaConsulta + ")");
	    }
}

