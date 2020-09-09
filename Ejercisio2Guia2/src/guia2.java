import javax.swing.*;
import java.awt.*;

//Ejercisio nº2


public class guia2  {
	

	public static void main(String args[]) {
		//Se solicita la frase a usar//
		String frase=JOptionPane.showInputDialog("Ingrese una frase: ");
		//Concatenamos//
		JOptionPane.showMessageDialog(null, "La frase es: "+frase+"\n");
		//Creamos metodos
		vocales(frase);
		//Creamos metodos
		cantidad_letras(frase);
	}
	public static void vocales(String frase) {
	int vimp=0;
	int cimp=0;
	int reci=0;
	String simb="";
	for(int i=0;i<frase.length();i++) {
		simb=frase.substring(i,i+1);
		//Usamos el equalsIgnoreCase para hacer que ignore los casos de letras que hemos determinado y solo cuente las que no son las especificadas
		//En este caso bloqueamos el contar las vocales
		if(simb.equalsIgnoreCase("a")||simb.equalsIgnoreCase("e")||simb.equalsIgnoreCase("i")||simb.equalsIgnoreCase("o")||simb.equalsIgnoreCase("u"))
		vimp=vimp+1;
		else
			if(simb.equalsIgnoreCase(" "))
				reci=reci+1;
			else
				cimp=cimp+1;
		
		
	}

	//Se concatenan en una misma variable para se impresas//
JOptionPane.showMessageDialog(null, "La frase qeu ingreso tiene un total de "+vimp+" vocales. \n");
//Se concatenan en una misma variable para se impresas//
JOptionPane.showMessageDialog(null, "La frase qeu ingreso tiene un total de "+cimp+" consonantes \n");

}
public static void cantidad_letras(String frase) {
int imp=0;
for(int i=0;i<frase.length();i++)
	imp=imp+1;
JOptionPane.showMessageDialog(null, "La frase que ha ingresado tiene un total de "+imp+" letras. \n");
}

}
