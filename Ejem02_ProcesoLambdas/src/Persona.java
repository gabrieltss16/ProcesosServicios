	
// persona hace un implements de corredor, sis o si hay que desarrollar el metodo correr
// para desarrollarle, como da un error nos quedamos encima de persona y da la opción de añadir los métodos

public record Persona (String nombre, int edad) implements Corredor{
	// los registros (record) nos permitian ahorrar código
	
	@Override
	public void corre() {
		// TODO Auto-generated method stub
		System.out.println("Puedo correr");
	}
	
	
	
}
