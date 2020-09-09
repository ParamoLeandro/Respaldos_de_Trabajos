//Ejercisio nº1

import javax.swing.*;

public class guia1 {

	public static void main (String args []) {
		
		String palabra=JOptionPane.showInputDialog("Ingrese la palabra a usar");
		triangulo(palabra);
	} //Final del void main
	
	public static void triangulo (String palabra) {
		
		String imp="" ;
		
		for(int i=0;i<palabra.length();i++) {
			
			imp+= palabra.substring(0,i+1)+"\n";
			
			JOptionPane.showMessageDialog(null, imp);
			
		}
	}
		
	
	
}
 