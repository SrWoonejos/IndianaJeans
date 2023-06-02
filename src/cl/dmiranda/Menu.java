package cl.dmiranda;
import java.util.Scanner;

public class Menu {

	private Scanner scanner;

	public Menu()  {
		scanner = new Scanner(System.in);	
	}
	
	public void mostrarMenu()  {
		
		while (true)  {
			System.out.println("1. Listar Producto ");
			System.out.println("2. Agregar Producto ");
			System.out.println("3. Exportar Producto ");
			System.out.println("4. Salir ");
			System.out.println("Ingresa una opción: ");
			
			 int opcion = scanner.nextInt();
	            scanner.nextLine(); // Limpiar el buffer de entrada

	            switch (opcion) {
	                case 1:
	                    // Lógica para listar productos
	                    break;
	                case 2:
	                    // Lógica para agregar un producto
	                    break;
	                case 3:
	                    // Lógica para exportar datos
	                    break;
	                case 4:
	                    return;
	                default:
	                    System.out.println("Opción inválida, Inténtalo nuevamente ");
	                    break;
	            }
		}
	}
}
