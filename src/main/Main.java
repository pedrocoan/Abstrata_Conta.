package main;

import brContas.com.ContaCorrente;
import brContas.com.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
	  //Criando a contacorrente
        ContaCorrente cc = new ContaCorrente(500, 1000);

        // Criando a contapoupanpa/*
        ContaPoupanca cp = new ContaPoupanca(500);

      //Testando a contacorrente/*
        System.out.println("\n--- Conta Corrente ---");
        cc.consultarSaldo();
        cc.depositar(200);
        cc.sacar(600);

      //Testando a contapoupança/*
        System.out.println("\n--- Conta Poupança ---");
        cp.consultarSaldo();
        cp.depositar(100);
        cp.sacar(550);
    }


	}


