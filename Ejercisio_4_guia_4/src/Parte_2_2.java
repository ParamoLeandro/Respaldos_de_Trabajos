import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Parte_2_2 {

	public static void main(String args[]) {
		
		Parte_1_1 sal = new Parte_1_1();
		int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas personas va a ingresar a la lista?"));
		String nombre[][]=new String[n][n];
		int pagoneto=0;
		String imp = "Nombre \t Total de ingresos \t INSS \t IR \n";
		
		for(int h=0;h<n;h++) {
			for (int j=0;j<n;j++) {
				nombre[h][j]=JOptionPane.showInputDialog("Ingrese un numbre y un apellido");
			}
		}
		
		
		for (int i=0;i<n;i++) {
			pagoneto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese salario Mensual"));
			sal.Set(pagoneto);
		}
		
		//almacenamos_la_impresion_de_los_nombre
		
				for(int h=0;h<n;h++) {
					for (int j=0;j<n;j++) {
						imp+=nombre[h][j]+"\t"+sal.Getpago()+"\t"+sal.GetINSS()+"\t"+sal.GetIR()+"\n";;
					}
				}
				
		
		
		JTextArea tabla = new JTextArea();
		 tabla.setText(imp);
		 JOptionPane.showMessageDialog(null, tabla);
		 System.exit(0);
		
	} 
		
}

