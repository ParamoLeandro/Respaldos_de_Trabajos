

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class e1 extends JFrame {

	private static final long serialVersionUID = 1808885504032817400L;
	
	JTextArea Text = new JTextArea(20,20);
	Container Panel = getContentPane();
	JMenu MenP = new JMenu("Opciones");
	
	
	int Tam = 5;
	String[] NC = new String[Tam];
	int[] Sem = new int[Tam];
	float[] Prom = new float[Tam];
	int n = -1;
	
	public static void main(String[] args) {
		new e1();
	}

	public e1(){

		setTitle("Ejercicio 1");
		setSize(640,480);
		setResizable(false);
		
		Panel.setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuItem agregar = new JMenuItem("Agregar");
		agregar.setMnemonic('A');
		MenP.add(agregar);
		agregar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Insertar();
				
			}
		});
		
		JMenuItem Modificar = new JMenuItem("Modificar");
		Modificar.setMnemonic('M');
		MenP.add(Modificar);
		Modificar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Modificar();
				
			}
		});
		JMenuItem eliminar = new JMenuItem("Eliminar");
		eliminar.setMnemonic('E');
		MenP.add(eliminar);
		eliminar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Eliminar();
				
			}
		});
		JMenuItem ListAlum = new JMenuItem("Listar Alumno");
		ListAlum.setMnemonic('L');
		MenP.add(ListAlum);
		ListAlum.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ListarOne();
				
			}
		});
		
		JMenuItem ListAll = new JMenuItem("Registros");
		ListAll.setMnemonic('R');
		MenP.add(ListAll);
		ListAll.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ListarAll();
				
			}
		});
		
		JMenuItem ExitB = new JMenuItem("Salir");
		ExitB.setMnemonic('R');
		MenP.add(ExitB);
		ExitB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
			}
		});
		
		MenP.setMnemonic('O');
		JMenuBar Barra = new JMenuBar();
		setJMenuBar(Barra);
		Barra.add(MenP);
		Panel.add(Text);
		setVisible(true);	
	}

	private void ListarAll() {
	String sal="Nombre\tSemestres cursados\tPromedio\n";
	
	if (n> -1)
	{
		for(int i=0; i<= n; i++)
			sal+= NC[i] + "\t" + Sem[i] +"\t"+ Prom[i]+ "\n";
		
		Text.setText(sal);
		Text.repaint();
		
	}
	else
		JOptionPane.showMessageDialog(null, "No hay alumnos registrados");
	
}


	private void ListarOne() {
		String sal="Nombre\tSemestres cursados\tPromedio\n";
	
		if (n> -1)
		{
			String nomb= JOptionPane.showInputDialog("Nombre del Alumno");
			int i = 0;
			while((i <= n) && (nomb.equals(NC[i]))){
				i++;
			}
		
			if (i > 0)
				JOptionPane.showMessageDialog(null,  "El Alumno "+ nomb +" no existe");
			else{
				sal= sal+= NC[i] + "\t" + Sem[i]+"\t"+Prom[i];
				Text.setText(sal);
				Text.repaint();
			}
				
		}
		else
			JOptionPane.showMessageDialog(null, "No hay alumnos registrados");

	
	}


	private void Eliminar() {
		int i = 0;
		String nomb= JOptionPane.showInputDialog("Nombre del Alumno a eliminar:");
		while((i <= n) && (nomb.equals(NC[i]))){
			i++;
		} 
	
		if(i > n)
			JOptionPane.showMessageDialog(null,"el Alumno no existe");
		else{
			for(int j = i;j<n-1   ;j++){
				NC[j] =NC[j+1];
				Sem[j] = Sem[j+1];
				Prom[j] = Prom[j+1];
			}
			n--;
		}
	}
	
	private void Modificar() {
		int i = 0;
		String nomb= JOptionPane.showInputDialog("Nombre del Alumno a modificar:");
		while((i <= n) && (nomb.equals(NC[i]) != true)){
			i++; 
		} 
	
		if(i > n)
			JOptionPane.showMessageDialog(null,"el Alumno no existe");
		else{
			Sem[n] = Integer.parseInt(JOptionPane.showInputDialog("Semestres cursados:"));
			Prom[n]=Float.parseFloat(JOptionPane.showInputDialog("promedio"));
	}
		
}

	private void Insertar(){
		if(n < (Tam - 1)){
		
			String nom = JOptionPane.showInputDialog("Nombre completo del alumno:");
			if(n == -1){
				n++;
				NC[n] = nom;
				Sem[n] = Integer.parseInt(JOptionPane.showInputDialog("Semestres cursados:"));
				Prom[n]=Float.parseFloat(JOptionPane.showInputDialog("promedio"));
			}else{
				int i = 0;
				while((i <= n) && (nom.equalsIgnoreCase(NC[i]))){
					i++;
				}
				if(i > n){
					JOptionPane.showMessageDialog(null, "El Alumno Ya existe");
				}else {
					n++;
					NC[n] = nom;
					Sem[n] = Integer.parseInt(JOptionPane.showInputDialog("Semestres cursados:"));
					Prom[n]=Float.parseFloat(JOptionPane.showInputDialog("promedio"));
				}
			}
		}else{
			JOptionPane.showMessageDialog(null, "No hay espacio");
		}
	}
}