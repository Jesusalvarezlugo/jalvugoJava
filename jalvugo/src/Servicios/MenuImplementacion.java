package Servicios;

import java.util.Scanner;

/**
 * Clase que desarrolla la logica del menu
 * jal-05/12/2023
 */
public class MenuImplementacion implements MenuInterfaz {

	
	
	@Override
	public void mostrarMensajeBienvenida() {
		
		String mensaje="Bienvenido a nuestra gestion de la tieda";
		
		System.out.println(mensaje);
		
	}
	
	@Override
	public int mostrarMenuYSeleccion(Scanner sc) {
		
		int opcion;
		
		System.out.println("###################");
		System.out.println("0. Cerrar menu");
		System.out.println("1. Añadir venta");
		System.out.println("2. Añadir gasto");
		System.out.println("3. Mostrar total");
		System.out.println("###################");
		System.out.println("Introduzca una opcion: ");
		
		opcion=sc.nextInt();
		
		return opcion;
		
	}

	

}
