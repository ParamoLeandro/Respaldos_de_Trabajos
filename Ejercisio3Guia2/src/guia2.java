//Ejercisio nº3
import javax.swing.*;
public class guia2 {


	

	public static void main(String[] args) {
	
		
	int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el # de empleados")), años[]=new int[n];
	String  Nombre[]=new String[n];
    String Sexo[]= new String[n];
    String tabla ="Nombre de los empleados\tsexo\tAños de trabajo\n";
    
    

    
    for (int i=0;i<n;i++) {
	
		Nombre[i]=JOptionPane.showInputDialog("Escriba el nombre del trabajador");
	    Sexo[i]=JOptionPane.showInputDialog("Por favor, brinde el sexo del trabajador :");
        años[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de años de labor en la empresa"));	
    }


for(int i=0; i<n;i++) {
	tabla+=Nombre[i]+"\t\t"+Sexo[i]+"\t"+años[i]+"\n\n"; 

	}


tabla+= "Numero de empleados con mas de 10 años:" +empleados(años,n)+"\n"+"Trabajadores Varones:"+Varones(Sexo,n)+"\n\nTrabajadores de 5 años o menos: \n"+Menoscinco(Nombre,años,n);





JTextArea imp= new JTextArea();
imp.setText(tabla);
JOptionPane.showMessageDialog(null, imp);

//Cierre_for

	
}

public static int  empleados(int años[], int n) {
	
	int cont=0;
	int acum=0;
	for(int i=0;i<n;i++) {
		
		if (años[i]>10) {  //Hacemos el contado de los empleados que cumplen este requisito
			acum=acum+1;
	         cont=acum;
		}
		
				
	}
	
	return cont;
	
}//Fin_funcion

public static int Varones(String sexo[], int n) {
	int cont=0;
for (int i=0; i<n;i++) {
 	    if (sexo[i].equals("M") || sexo[i].equals("m")) {  
	        cont=cont+1;        
	   }// Fin del if
	
}	//Fin del for



	 return cont; //retornamos el valor de la variable simple	
	
	
	
}//cierre_de_funcion


public static String  Menoscinco( String Nombre[] , int años[], int n) {

	String menores="";

   for(int i=0;i<n;i++) {
   
	               if(años[i]<5 ) {
	            	   menores+=Nombre[i]; //Cocatenamos todos los valores para poder imprimirlos
	               }
   }	
	
   return menores;

}//Cierre_de_funcion





}
	
