//EL PROGRAMA

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class FORMATO_IMPRESION {

public static void main(String[] args) {

impfechas objeto=new impfechas();

int n=Integer.parseInt(JOptionPane.showInputDialog("�Numero de personas:  ?."));
String sal=" Nombre completo   \t \t   \t   Fecha de Nacimiento \t   \t  \t     Edad actual \n "+ "";
for(int i=1;i<=n;i++) {
	
	//Formato_fecha_de_Nacimiento
	String Nombre=JOptionPane.showInputDialog("Ingrese su nombre: ");
	int dia=Integer.parseInt(JOptionPane.showInputDialog(" Dia :"));
	int mes=Integer.parseInt(JOptionPane.showInputDialog("Mes:  "));
	int a�o=Integer.parseInt(JOptionPane.showInputDialog("A�o:  "));
	objeto.set(Nombre,dia,mes,a�o);
	//Luego_formato_para_fecha_actual
    int diac=Integer.parseInt(JOptionPane.showInputDialog("Dia actua?:"));
	int mesc=Integer.parseInt(JOptionPane.showInputDialog("Mes actual?"));
	int a�oc=Integer.parseInt(JOptionPane.showInputDialog("A�o actual?"));
    objeto.set(diac,mesc,a�oc);
    sal+= objeto.toString();
}

     JTextArea tabla = new JTextArea();
	 tabla.setText(sal);
	 JOptionPane.showMessageDialog(null, sal);
	 System.exit(0);




	
}//Fin_del_main
	
	

}//Fin_programa


