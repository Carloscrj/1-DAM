package dam.ejercicioswitch1.pojo;

public class Jugador {
	
	private String nombre;
	private int edad;
	
	public Jugador(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String IndicarCategoria() {
		switch (edad) {
		case 7 :
		case 8 :
			return ("Su categor�a es Pre-benjam�n");	//al poner el return no me deja poner el break, porque con return ya estoy finalizando
		case 9:                                         //para poner el break un vez de return tendr�a que crear una variable String categoria=""
		case 10:	                                    //quedaria asi
			return ("Su categor�a es Benjam�n");        //           public String IndicarCategoria(){
		case 11 :                                        //              String categoria = ""
		case 15 :                                         //              case 7:
		case 12 :                                         //              case 8:
			return ("Su categor�a es Alev�n");            //                      categoria:"pre-benjamin"
		case 13:                                          //              break;
		case 14:                                          //            }
			 return ("Su categor�a es Infantil");         //                 return "La categoria es "+categori
		case 16 :
			return ("Su categor�a es Cadete");
		case 17:
		case 18:
		case 19:
			return ("Su categor�a es Juvenil");
			default:
				return ("No es edad de futbol base");
	 }
		
	}
	public String getNombre() {  //creamos este get para que nos de los nombre en la clase main.
		return "El nombre es " +nombre;
		}
}