package Servicios;

import java.util.Scanner;

/**
 * Clase en la que se desarrolla la logica de la operativa
 * jal-05/12/2023
 */

public class OperativaImplementacion implements OperativaInterfaz {

	
	@Override
	public double añadirVenta(Scanner sc) {
		
		double venta;
		System.out.println("Introduzca la venta que quiere hacer: ");
		venta=sc.nextDouble();
		
		return venta;
		
		
		
	}

	@Override
	public double  añadirGasto(Scanner sc) {
		
		double gasto;
		System.out.println("Introduzca el gasto que quiera hacer: ");
		gasto=sc.nextDouble();
		
		return gasto;
		
		
		
		
	}

	@Override
	public double mostrarTotal(double total) {
		
	
		
		if(total==0) {
			System.out.println("La cantidad total es de: "+total+", vamos mal");
		
		}else if(total<0) {
			
			System.out.println("La cantidad total es de: "+total+", vamos muy mal");
		}else {
			
			System.out.println("La cantidad total es de: "+total);
		}
		
		return total;
		
	}

}
