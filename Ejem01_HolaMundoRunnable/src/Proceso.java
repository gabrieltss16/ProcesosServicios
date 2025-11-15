
public class Proceso implements Runnable {

	// liberamos la herencia porque no podíamos hacer herencia multiple
	// ahora ya podemos hacer un extens de lo que queramos 

	// *
	// creo el thread 
	private Thread proceso;
	public Proceso() {
		super();
		// TODO Auto-generated constructor stub
		proceso = new Thread(this);
		// creo un proceso y como argumento de proceso metemos un runnable, porque desarrolla el run -> elegimos le que pone Threads ( Runnable taks)
		// ahora ya podemos lanzar el metodo start que llama al run
		proceso.start();
		
	}

	// si borramos el run da error -> si nos ponemos sobre proceso da la opcion de implementar lo obligatorio
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// no podemos llamar al run porque ya implementamos de runnable
	    // super.run();
		
		
		for (int i = 0; i < 10000; i++) {
		  	System.out.println("Soy Proceso hijo: " + i );
		}
	}

}
