
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int contadorComun = 0;
		Contador contadorComun = new Contador(0);
		Proceso p1 = new Proceso(contadorComun, "P1");
		Proceso p2 = new Proceso(contadorComun, "P2");
		Proceso p3 = new Proceso(contadorComun, "P3");
	
		p1.start();
		p2.start();
		p3.start();
	
	
	}

}
