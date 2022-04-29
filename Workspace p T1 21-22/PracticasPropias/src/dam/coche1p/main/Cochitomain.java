package dam.coche1p.main;

import dam.coche1p.pojo.Cochito;

public class Cochitomain {

	public static void main(String[] args) {
		
		Cochito cochito1 = new Cochito();
		
		cochito1.setMatricula("1234KJH");
		
		System.out.println("La matrícula del coche es "+cochito1.getMatricula());
		
		cochito1.acelerar();
		System.out.println("La velocidad del coche es"+cochito1.getVelocidad());
		cochito1.acelerar();
		System.out.println("La velocidad del coche es"+cochito1.getVelocidad());cochito1.acelerar();
		cochito1.acelerar();
		System.out.println("La velocidad del coche es"+cochito1.getVelocidad());
		cochito1.acelerar();
		System.out.println("La velocidad del coche es"+cochito1.getVelocidad());
		cochito1.acelerar();
		System.out.println("La velocidad del coche es"+cochito1.getVelocidad());
		
		cochito1.frenar();
		System.out.println("La velocidad el coche es"+cochito1.getVelocidad());
		cochito1.frenar();
		System.out.println("La velocidad el coche es"+cochito1.getVelocidad());
		cochito1.frenar();
		System.out.println("La velocidad el coche es"+cochito1.getVelocidad());
		
		cochito1.parar();
		System.out.println("La velocidad el coche es"+cochito1.getVelocidad());
		
		
		
		
		

	}

}
