package br.com.ex2.control;

public class CalcRaizQuadrada implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i <= 99;i++ ) {
			if(i%2 != 0) {
				System.out.println(Math.sqrt(i));
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
