package Controladores;

import java.util.Scanner;

import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;
import Servicios.OperativaImplementacion;
import Servicios.OperativaInterfaz;

/**
 * Clase donde se desarrolla el flujo de la aplicacion
 * jal-05/12/2023
 */
public class inicio {

	/**
	 * Clase en la que se llama a los metodos del proyecto para el desarrollo de la aplicacion
	 * jal-05/12/2023
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		MenuInterfaz mi=new MenuImplementacion();
		OperativaInterfaz oi=new OperativaImplementacion();
		double venta;
		double gasto;
		int opcionS;
		boolean cerrarMenu=false;
		double totalCuenta=0;
		
		
		
		while(!cerrarMenu) {
			
			mi.mostrarMensajeBienvenida();
			
			opcionS=mi.mostrarMenuYSeleccion(sc);
			
			switch(opcionS) {
			
			
			case 0:
				System.out.println("[INFO] se cerrara el menu");
				cerrarMenu=true;
				break;
				
			case 1:
				System.out.println("[INFO] se añadira una venta");
				venta=oi.añadirVenta(sc);
				totalCuenta=venta+totalCuenta;
				
				System.out.println(totalCuenta);
				break;
				
			case 2:
				System.out.println("[INFO] se añadira un gasto");
								
				gasto=oi.añadirGasto(sc);
				
				totalCuenta=totalCuenta-gasto;
				
				if(totalCuenta==0) {
					
					System.out.println("Su dinero total se ha quedado a 0");
				}else if(totalCuenta<0) {
					
					System.out.println("Su dinero esta ahora en negativo");
				}
				break;
				
			case 3:
				
				System.out.println("[INFO] se mostrara el total de la cuenta");
				oi.mostrarTotal( totalCuenta);
				break;
			}
		}
		

	}

}
