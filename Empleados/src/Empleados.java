//Ejercisio_3
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Empleados extends JFrame
{
	
	private static final long serialVersionUID = 1L;
	private int n=-1;
	private String nombre[]= new String[5];
	private float años_de_antiguedad[] = new float[5];
	private String sexo[]= new String[5];
	private int edad[]= new int[5];
	private String direccion[]= new String[5];
	private JTextArea areaTexto = new JTextArea (20,30);
	Container contenedor = getContentPane();
	
	
	public Empleados()
	{
		super("Escuela");
		contenedor.setLayout(new FlowLayout());
		
		JMenu menuAct = new JMenu("Actualizar");
		menuAct.setMnemonic('A');
	
		JMenuItem mIns = new JMenuItem("Ingresar");
		mIns.setMnemonic('I');
		menuAct.add(mIns);
		mIns.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent evento)
				{
					InsertarOrd();
				}
			}
		);//fin de ActionListener
	
		JMenuItem mElim = new JMenuItem("Eliminar");
		mElim.setMnemonic('E');
		menuAct.add(mElim);
		
mElim.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent evento)
				{
					EliminarOrd();
				}
			}
		);//fin de ActioneListener
		
		JMenuItem mMod = new JMenuItem("Cambiar Registro");
		mMod.setMnemonic('M');
		menuAct.add(mMod);
		mMod.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent evento)
				{
					ModificarOrd();
				}
			}
		);//fin de ActioneListener
		
		JMenuItem mImpE = new JMenuItem("Imprimir un estudiante");
		mImpE.setMnemonic('p');
		menuAct.add(mImpE);
		mImpE.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent evento)
				{
					ImprimirE();
				}
			}
		);//fin de ActionListener
			
		JMenuItem mImpTR = new JMenuItem("Imprimir todo");
		mImpTR.setMnemonic('T');
		menuAct.add(mImpTR);
		mImpTR.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent evento)
				{
					ImprimirR();
				}
			}
		);//fin de ActionListener
		
		JMenuItem Salir = new JMenuItem("Salir");
		Salir.setMnemonic('S');
		menuAct.add(Salir);
		Salir.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent evento)
				{
					System.exit(0);
				}
			}
		);//fin de ActionListener
		
		//crear barra de menu y adjuntarla 
		JMenuBar barra = new JMenuBar();
		setJMenuBar(barra);
		barra.add(menuAct);
		
		setSize(550,400);
		setVisible(true);
	}//fin constructor
	

		public int Busca(String nombre[], String nomb, int n)
		{
			int i=0;
			while ((i<=n) && (nombre[i].compareTo(nomb)< 0))
				i++;
			if ((i>n) || (nombre[i].compareTo(nomb)> 0))
				return (-i);
			else 
				return (i);
		}
	

		public void InsertarOrd()
		{
			if (n<4)
			{
				String nomb= JOptionPane.showInputDialog("De el nombre del empleado a insertar");
				if (n==-1)
				{
					n=n+1;
					nombre[n]= nomb;
					años_de_antiguedad[n]=Float.parseFloat(JOptionPane.showInputDialog("De los años de antiguedad del empleado"));
					sexo[n]=JOptionPane.showInputDialog("De el sexo del empleado");
					direccion[n]=JOptionPane.showInputDialog("De la dirección del empleado");
					edad[n]=Integer.parseInt(JOptionPane.showInputDialog("De la edad del empleado"));
					JOptionPane.showMessageDialog(null, "El empleado " + nomb + " fue insertado");
				}
				else
				{
				int pos = Busca(nombre,nomb,n);
					
				if ((pos >= 0) && (nombre[0].compareTo(nomb)==0))
						JOptionPane.showMessageDialog(null, "El empleado " + nomb +" ya existe");
					else
					{
						n=n+1;
						pos= pos * (-1);
						for(int i=n; i>= (pos+1); i--)
						{
							nombre[i]=nombre[i-1];
							años_de_antiguedad[i]=años_de_antiguedad[i-1];
							sexo[i]=sexo[i-1];
							edad[i]=edad[i-1];
							direccion[i]=direccion[i-1];
						}
						nombre[pos]= nomb;
						años_de_antiguedad[pos]= Float.parseFloat(JOptionPane.showInputDialog("De los años de antiguedad del empleado"));
						sexo[pos]=JOptionPane.showInputDialog("De el sexo del empleado");
						direccion[pos]=JOptionPane.showInputDialog("De la dirección del empleado");
						edad[pos]=Integer.parseInt(JOptionPane.showInputDialog("De la edad del empleado"));
						JOptionPane.showMessageDialog(null, "El empleado "+ nomb +" fue insertado");
					}
				}
			}
			else
				JOptionPane.showMessageDialog(null, "No hay espacio disponible");
		}
	
		public void EliminarOrd()
		{
			if(n>-1)
			{
				String nomb= JOptionPane.showInputDialog("De el nombre del empleado a buscar");
				int pos = Busca(nombre,nomb,n);
				
				if (pos < 0)
					JOptionPane.showMessageDialog(null, "El empleado " + nomb +" no existe");
				else
				{
					n=n-1;
					for(int i=pos; i<= n; i++)
					{
						nombre[i]=nombre[i+1];
						años_de_antiguedad[i]=años_de_antiguedad[i+1];
						sexo[i]=sexo[i+1];
						edad[i]=edad[i+1];
						direccion[i]=direccion[i+1];
						}
					JOptionPane.showMessageDialog(null, "El empleado "+ nomb +" fue eliminado");
				}
				ImprimirR();
			}
			else
				JOptionPane.showMessageDialog(null, "Array vacio");
		}
		


		public void ModificarOrd()
		{
			if(n>-1)
			{
				String nomb= JOptionPane.showInputDialog("De el nombre del empleado a buscar");
				int pos = Busca(nombre,nomb,n);
				
				if (pos < 0)
					JOptionPane.showMessageDialog(null,  "El empleado "+ nomb +" no existe");
				else
				{
					años_de_antiguedad[pos]= Float.parseFloat(JOptionPane.showInputDialog("Actualize los año de antiguedad"));;
					JOptionPane.showMessageDialog(null, "La antiguedad ha sido modificada");
					sexo[pos]=JOptionPane.showInputDialog("De el sexo del empleado");
					JOptionPane.showMessageDialog(null, "El sexo del empleado ha sido modificado");
					direccion[pos]=JOptionPane.showInputDialog("De la dirección del empleado");
					JOptionPane.showMessageDialog(null, "La direccion del empleado ha sido modificado");
					edad[pos]=Integer.parseInt(JOptionPane.showInputDialog("De la edad del empleado"));
					JOptionPane.showMessageDialog(null, "La edad del empleado ha sido modificado");
				}
			
				ImprimirR();
				
			}
			else
				JOptionPane.showMessageDialog(null, "Array vacio");
		}
			


		public void ImprimirR()
		{
			
			String sal="Nombre\tAños de antiguedad \t Sexo \t edad \t dirección \n";
			if (n > -1)
			{
				for(int i=0; i<= n; i++)
					sal+= nombre[i] + "\t" + años_de_antiguedad[i] + "\t" + sexo[i] + "\t"+ edad[i]+ "\t"+ direccion[i]+ "\n";
				
				areaTexto.setText(sal);
				areaTexto.repaint();
				contenedor.add(areaTexto);
				setVisible(true);
				
			}
			else
				JOptionPane.showMessageDialog(null, "array vacio");

		}
		
		public void ImprimirE()
		{
			
			String sal="Nombre\t Años de antiguedad \t Sexo\n";
			if (n > -1)
			{
				String nomb= JOptionPane.showInputDialog("De el nombre del empleado a buscar");
				int pos = Busca(nombre,nomb,n);
				
				if (pos < 0)
					JOptionPane.showMessageDialog(null,  "El empleado "+ nomb +" no existe");
				else
				{
					sal= sal+= nombre[pos] + "\t" +años_de_antiguedad[pos] + "\t" + sexo[pos]+ "\t" + edad[pos]+ "\t" + direccion[pos];
					areaTexto.setText(sal);
					areaTexto.repaint();
					contenedor.add(areaTexto);
					setVisible(true);
				}
					
				
			}
			else
				JOptionPane.showMessageDialog(null, "array vacio");

		}


		public static void main(String args[])
		{
			Empleados array = new Empleados();
			array.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}


