import java.util.Arrays;

public class Proceso extends Thread {

	// desde source, contructor con superclase elegimos el ultimo -> Para hacer el grupo
	public Proceso(ThreadGroup group, String name, int prioridad) {
		// si lo quitamos llama al super de thread sin argumentos entonces sale por consola asi  -> main - Thread-1 - 959
		super(group, name); 
		// darle la prioridad
		this.setPriority(prioridad); // cuando entra en la cola del cpu tiene que estar antes del start
		// TODO Auto-generated constructor stub
	}

	// sobrescribimos el metodo run de thread
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// llama al metodo run del padre, pero en este caso no se utiliza
		super.run();
		for (int i = 0; i<1000 ; i++) {
			// sacamos el nombre del grupo y el nombre del proceso
			System.out.println(getThreadGroup().getName() + " - " + getName() + " - " + i);
		}
		// con threaGroup al que perteneces, podemos recuperar lso procesos de ese grupo con enumerate
		// meterle un array de thread -> el enumerate rellena ese array de threads
		// this.getThreadGroup.activeCount -> cuando no sabemos cuantos hay que poner en el []
		// -> coge el thread y de elcoge el numero que hay (activeCount)
		Thread[] hilosHermanos = new Thread[this.getThreadGroup().activeCount()];
		// le metemos hilosHermanos
		getThreadGroup().enumerate(hilosHermanos);
		// sacamos por consola los hilosHermanos
		System.out.println(Arrays.toString(hilosHermanos));
	}

	
	
}
