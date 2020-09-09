import javax.swing.*;

public class Practica_para_combo {

		public static void main(String args[]) {
			
			int ne=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empresas a trabajar"));	
			String nombre[]=new String[ne];
			int ventas[][]=new int[ne][4];
			int ventas_mayor[]=new int[ne];
			String sal="Nombres\t ventas\t Venta Mayor \n";
			
			for(int i=0;i<ne;i++){
				nombre[i]=JOptionPane.showInputDialog("Ingrese el nombre de la empresa");

				for(int j=0;j<4;j++) {
					ventas[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las ventas de las empresas"));
				
				}//final_del_for_interno
			
			}//final_del_for_externo
			num_mayor(ne,ventas_mayor,ventas);
			//impresión
			for(int i=0;i<ne;i++){
				sal+=nombre[i];

				for(int j=0;j<4;j++) {
					sal+=ventas[i][j];
				
				}//final_del_for_interno
				sal+=ventas_mayor[i];
			}//final_del_for_externo
			
			 JTextArea tabla = new JTextArea();
			 tabla.setText(sal);
			 JOptionPane.showMessageDialog(null, tabla);
			 System.exit(0);
			
			
			
		}//Final_del_main

			public static void num_mayor(int ne,int ventas_mayor[],int ventas[][]) {
				
				for(int i=0;i<ne;i++){
					for(int j=0;j<4;j++) {
						if(ventas_mayor[i]>ventas[i][j]) {
							ventas_mayor[i]=ventas[i][j];
						}
					
					}//final_del_for_interno
				}//final_del_for_externo

							}
}//Final_de_la_clase_mayor
