public class Taquilla {
    private int contador = 0; 

    public synchronized int venderEntrada(String nombreVentanilla) {
        if (contador < 10000) {
            contador++;
            System.out.println("Entrada nº " + contador + " vendida en " + nombreVentanilla);
            return contador;
        } else {
            return -1;
        }
    }
}
