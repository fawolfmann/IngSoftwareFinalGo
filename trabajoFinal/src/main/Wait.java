package main;

public class Wait implements Runnable{
	private long intervalo;
	
	public Wait(long intervalo){
		this.intervalo=intervalo; //Intervalo en milisegundos
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(intervalo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
