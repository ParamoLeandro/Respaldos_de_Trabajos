//EL PROGRAMA

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class FORMATO_IMPRESION {

public static void main(String[] args) {

impfechas objeto=new impfechas();

int n=Integer.parseInt(JOptionPane.showInputDialog("¿Numero de personas:  ?."));
String sal=" Nombre completo   \t \t   \t   Fecha de Nacimiento \t   \t  \t     Edad actual \n "+ "";
for(int i=1;i<=n;i++) {
	
	//Formato_fecha_de_Nacimiento
	String Nombre=JOptionPane.showInputDialog("Ingrese su nombre: ");
	int dia=Integer.parseInt(JOptionPane.showInputDialog(" Dia :"));
	int mes=Integer.parseInt(JOptionPane.showInputDialog("Mes:  "));
	int año=Integer.parseInt(JOptionPane.showInputDialog("Año:  "));
	objeto.set(Nombre,dia,mes,año);
	//Luego_formato_para_fecha_actual
    int diac=Integer.parseInt(JOptionPane.showInputDialog("Dia actua?:"));
	int mesc=Integer.parseInt(JOptionPane.showInputDialog("Mes actual?"));
	int añoc=Integer.parseInt(JOptionPane.showInputDialog("Año actual?"));
    objeto.set(diac,mesc,añoc);
    sal+= objeto.toString();
}

     JTextArea tabla = new JTextArea();
	 tabla.setText(sal);
	 JOptionPane.showMessageDialog(null, sal);
	 System.exit(0);




	
}//Fin_del_main
	
	

}//Fin_programa


