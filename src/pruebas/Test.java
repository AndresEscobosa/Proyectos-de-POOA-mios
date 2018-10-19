package pruebas;

public class Test {
	
	public static void main(String[] args){
		
		ProcesoUno p1= new ProcesoUno();
		ProcesoDos p2= new ProcesoDos();
		
		p1.setPriority(Thread.MIN_PRIORITY);
		p1.start();
		try {
			p1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread hilo =new Thread(p2);
		hilo.setPriority(Thread.MAX_PRIORITY);
		hilo.start();
		
	}

}
