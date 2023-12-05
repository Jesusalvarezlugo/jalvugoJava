package Servicios;

import java.util.Scanner;

/**
 * Interfaz que relaciona con la implementacion de la operativa
 * jal-05/12/2023
 */
public interface OperativaInterfaz {
	
	/**
	 * Metodo para añadir una nueva venta a la cuenta
	 * jal-05/12/2023
	 */
	
	public double añadirVenta(Scanner sc);
	
	/**
	 * Metodo que añade un gasto a la cuenta
	 * jal-05/12/2023
	 */
	public double añadirGasto(Scanner sc);
	
	/**
	 * Metodo que muestra el total de la cuenta
	 * jal-05/12/2023
	 */
	public double mostrarTotal(double total);

}
