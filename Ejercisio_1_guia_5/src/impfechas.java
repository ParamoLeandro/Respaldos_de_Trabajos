//CLASE HIJA:


public class impfechas  extends FORMATOFECHA  {

	private String Nombre;
    private FORMATOFECHA FORMATOFECHA;	
	private int diac, mesc,a�oc;
    public impfechas() {
		
		super();
		Nombre=null;
		
	}
	
	public String getNombre() {
		return Nombre;
	}
	
public void set(String Nombre, int d, int m, int n) {
	this.Nombre=Nombre;
   dia=d;
   mes=m;
   a�o=n;

}
public void set(int diac, int mesc, int a�oc) {
	this.diac=diac;
	this.mesc=mesc;
	this.a�oc=a�oc;
}

public String impactual() {
	FORMATOFECHA obejeto=new FORMATOFECHA();
   obejeto.set(diac,mesc,a�oc);
  obejeto.comprobarD(diac, mesc);
   return obejeto.formatofechas();
}

public int calcularedad() {
	int resul=0;
  
if(mes==mesc && diac<dia) {
	resul=a�oc-a�o;
	resul=resul-1;
}else if(mes==mesc && diac>dia) {
	resul=a�oc-a�o;
}else  if(mes==mesc && diac==dia){
	resul=a�oc-a�o;
}else if(mesc<mes){
	resul= a�oc-a�o;
	resul=resul-1;
}else if(mesc>mes) {
	resul= a�oc-a�o;
} 
	
return resul;
}//FIN_DEL_ METODO

public String toString() {
return "  \t  " + Nombre       + "   \t  " +   super.toString() +"\t"   +  "   \t       "  +    
     calcularedad() + 	
"\n"+"Fecha actual:"+ "\t" + impactual() +  "   \t  " +"\n" + "\n";
}


	
}//FIN DE LA CLASE HIJA

