
import javax.swing.*;

public class Prom {

	public static void main (String args[]){
		
		int ne=Integer.parseInt(JOptionPane.showInputDialog("De el numero de alumnos"));
		String apr[]=new String [ne];
		String nombre[]= new String [ne];
		int notas[][]=new int [ne][4];
		int promedio[]= new int [ne];
		String sal="Nombre \t \t \t Notas \t \t Promedio \t \t Grado \n "; 
		
		for(int i=0;i<ne;i++){
			nombre[i]=JOptionPane.showInputDialog("De el nombre del alumno");
			for (int a=0;a<4;a++){
				notas[i][a]=Integer.parseInt(JOptionPane.showInputDialog("De la nota"));
				
			}//Final_del_for_2
		}//Final_del_for_1
		
		grado(ne,apr,promedio);
		promedio(ne,notas,promedio);
		
		for (int i=0;i<ne;i++){
			sal+=nombre[i]+"\t    ";
			for (int a=0;a<4;a++) {
				sal+=notas[i][a]+"\t    ";
			}//Final_del_for_2.2
			sal+=promedio[i]+"\t"+apr[i]+"\n";
		}//Final_del_for_1.1
			
		
		JTextArea tabla = new JTextArea();
		tabla.setText(sal);
		JOptionPane.showMessageDialog(null,sal);
		System.exit(0);
		
	}//Final_del_void_main
	
		public static void promedio(int ne,int notas[][],int promedio[]){
			int prom=0;
				
			for (int i=0;i<ne;i++) {
				for (int a=0; a<4;a++) {
					prom+=notas[i][a];
				}
				promedio[i]=prom/4;
				prom=0;
			}//final_del_for_1 
			
		}//final_del_void_promedio
		public static void grado(int ne,String apr[],int promedio[]){
			
			for (int i = 0; i < ne; i++) {
				
				if (promedio[i]>69){
					apr[i]="Aprobado";
				}
					
				if(promedio[i]<69) {
					apr[i]="Reprobado";
				}
					}
		}//Final_del_void_grado
}//Final_de_la_clase