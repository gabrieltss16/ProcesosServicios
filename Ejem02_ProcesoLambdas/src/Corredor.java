//1.
// podemos  poner @FunctionalInterface para indicar que es una interfaz funcional, porque solo tiene un metodo

@FunctionalInterface
public interface Corredor {
	// creamos una interfaz con el nombre de corredor
	
	public void corre();
	
	// da error el metodo de abajo porque con esto @FunctionalInterface, solo puede tener un metodo, por eso se llama interfaz funcional
	// public void respirar();
	
	
}
