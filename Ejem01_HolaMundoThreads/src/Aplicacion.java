
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo");

		// Es un código secuencial
		// Para llamar a proceso desde aplicación -> 
		Proceso proceso = new Proceso ();
		proceso.start(); // llamamos automaticamente al run con el start()
		// si hacemos proceso. si que aparece el método run
		//proceso.r
		// con esto se van alternando el pare y el hijo, antes de ponerlo ponia primero todos los del hijo y luego todos los del padre
		// si en vez de llamar a run a partir de start le llamamos directamente con run -> lo hace secuenial (HAY QUE HACERLO CON START)
		
		for (int i = 0; i < 10000; i++) {
			System.out.println("Soy Proceso padre: " + i );
		}
		
	}

}
