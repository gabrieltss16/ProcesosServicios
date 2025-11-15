
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo");

		
		Proceso proceso = new Proceso ();
		// ya no podemos llamar a start porque era de threads entonces para poderlo hacer hacemos lo de proceso *
		//proceso.start(); 
		for (int i = 0; i < 10000; i++) {
			System.out.println("Soy Proceso padre: " + i );
		}
		
	}

}
