
public class FORMATOFECHA {
	
	//Superclase
	
	protected int dia, mes,a�o;

	public  FORMATOFECHA() {
		
		dia=1;
		mes=1;
		a�o=1900;
		
	}//Fin_constructor
		
	public void set(int d, int m, int a) {

	  mes=(m>=1 && m<=12)?m:1 ;    
	  dia=comprobarD(d,m); 
	  a�o=(a>=1900 && a<=3000)?a:1900;
	 
	  
	}//Fin_del_set	

	public int comprobarD(int d, int m) {
		int resul=0;
		
		
		int dpm[]={0,31,29,31,30,31,30,31,31,30,31,30,31};
		
		resul=(d<=dpm[m])?d:1;
	return resul;	
		
	}//Fin_del_metodo

	public String formatofechas() {
		String SM[]= {"","Enero","febrero", "marzo","Abril","Mayo","Junio","julio","Agosto","Septiembre","Octubre","Nobiembre","Diciembre"};
		
		return dia+" de "+SM[mes]+" de "+ a�o;
	}

	public int getmes(){
		return mes;
	}

	public int getdia() {
		return dia;
	}

	public int geta�o() {
		return a�o;
	}

	public String toString() {
		return "    \t   "    +    formatofechas();
	}
}
