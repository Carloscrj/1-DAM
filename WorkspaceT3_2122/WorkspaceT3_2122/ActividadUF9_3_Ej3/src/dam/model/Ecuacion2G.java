package dam.model;

public class Ecuacion2G {
	private int a; //termino de la x2
	private int b; //termino x
	private int c; //termino independiente
	
	public Ecuacion2G(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double [] resolverEcuacion() {
		double [] soluciones= null;
		
		//(-b + sqrt (b*b-4ac))/ 2*a
		
		if(a!=0 && (b*b-4*a*c) >= 0) {
			soluciones= new double[2];
			soluciones[0] = Math.round((-b + Math.sqrt(b*b-4*a*c))/2*a*100.0)/100.0;
			soluciones[1] =  Math.round((-b - Math.sqrt(b*b-4*a*c))/2*a*100.0)/100.0;
		}
		
		return soluciones;
	}
	
	
}
