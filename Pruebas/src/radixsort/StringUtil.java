package radixsort;

import java.util.Arrays;

public class StringUtil {
	// Retorna una cadena compuesta por n caracteres c
	// Ejemplo: replicate('x',5) ==> 'xxxxx'
	public static String replicate(char c,int n) {
		String cadena = "";
		for ( int i = 0; i < n; i++ ) {
			cadena = cadena + c;
		}
		return cadena;
	}

	// Retorna una cadena de longitud n, compuesta por s
	// y precedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	// Ejemplo lpad("5",3,'0') ==> "005"
	public static String lpad(String s, int n, char c) {
		int longString = n-s.length();
		return replicate(c,longString)+s;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static String[] toStringArray(int[] arr) {
		//String[] arrStr = Arrays.stream(arr).mapToObj(String::valueOf).toArray(String[]::new);
		String[] arrStr = new String[arr.length];
		for ( int i = 0; i < arr.length; i++) {
			arrStr[i] = String.valueOf(arr[i]);
		}
		return arrStr;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como enteros
	public static int[] toIntArray(String arr[])
	{
		//int[] arrInt = Stream.of(arr).mapToInt(Integer::parseInt).toArray();
		int[] arrInt = new int[arr.length];
		for ( int i = 0; i < arr.length; i++) {
			arrInt[i] = Integer.parseInt(arr[i]);
		}
		return arrInt;
	}

	// Retorna la longitud del elemento con mayor cantidad
	// de caracteres del array arr
	public static int maxLength(String arr[])
	{
		int maxDig = arr[0].length();
		for(int i=1;i < arr.length;i++){
			if(arr[i].length() > maxDig){
				maxDig = arr[i].length();
			}
		}
		return maxDig;
	}

	// Completa los elemento del arr agregando caracteres c
	// a la izquierda, dejando a todos con la longitud del mayor
	public static void lNormalize(String arr[], char c) {
		for ( int i = 0; i < arr.length; i++) {
			arr[i] = lpad(arr[i], maxLength(arr), c);
		}
	}
	
}
