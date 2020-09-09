package leandro;

import javax.swing.JOptionPane;


public class practicacinco {

	public static void main (String args[]) {
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de A"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de B"));
		int c=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de C"));
		
		int D=b^2-(4-(a*c));
		
		if (D<=0) {
		int x= -b/2*a;
		System.out.println("El Valor de x es:");
		JOptionPane.showMessageDialog(null, x);
		}
		
		if(D>0) {
			int x1=(int) (-b+Math.sqrt(b^2-(4-(a*c))));
			int x2=(int) (-b-Math.sqrt(b^2-(4-(a*c))));
			System.out.println("El valor de X1 es:");
			JOptionPane.showMessageDialog(null, x1);
			System.out.println("El valor de X2 es:");
			JOptionPane.showMessageDialog(null, x2);
		}
	
	}/*Fin del main*/


}/*Fin de la clase publica*/
