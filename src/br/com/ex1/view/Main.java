package br.com.ex1.view;

import br.com.ex1.model.StringThread;

public class Main {

	public static void main(String[] args) {
		
		StringThread ct =  new StringThread("Primeiros 500s", 500);
		StringThread ct1 = new StringThread("1000 ms  ", 1000);
		StringThread ct2 = new StringThread("2000 ms", 2000);
		
		Thread tr1 = new Thread(ct);
		Thread tr2 = new Thread(ct1);
		Thread tr3 = new Thread(ct2);

		//Iniciar threads
		tr1.start();
		tr2.start();
		tr3.start();

	}

}
