package dam.ej1.main;

import dam.ej1.pojo.Coche;

public class Cochemain {

	public static void main(String[] args) {
		//creamos un objeto de tipo Coche invocando al constructor por defecto
		Coche coche1= new Coche();
		//asignar al atributo matricula valor
		coche1.setMatricula("1234KJH");
		
		//mostramos por consola la velocidad del coche, invocamos al metodo get del atributo acelerar
		System.out.println("Velocidad del coche: " + coche1.getVelocidad());
		
		coche1.acelerar();
		System.out.println("Velocidad del coche: " + coche1.getVelocidad());	
		coche1.acelerar();
		System.out.println("Velocidad del coche: " + coche1.getVelocidad());	
		coche1.acelerar();
		System.out.println("Velocidad del coche: " + coche1.getVelocidad());	
		coche1.acelerar();
		System.out.println("Velocidad del coche: " + coche1.getVelocidad());	
		coche1.acelerar();
		System.out.println("Velocidad del coche: " + coche1.getVelocidad());
		
		//invocamos al metodo frenar que disminuye la velocidad de 10 en 10
		coche1.frenar();
		System.out.println("Velocidad del coche: " + coche1.getVelocidad());
		coche1.frenar();
		System.out.println("Velocidad del coche: " + coche1.getVelocidad());
		coche1.frenar();
		System.out.println("Velocidad del coche: " + coche1.getVelocidad());
		
		coche1.parar();
		System.out.println("Velocidad del coche: " + coche1.getVelocidad());
		
		
		
		
	}

}
