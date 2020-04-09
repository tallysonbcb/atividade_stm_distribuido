package br.com.ex2.view;

import br.com.ex2.control.CalcRaizCubica;
import br.com.ex2.control.CalcRaizQuadrada;

public class Main {
	public static void main(String[] args) {
		Thread t1 = new Thread(new CalcRaizQuadrada());
		Thread t2 = new Thread(new CalcRaizCubica());

		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
			System.out.println("Fim");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
