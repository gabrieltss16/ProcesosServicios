
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// currentThread -> devuelve un thread, entonces puede devolvernos el nombre del thread principal
		System.out.println(Thread.currentThread().getName());
		// este proceso pertenece a un conjunto de procesos
		// threadGroup -> devuelve un grupo de procesos (ThreadGroup), que tiene también un nombre
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
		// creamos nuestro propio threadGroup
		ThreadGroup grupoA = new ThreadGroup("Grupo A");
		ThreadGroup grupoB = new ThreadGroup("Grupo B");
		// creamos un proceso y le metemos el grupo a y el nombre del proceso
		Proceso p1 = new Proceso(grupoA,"Proceso1", Thread.MAX_PRIORITY); // la ultima parte es para dar prioridad a procesos
		Proceso p2 = new Proceso(grupoA,"Proceso2", Thread.MAX_PRIORITY);
		Proceso p3 = new Proceso(grupoA,"Proceso3", Thread.MAX_PRIORITY);
		Proceso p4 = new Proceso(grupoB,"Proceso4", Thread.MAX_PRIORITY);
		Proceso p5 = new Proceso(grupoB,"Proceso5", Thread.MIN_PRIORITY);
		Proceso p6 = new Proceso(grupoB,"Proceso6", Thread.MIN_PRIORITY);
		
		// aplicacion solo tiene referencias a estas , p1,p2,p3,p4,p5,p6
		// entre ellos no se conocen 
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		p6.start();
	}

}
