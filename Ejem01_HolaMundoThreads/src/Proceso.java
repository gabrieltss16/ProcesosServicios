
public class Proceso extends Thread {

	// extends Thread -> todo lo de la clase Thread lo hereda proceso (todos los métodos lo la del padre está en la del hijo)
	// todas las clases de java heredan de object -> métodos -> ej toString, equals
	// Thread -> hereda de object y hace un implements de 
	// implements -> sirve para implementar varias clases, extens solo una
	//			  -> interfaz, era aquella en la que se definen metodos pero no se implementaban 
	//            -> hay que desarrollar el metodo que dice al interfaz que se tiene que desarrollar
	// ej -> clase persona / interfaz caminante -> metodo caminar / si haces un implemnts en persona de la interfaz caminante, hay que implementar el metodo obligatoriamente en persona
	
	// thread esta obligada a tener un método llamado  run ya que implementa la interfaz runnable (que tiene el método run)
	
	// Thread es aquella clase que nos va a permiter crear procesos
	// llamamos al metodo start() que llama al metodo run() directamente 
	// alternancia en CPU -> la Cpu de un ordenador no tiene un solo nucleo, cuando entra la aplicacion no puede entrar proceso a la vez, solo puede haber uno, 
	// cuando finaliza la aplicacion empieza proceso y así porque solo puede ejecutar uno a la vez.
	
	// si hacemos nuestra propia clase thread implementando runnable -> EJEM 01 _ RUNNABLE
	
	
	// el constructor se crea con click derecho -> source -> constructor con superclase
	
	public Proceso() {
		super();
		// el super en threads llama a thread
		// TODO Auto-generated constructor stub
		// for -> control espacio 
	//	for (int i = 0; i < 10000; i++) {
	//  	System.out.println("Soy Proceso hijo: " + i );
	//	}
		
		
		
	}

	// vamos a desarrollar el codigo para el metodo run
	// source -> override -> seleccionamos run
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// el super -> para hacer referencia al objeto padre (llamamos al metodo run del padre)
		super.run();
		
		for (int i = 0; i < 10000; i++) {
		  	System.out.println("Soy Proceso hijo: " + i );
		}
	}

}
