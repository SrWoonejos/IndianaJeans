package cl.dmiranda;

public class Utilidad {
	
	public static void limpiarPantalla() {
        // Código para limpiar la pantalla
    }

    public static void tiempoEsperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
