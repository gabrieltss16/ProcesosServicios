
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Proceso p1 = new Proceso ("Proceso 1");
		p1.start();
		
		Proceso p2 = new Proceso ("Proceso 2");
		p2.start();
		
		try { // join -> 
			p2.join(); // se detiene en esa linea esperando a que termine el proceso 2
			p1.join(); //se detiene en esa linea esperando a que termine el proceso 1
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// este es el ultimo en escribrise porque con el join detenemos la ejecucion y no avanza de linea hasta 
		// que se terminen los dos procesos enteros
		System.out.println("Proceso padre Finaliza");
	}

	
}
