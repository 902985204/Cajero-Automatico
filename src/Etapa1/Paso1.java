package Etapa1;

import java.util.Scanner;

public class Paso1 {
	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int saldo = 500;
		int bandera =0;
		int seleccion = 0;
		do { 	
		do {
			System.out.println("\n-------------------------------");
			System.out.println("Porfavor Seleccione una Opcion:");
			System.out.println("-------------------------------");
			System.out.println("\n1. Consulta de Saldo.");
			System.out.println("2. Retiro de Efectivo.");
			System.out.println("3. Deposito de Efectivo.");
			System.out.println("4. Salir.");
			seleccion = sc.nextInt();
			
			if (seleccion >= 1 && seleccion <= 4) {
				bandera = 1;
			} else {
				System.out.println("------------------------------------------");
				System.out.println("Opcion no disponible , Vuelva a intentarlo");
				System.out.println("------------------------------------------");
			}
			
			
		}while(bandera == 0);
		if (seleccion == 1) {
			System.out.println("\nSaldo disponible : " + saldo);
		}else if (seleccion == 2) {
			System.out.print("Ingrese el Monto a Retirar:");
			float monto = sc.nextFloat();
			float saldo_actual =(saldo - monto);
			System.out.println("Monto Retirado : " + monto);
			System.out.print("Saldo Actual: "+ saldo_actual );
			
		}else if (seleccion == 3) {
			
			System.out.println("Ingrese el Monto a Depositar");
			float dp = sc.nextFloat();
			System.out.println("Monto depositado: " + dp);
			System.out.print("Saldo Actual: " );
			
		}else if (seleccion == 4) {
			System.out.println("------------------------");
			System.out.println("¡Gracias!. Vuelva Pronto");
			System.out.println("------------------------");
			bandera =2;
		}
		}while(bandera != 2);
		

		
	}
	

	

}
