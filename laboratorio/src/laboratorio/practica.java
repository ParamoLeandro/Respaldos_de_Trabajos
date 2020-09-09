package laboratorio;

import javax.swing.*;

	@SuppressWarnings("serial")
	
	public class practica extends JApplet{
		
		int i,edad,num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nº de personas"));
		String salida,sal=("\t Nombre \n Edad \n Histograma \t");
		
		
		public void init() {
			
			for(i=1;i<=num;i++) {
				String nombres=JOptionPane.showInputDialog("Ingrese su nombre");
				edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
			
			}/*for*/		
				
			JTextArea salida = new JTextArea();
			practica contenedor = (practica) getContentPane();
			contenedor.add(salida);
			System.exit(0);
		
			
		}
			
	
	}/*void*/
	