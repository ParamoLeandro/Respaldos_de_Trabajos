import java.awt.Container;

import javax.swing.*;

public class Escuela extends JApplet{
	
	public void init() {
		//Iniciamos pidiendo el nº de alumnos (controlador)
		int n =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de alumnos"));
		int edad[]=new int [n],Promedio;
		String nombre[]=new String [n],encabezado="Nombre\tEdad\n",Menor,Mayor;
		JTextArea Tabla= new JTextArea();
		Container salida= getContentPane();
		salida.add(Tabla);
		
		for(int i=0;i<n;i++) {
			//Pedimos tanto la edad como el nombre dentro de arreglos manejados por una variable controladora
			nombre[i]=JOptionPane.showInputDialog("Ingrese el nombre #" + i+1);
			edad[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad #" + i+1));
		}//Final del for
		
		Promedio=Promedio_edad(edad,n);
		Menor=Edad_minima(edad,nombre,n);
		Mayor=Mayor_edad(edad,nombre,n);
		
		for (int i = 0; i<n; i++) {
			encabezado+=nombre[i]+"\t"+edad[i]+"\n";
			Tabla.setText(encabezado);
		}//Final del for
	}
	
	public static int Promedio_edad(int edad[],int n) {
		int Edadp=0,Prom=0;
		
		for (int i=0;i<n;i++) {
			Edadp+=edad[i];
			Prom=Edadp/n;
			return Prom;
		}//Final del for
		return Prom;
	}//Final de Epromedio
	
	//Creamos Edad_minima que se encarga del control de la edades mas jovenes
	public static String Edad_minima (int edad[],String nombre[],int n) {
		int Edadm=100;
		String names="Los alumnos con la menor edad son:\n";
		for (int i=0;i<n;i++) {
			if(edad[i]<Edadm)
				Edadm=edad[i];
			for(int i1=0;i1<n;i1++) {
				if(edad[i1]==Edadm)
					names+=edad[i1];
				//Creamos Edad_minima que se encarga del control de la edades mas jovenes
			}//Fin del for
				
		}//Final del for
		return names;
	}//Fin de Eminima
	
	//Creamos Mayor_edad que se encarga del control de la edades mas adultas
	public static String Mayor_edad (int edad[],String nombre[],int n) {
		int EdadM=0;
		String names="Los alumnos con la mayoria de edad son:\n";
		for (int i=0;i<n;i++) {
			if(edad[i]>EdadM)
				EdadM=edad[i];
			for(int i1=0;i1<n;i1++) {
				if(edad[i1]==EdadM)
					names+=edad[i1];
				//Creamos Mayor_edad que se encarga del control de la edades mas adultas
	}//Fin de Examina
	
	
	
}
		return names;

}


		
		
		
		
	}//Final del public init
	
	
	
	//Final de la clase publica


