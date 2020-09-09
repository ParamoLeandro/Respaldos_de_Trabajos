//Ejercisio 4

import javax.swing.*;
import java.awt.Container;


public class Edadmayor extends JApplet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init () {
		int n =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de alumnos"));
		int edad[]=new int [n];
		int EP;
		String nombre[]=new String [n],encabezado="Nombre\tEdad\n",Nm,NM;
		JTextArea Tabla= new JTextArea();
		Container salida= getcontentpane();
		salida.add(Tabla);
		
		for(int i=0;i<n;i++) {
			nombre[i]=JOptionPane.showInputDialog("Digite el nombre n�" + i+1);
			edad[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite la edad n�" + i+1));
		}//Final del for
		
		EP=Epromedio(edad,n);
		Nm=Eminima(edad,nombre,n);
		NM=Emaxima(edad,nombre,n);
		
		for (int i = 0; i<n; i++) {
			encabezado+=nombre[i]+"\t"+edad[i]+"\n";
			Tabla.setText(encabezado);
		}//Final del for
	}
		private Container getcontentpane() {
		// TODO Auto-generated method stub
		return null;
	}
		public static int Epromedio(int edad[],int n) {
			int Edadp=0,Prom=0;
			
			for (int i=0;i<n;i++) {
				Edadp+=edad[i];
				Prom=Edadp/n;
				return Prom;
			}//Final del for
			return Prom;
		}//Final de Epromedio
		
		public static String 
		Eminima (int edad[],String nombre[],int n) {
			int Edadm=100;
			String names="Alumnos con la edad minima:\n";
			for (int i=0;i<n;i++) {
				if(edad[i]<Edadm)
					Edadm=edad[i];
				for(int i1=0;i1<n;i1++) {
					if(edad[i1]==Edadm)
						names+=edad[i1];
				}//Fin del for
					
			}//Final del for
			return names;
		}//Fin de Eminima
		
		public static String Emaxima (int edad[],String nombre[],int n) {
			int EdadM=0;
			String names="Alumnos con la edad maxima:\n";
			for (int i=0;i<n;i++) {
				if(edad[i]>EdadM)
					EdadM=edad[i];
				for(int i1=0;i1<n;i1++) {
					if(edad[i1]==EdadM)
						names+=edad[i1];
		}//Fin de Examina
		
		
		
	}
			return names;
}

}
