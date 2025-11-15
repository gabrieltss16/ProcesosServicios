
public class Proceso extends Thread {
 //private int contador;
 // Cada proceso tiene su contador, como empieza en 0, cuando se inicializa un proceso toma ese valor
 // asi hay tres procesos, cada uno con su contador a 0 . Todos llegan a 10, pero por separado
 // Por eso hay un total de 30 procesos, no 10
	
private Contador contador;
 public Proceso(Contador contadorComun, String nombre ) {
	 super(nombre);
	 contador = contadorComun;
 }
 
 @Override
 public void run() {
		for (int i = 0; i < 100; i++) {
			//contador++;
			//synchronized(contador)->el objeto que tiene entre parentesis en este caso contador es el 
			// que se va a modificar en esas 4 lineas por lo que hay que tener cuidado con ellas
			// arreglamos el problema de sincronismo
			// las zonas sincronizadas tienen que ser lo mas pequeñas posibles 
			// para evitar que se pierda la concurrencia
			synchronized (contador) {
				int temp = contador.getValor();
				temp ++;
				contador.setValor(temp);
				System.out.println(this.getName() + " Valor final del contador: " + contador.getValor());
			}
			
			// al poner el synchronized -> la alternancia es menor: 
			// el primer proceso entra y se queda en la zona sincronizada, pregunta si hay halguien dentro
			// especie de semaforo en verde, no hay nadie dentro de las sincronizadas
			// el primer proceso entra, pero nada mas entrar pone el semaforo en rojo y no pueden entrar mas
			// la cpu cjando esta en cualquier punto de se acabo y tiene que salir
			// el proceso 2 entra en cpu, se ejecuta y se queda en la zona sincronizada, pregunta y el
			// semaforo esta en rojo, entonces no entra, se queda en el for 
			// el 3 proceso se queda en la zona sincronizada, pregunta, el semaforo esta en rojo, entonces no 
			// pasa de la zona sincronizada y pierde el cpu
			// el proceso 1 coge las lineas termina la zona sincronizada y pone el semaforo en verde para que pueda
			// entrar el siguiente, hasta que llega a la llave
			// 1 -> 100 vueltas / 2 -> 100 vueltas / 3 -> 100 vueltas --> sucede porque la probabilidad de que el proceso 
			// 1 pierda el cpu de la llave final hasta el for es minima
			// cuando termina el 1 ya va al proceso 2 (despues de las 100 vueltas del proceso como
			// pone el semaforo en verde ya entra el 2)
			
			
			// clase thread un metodo sleep -> se usa el de milisegundos
			// para que el proceso 1 suelte la cpu aunque sea un segundo // y se alternen todos los procesos

			// comenta el thread y poner lo de syncronized  encima del for 
//			try {
//				Thread.sleep(1);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}	
		}
 }
}
