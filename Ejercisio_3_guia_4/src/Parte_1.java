public class Parte_1 {

	private int radio;

	 public Parte_1(){
		//Inicializamos_los_valores_en_1
		radio=0;
	}
	 
	 //Validamos
	 public void Set (int radio) {
		 this.radio = (radio>0)? radio:0;
		  }
	
	//Retornamos_el_valor_del_radio
	public int Getradio() {
		return radio;
	}
	
	public double longitud() {
		double longi=0;
		longi=2*Math.PI*radio;
		return longi;
	}
	
	public double area() {
		double area=0;
		area=Math.PI*Math.pow(radio,2);
		return area;
	}
}
