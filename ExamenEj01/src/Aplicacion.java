public class Aplicacion {
    public static void main(String[] args) {
        Taquilla taquilla = new Taquilla();

        Ventanilla v1 = new Ventanilla("Ventanilla 1 (VIP)", taquilla, Thread.MAX_PRIORITY);
        Ventanilla v2 = new Ventanilla("Ventanilla 2 (VIP)", taquilla, Thread.MAX_PRIORITY);
        Ventanilla v3 = new Ventanilla("Ventanilla 3", taquilla, Thread.MIN_PRIORITY);
        Ventanilla v4 = new Ventanilla("Ventanilla 4", taquilla, Thread.MIN_PRIORITY);

        v1.start();
        v2.start();
        v3.start();
        v4.start();

        try {
            v1.join();
            v2.join();
            v3.join();
            v4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("NO HAY MAS ENTRADAS");
    }
}
