package Etapa1;

import java.util.Scanner;
public class Paso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] arrCodigo = {"A-123","A-124","A-125","A-126"};
		String[] arrNombre = {"Elmer Cubas Silva ","Manuel Cubas Silva ","Fernando Cubas Silva","Mathias Lingan Hernandez"};
		int[] arrSaldo = {1000,500,1400,90};
		String[] arrContraseña = {"2020", "2021" , "2022" , "2023"};
		
		System.out.println("B U S Q U E D A  D E  D A T O S");
		System.out.println("-------------------------------");
		System.out.print("Ingrese Codigo.........:");
		String codigo = sc.nextLine();
		System.out.print("Ingrese Contraseña.........:");
		String contraseña = sc.nextLine();
		
		
		
		int bandera =0;
		int seleccion = 0;
		int p = -1;
		int intentos = 0;
		for ( int x = 0; x < arrCodigo.length; x++) {
			if ( codigo.equals(arrCodigo[x])) {
			if ( contraseña.equals(arrContraseña[x]))
				p = x;
				break;
				
			}
		}
		if (p == -1 && intentos < 3) {
			System.out.println("\n-------------------------");
			System.out.println("  TARJETA NO ENCONTRADA");
			System.out.println("-------------------------");
			
		}
		else {
			System.out.println("\n-------------------------");
			System.out.println("    TARGETA ENCONTRADA   ");
			System.out.println("-------------------------");
			System.out.println("Codigo......:" + arrCodigo[p]);
			System.out.println("Nombre......:" + arrNombre[p]);
			
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
					System.out.println("\nSaldo disponible : " + arrSaldo[p]);
				}else if (seleccion == 2) {
					System.out.print("Ingrese el Monto a Retirar:");
					float monto = sc.nextFloat();
					float saldo_actual =(arrSaldo[p] - monto);
					System.out.println("Monto Retirado : " + monto);
					System.out.print("Saldo Actual: "+ saldo_actual );
					
				}else if (seleccion == 3) {
					
					System.out.println("Ingrese el Monto a Depositar:");
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

}

	


