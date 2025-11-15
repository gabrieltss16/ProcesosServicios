
public class Aplicacion {

	public static void main(String[] args) {
		
		
// creamos la persona
		
		Persona pepe = new Persona("Pepe", 18);
		System.out.println(pepe.nombre()); // mostramos el nombre de la persona que hemos creado
		
// interfaz runnable -> interfaz funcional porque solo tiene un metodo 
		
// PRIMERO LO HIZO ASÍ, y luego lo edito y lo hizo como lo de abajo
		
        //System.out.println("Antes del runnable");
        //Runnable proceso = new Runnable() { 
			
		
// creo un objeto de una interfaz funcional
// implemento la clase que desarrola ese runnable y como tiene que tener un metodo, tenemos el run dentro
// como cualquier interfaz hay que implementar los metodos que me obligue
			
// 		@Override
//			public void run () { 
//				for (int i = 0; i<10 ; i++ ) {
//					System.out.println("Proceso " + i );
//				}
//			}
//		};
//		System.out.println("Despues del Runnable");
		
			System.out.println("Antes del runnable");
			
/*	
// el contructor del proceso se le mete por m¡paramatro un objeto runnable
// ahi va el objeto completo
			
		Thread proceso = new Thread (new Runnable() { 
			
// creo un objeto de una interfaz funcional
// implemento la clase que desarrola ese runnable y como tiene que tener un metodo, tenemos el run dentro
// como cualquier interfaz hay que implementar los metodos que me obligue
			
			@Override
			public void run () { 
				for (int i = 0; i<10 ; i++ ) {
					System.out.println("Proceso " + i );
				}
			}
		});
		proceso.start(); 
*/
			
// Si solo hay un unico metodo por ser interfaz funcional, javaya sabe quesolo va a tener que implementar una cosa
// Es un metdo oblicado a desarrollarse, asiq con lamda se salta escribirlo
// Si al constructo de  thread le permite recibir un runnable, no hace falta ponerle lo de arriba de new runnable ...
		
			
// Solo Runnable 
			
/*		Thread proceso = new Thread(()-> { 
				// el bloque de codigo a desarrollar se queda igual
			for (int i = 0; i < 10; i++) {
				System.out.println("Proceso " + i);
			}
		});
		proceso.start();
*/
		
// Darle un nombre (STRING) y a la vez el runnable (que tenga las dos cosas )
// Lambda funciona con interfaces funcionales
		
		Thread proceso = new Thread(()-> { 
			
			for (int i = 0; i < 10; i++) {
				System.out.println("Proceso " + i);
			}
			
		}, "Hilo hijo");
		
		proceso.start();
		
		System.out.println("Despues del Runnable");
		
//Ejemplo chat gpt : https://chatgpt.com/s/t_68da354605848191b158278a1a16e9a4
		
//Definimos un objeto corredor
// Me salto la definicion de la clase persona
		
/*		Corredor pepito = new Corredor() {
			@Override
			public void corre() {
				System.out.println("Corre Pepito");
			}
		};
*/
		
// Con lambda, es lo mismo de arriba 
		
		Corredor pepito = () -> System.out.println("Corre Pepito");
		
// Creamos un objeto bebedor y definimos interfaz funcional con lambda
							
		Bebedor maradona = (bebida) -> System.out.println("Bebo " + bebida);
		
// queremos decir que ese bebedor bebe algo, se hace asi :
	
		maradona.bebe("vino");
		maradona.bebe("coca cola");
		maradona.bebe("agua (no creo)");
		
// Es lo mismo que lo de arriba pero sin lambda
		
/*    Bebedor maradona = new Bebedor ()
		{
		@Override
		public void bebe(String bebida){
		System.out.println("Bebo " + bebida);
			}
		};

 */
	}
	
	

}
