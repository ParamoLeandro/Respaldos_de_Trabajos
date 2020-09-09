import javax.swing.*; 
public class Empresas {
	public static void main (String args[]) {
		
		int ne=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de empresas"));
		int ventas[][]=new int [ne][3];
		String nombres[]=new String [ne];
		int ventasmax[]= new int [ne];
		int promedio[]=new int [ne];
		int suma[]=new int[ne];
		String sal="Empresa \t \t \t Ventas \t \t  \t \t \t Vntas.Maximas \t \t \t  \t \t \t Total Vendido \t \t \t \t Promedio \n "; 
		
       //Para_pedir_nombre_de_empresa_y_ventas_por_mes
		
		
		for (int f=0;f<ne;f++) 
		{
			nombres[f]=JOptionPane.showInputDialog("Nombre de la empresa");	
		             for( int  c=0;c<3;c++) 
		             {
		            	 ventas[f][c]=Integer.parseInt(JOptionPane.showInputDialog( "Ventas: "));
		             }
		}
		
		Ventas(ne,ventas,ventasmax);
		prom(ne,ventas,promedio);
		sum(ne,ventas,suma);
		    
		for (int i=0;i<ne;i++)
		{
			sal+= "\t"+ "\n"+ nombres[i] +"\t" +"\t";
			for(int j=0;j<3;j++)
			{
				 sal+= "\t"+"\t" +"\t "+" \t "+" \t "+  ventas[i][j]  +" \t "+" \t "+ "\t "+"\t"+"\t"+"\t";
			}
			sal+= " \t   "+ " \t " + ventasmax[i]+" \t "+ " \t ";   
			sal+= " \t   "+ " \t " + suma[i]+" \t "+ " \t ";  
			sal+= " \t   "+ " \t " + promedio[i]+" \t "+ " \t ";  
		}
		
		
			JTextArea tabla = new JTextArea();
			tabla.setText(sal);
			JOptionPane.showMessageDialog(null, sal);
			System.exit(0);
	
	}//Final_de_la_clase_main
	
	public static void Ventas(int ne, int ventas[][],int ventasmax[]) 
	{
	
		for(int i=0;i<ne;i++) {
			
			 for(int j=0;j<3;j++) {
			
				 if(ventasmax[i]<ventas[i][j])
					 ventasmax[i]=ventas[i][j]; 
			    
			 }
		}
	
	}//Final_del_void_Ventas_max
	
	public static void prom(int ne,int ventas[][],int promedio[]) 
	{
			for (int i=0;i<ne;i++)
			{
				for (int j=0;j<3;j++)
				{
					promedio[i]=promedio[i]+ventas[i][j]/3;
				}
			}
	}
	
	public static void sum(int ne,int ventas[][],int suma[])
	{
		for (int i=0;i<ne;i++)
		{
			for (int j=0;j<3;j++)
			{
				suma[i]=suma[i]+ventas[i][j];
			}
		}
	}

}//Final_del_todo_:v