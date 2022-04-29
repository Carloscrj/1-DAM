package dam.pruebas.main;

import dam.pruebas.pojo.Libro;

public class UsoLibro {

	public static void main(String[] args) {
		Libro libro1 = new Libro(); //creamos el objeto libro 1
		libro1.setTitulo("El señor de los Anillos");
		libro1.setAutor("JRR Tolkien");
		libro1.setNumPag(1345);
		libro1.setTapaTipo(true);
		
		System.out.println(libro1);
		
		Libro libro2 = new Libro("Sombra y hueso", "Leight Bardugo", 567);
		System.out.println("\n" + libro2);
		
		Libro libro3 = new Libro("El rey marcado", "Leight Bardugo", 654, true);
		System.out.println("\n" + libro3);
		
	}

}
