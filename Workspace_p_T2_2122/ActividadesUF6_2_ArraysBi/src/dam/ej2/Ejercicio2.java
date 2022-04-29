package dam.ej2;

public class Ejercicio2 {

	static int [][] matriz; //declaramos global el array bidimensional para poder usarlo en m�todos de rellenar y mostrar
	public static void main(String[] args) {
			matriz = new int [4][4];
			
			// ---------------------
			// | ----------------- |
			// | | 0 | 0 | 0 | 0 | |
			// | ----------------- |
			// ---------------------
			// | ----------------- |
			// | | 0 | 0 | 0 | 0 | |
			// | ----------------- |
			// ---------------------
			// | ----------------- |
			// | | 0 | 0 | 0 | 0 | |
			// | ----------------- |
			// ---------------------
			// | ----------------- |
			// | | 0 | 0 | 0 | 0 | |
			// | ----------------- |
			// ---------------------
			
			rellenarMatriz();
			
			mostrarMatriz();
			
			analizaSimetria();
		}

		private static void analizaSimetria() { //m�todo para comprobar simetr�a entre tri�ngulo rojo y azul de los apuntes
			
			boolean simetrica = true;
			
			for (int i = 0; i < matriz.length-1; i++) { //length es -1 porque la tercera fila no nos interesa para comprobar el tri�ngulo azul
				for (int j = i+1; j < matriz[i].length; j++) { //j empieza con el valor de i+1 porque, recordemos, queremos revisar el tri�ngulo azul, para comprobar simetr�a
					if (matriz[i][j] != matriz[j][i]) { //comparamos si el valor espejo es igual invirtiendo los datos a comparar: j i
						simetrica = false; //si no lo es, cambia a false y, en cuanto valor no es igual, ya paramos el bucle porque no va a ser sim�trico
						j = matriz[i].length; //fin de bucle
						i = matriz.length-1; //fin de bucle
					}
				}
			}
			
			if (simetrica) {
				System.out.println("La matriz es sim�trica");
			} else {
				System.out.println("La matria NO es sim�trica");
			}
			
		}

		private static void mostrarMatriz() {
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					System.out.print(matriz[i][j]+" "); //mostrar sin salto de l�nea el elemento seguido de un espacio
					
				}
				
				System.out.println();//para que salte de l�nea al terminar cada columna de dentro
			}
		}

		private static void rellenarMatriz() { //indice i para recorrer filas e indice j para columnas de cada fila
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) { //para poder recorrer las posiciones del array que hay dentro de cada array
					matriz[i][j] = i + j; //datos con los que se va rellenando el array bidimensional
				}
			}
		}
	}
//2. Realiza un programa en el que se cree una matriz 4x4, se rellene de enteros y se compruebe si es sim�trica.
