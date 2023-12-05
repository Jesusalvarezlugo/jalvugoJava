package Servicios;

import java.util.Scanner;

/**
 * Interfaz que relaciona con la implementacion del menu
 * jal-05/12/2023
 */

public interface MenuInterfaz {
	
	/**
	 * Metodo que muestra el mensaje de bienvenida a la aplicacion
	 * jal-05/12/2023
	 */
	public void mostrarMensajeBienvenida();
	
	/**
	 * Metodo que muestra el menu y recoge la opcion seleccionada
	 * jal-05/12/2023
	 */
	
	public int mostrarMenuYSeleccion(Scanner sc);

}
