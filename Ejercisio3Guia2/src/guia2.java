//Ejercisio n�3
import javax.swing.*;
public class guia2 {


	

	public static void main(String[] args) {
	
		
	int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el # de empleados")), a�os[]=new int[n];
	String  Nombre[]=new String[n];
    String Sexo[]= new String[n];
    String tabla ="Nombre de los empleados\tsexo\tA�os de trabajo\n";
    
    

    
    for (int i=0;i<n;i++) {
	
		Nombre[i]=JOptionPane.showInputDialog("Escriba el nombre del trabajador");
	    Sexo[i]=JOptionPane.showInputDialog("Por favor, brinde el sexo del trabajador :");
        a�os[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de a�os de labor en la empresa"));	
    }


for(int i=0; i<n;i++) {
	tabla+=Nombre[i]+"\t\t"+Sexo[i]+"\t"+a�os[i]+"\n\n"; 

	}


tabla+= "Numero de empleados con mas de 10 a�os:" +empleados(a�os,n)+"\n"+"Trabajadores Varones:"+Varones(Sexo,n)+"\n\nTrabajadores de 5 a�os o menos: \n"+Menoscinco(Nombre,a�os,n);





JTextArea imp= new JTextArea();
imp.setText(tabla);
JOptionPane.showMessageDialog(null, imp);

//Cierre_for

	
}

public static int  empleados(int a�os[], int n) {
	
	int cont=0;
	int acum=0;
	for(int i=0;i<n;i++) {
		
		if (a�os[i]>10) {  //Hacemos el contado de los empleados que cumplen este requisito
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


public static String  Menoscinco( String Nombre[] , int a�os[], int n) {

	String menores="";

   for(int i=0;i<n;i++) {
   
	               if(a�os[i]<5 ) {
	            	   menores+=Nombre[i]; //Cocatenamos todos los valores para poder imprimirlos
	               }
   }	
	
   return menores;

}//Cierre_de_funcion





}
	
