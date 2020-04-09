package br.com.ex1.model;

public class StringThread implements Runnable {
	
	
	private String texto;
	private long time;
	
	public StringThread(String texto, long time) {
		this.texto = texto;
		this.time = time;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	@Override
	public void run() {
		for(char c: texto.toCharArray()) {
			System.out.println(c);
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	

}
