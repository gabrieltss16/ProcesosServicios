
public class Proceso extends Thread {

	public Proceso(String nombre) {
		super(nombre);
	}
	
	@Override
	public void run() {
		super.run();
		for(int i = 0; i<500000 && !Thread.currentThread().isInterrupted();i++) {
			System.out.println("Proceso " + getName() + " - Iteracion: " + i );
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
