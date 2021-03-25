package Etapa1;

import javax.swing.JOptionPane;


public class Paso8 {

	public static void main(String[] args) {
		
		
	   
		float saldo_actual =1000;
	  	int opcion = 0;
	  	int opcion1=0;
	  	int opcion2=0;
	  	int codigo;
	  	int contraseña ;
		float ingreso, saldoActual , retiro,saldoActual1;
		
		


		codigo = Integer.parseInt(JOptionPane.showInputDialog("INGRESE SU ID:"));
		contraseña = Integer.parseInt(JOptionPane.showInputDialog("INGRESE SU CONTRASEÑA::"));
		int entrada =0;
		if ( codigo == 45578805 && contraseña == 2020) {
        JOptionPane.showMessageDialog(null,"BIENVENIDOS");
        }else {
        JOptionPane.showMessageDialog(null, "ID O CONTRASEÑA INCORRECTA");
        return;
		 }

			
		
	
		opcion = Integer.parseInt(JOptionPane.showInputDialog("BIENVENIDO A SU CAJERO AUTOMATICO\n"
				+ "1 . Consultar\n"
				+ "2 . Depositar\n"
				+ "3 . Retirar\n" 
				+ "4 . Salir"));
		
		switch (opcion) {
		    case 1: 	            
		    		JOptionPane.showMessageDialog(null, "Dinero en cuenta " + saldo_actual);
		    		opcion1 = Integer.parseInt(JOptionPane.showInputDialog("DESEA HACER OTRA CONSULTA\n"
		    				+ "1 . SI\n"
		    				+ "2 . NO\n"));
		    		if (opcion1 != 1) {
			            JOptionPane.showMessageDialog(null, "MUCHAS GRACIAS POR SU VISITA");
			            return;
		    		}else

		    			opcion = Integer.parseInt(JOptionPane.showInputDialog("BIENVENIDO A SU CAJERO AUTOMATICO\n"
		    					+ "1 . Consultar\n"
		    					+ "2 . Depositar\n"
		    					+ "3 . Retirar\n" 
		    					+ "4 . Salir"));
		    		
		    case 2: ingreso = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto a Depositar"));
		            saldoActual = saldo_actual + ingreso;
		            JOptionPane.showMessageDialog(null, "Dinero en cuenta " + saldoActual);
		            opcion1 = Integer.parseInt(JOptionPane.showInputDialog("DESEA HACER OTRA CONSULTA\n"
		    				+ "1 . SI\n"
		    				+ "2 . NO\n"));
		    		if (opcion1 != 1) {
			            JOptionPane.showMessageDialog(null, "MUCHAS GRACIAS POR SU VISITA");
			            return;
		    		}else

		    			opcion = Integer.parseInt(JOptionPane.showInputDialog("BIENVENIDO A SU CAJERO AUTOMATICO\n"
		    					+ "1 . Consultar\n"
		    					+ "2 . Depositar\n"
		    					+ "3 . Retirar\n" 
		    					+ "4 . Salir"));
		            
		    case 3: retiro = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto a Retirar"));
		        if ( retiro > saldo_actual) {
		        	JOptionPane.showMessageDialog(null, "NO CUENTA CON EL DINERO SUFICIENTE");
		        	opcion2 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE OTRO MONTO NO SUPERIOR A SU SALDO ACTUAL\n"
				    		+ "1 . 100\n"
		    				+ "2 . 200\n"
				    		+ "3 . 300\n"
		    				+ "4 . 400\n"));
		        	switch (opcion2) {
		        	    case 1:
		        	    	saldoActual1 = saldo_actual- 100;
		        	    	JOptionPane.showMessageDialog(null, "Dinero en cuenta " + saldoActual1);
		        	    case 2:
		        	    	saldoActual = saldo_actual -200;
		        	    	JOptionPane.showMessageDialog(null, "Dinero en cuenta " + saldoActual);
		        	    case 3:
		        	    	saldoActual = saldo_actual -300;
		        	    	JOptionPane.showMessageDialog(null, "Dinero en cuenta " + saldoActual);
		        	    case 4:
		        	    	saldoActual = saldo_actual -400;
		        	    	JOptionPane.showMessageDialog(null, "Dinero en cuenta " + saldoActual);
		        	}
		        	break;
		        }
		        else {
		        	
		        	saldoActual1 = saldo_actual - retiro;
		        	JOptionPane.showMessageDialog(null, "Dinero en cuenta " + saldoActual1);	
		        	opcion1 = Integer.parseInt(JOptionPane.showInputDialog("DESEA HACER OTRA CONSULTA\n"
		    		+ "1 . SI\n"
    				+ "2 . NO\n"));
    		if (opcion1 != 1) {
	            JOptionPane.showMessageDialog(null, "MUCHAS GRACIAS POR SU VISITA");
	            return;
    		}else

    			opcion = Integer.parseInt(JOptionPane.showInputDialog("BIENVENIDO A SU CAJERO AUTOMATICO\n"
    					+ "1 . Consultar\n"
    					+ "2 . Depositar\n"
    					+ "3 . Retirar\n" 
    					+ "4 . Salir"));
		        }
		        break;
		    case 4: break;
		    default: JOptionPane.showMessageDialog(null, "OPCION NO DISPONIBLE"); break; 
		
	
	  }
		
	}
}

	


