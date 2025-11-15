
public class Proceso extends Thread {

	public Proceso(String nombre) {
		super(nombre);
		setDaemon(true); // cuando muere el padre el hijo tambien (el proceso padre finaliza el hijo tambien)
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		int contador = 0;
		do {
			System.out.println("Ejecutando " + getName() + "contador: " + contador);
			Thread.yield(); // pierdes la Cpu y vas a otro proceso que estuviera esperando para ejecutarse 
			// si siempre perdiera la cpu siempre habria la alternancia de 1,2,1,2,1,2 pero no es asi no siempre pierde la cpu
			/*// comentamos las lineas para ver que los procesos se alternan cuando les da la gana
			 // alternancia no controlada  -> usamos .yield() para que la alternancia este mas controlada 
			try {
				// si el proceso es el 2 esperamos 10 milisegundos
				if(getName().equals("Proceso 2")) {
					Thread.sleep(10);
				} else { // si es el uno esperamos 100 milisegundos
					Thread.sleep(100);
				}
				// acaba antes el 
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}while (contador++<100);
	}

}
