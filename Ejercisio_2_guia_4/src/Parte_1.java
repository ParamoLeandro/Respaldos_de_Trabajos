
public class Parte_1 {

	private int base;
	private int altura;
	
	 public Parte_1(){
		//Inicializamos_los_valores_en_1
		base=1;
		altura=1;
	}
	 
	 //Validamos
	 public void Set (int base, int altura) {
		
		 this.altura = (altura>1)? altura:1;
		 this.base = (base>1)? base:1;
		
		
		  }
	
	 public int Getaltura() {
		 
		 return altura;
		 
	 }
	
	public int Getbase() {
		
		return base;
	}
	
	public double perimetro() {
		double peri;
		peri=Math.pow(base,2)+Math.pow(altura,2);
		return peri;
	}
	
	public int area() {
		int ar;
		ar=base*altura;
		return ar;
	}
}
