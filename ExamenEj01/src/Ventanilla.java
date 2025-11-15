public class Ventanilla extends Thread {
    private Taquilla taquilla;
    private int entradasVendidas = 0;

    public Ventanilla(String nombre, Taquilla taquilla, int prioridad) {
        super(nombre);
        this.taquilla = taquilla;
        this.setPriority(prioridad);
    }

    @Override
    public void run() {
        while (true) {
            int numEntrada = taquilla.venderEntrada(getName());
            if (numEntrada == -1) break;

            entradasVendidas++;


        }
        System.out.println(getName() + " ha vendido " + entradasVendidas + " entradas.");
    }

}
