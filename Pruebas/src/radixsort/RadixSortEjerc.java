package radixsort;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RadixSortEjerc {
	public static int[] radixSort(int []arr) {
		//Convertimos el array int[] a String[]
		String[] arrStr = StringUtil.toStringArray(arr);

		//Normalizamos cada numero al de mayor longitud completando con 0. Ej: '8' -> '00008'
		StringUtil.lNormalize(arrStr,'0');

		int maxDigito = StringUtil.maxLength(arrStr);

		// Creo un map que voy a utilizar para almacenar los valores de Ln -> L0, L1, ... , L9.
		HashMap<Character, String> map = new HashMap<>();

		// El primer bucle, va desde el valor del maximo digito hasta 0.
		for ( int i = maxDigito-1; i >= 0; i--) {
			// El segundo bloque recorre la longitud del arreglo.
			for ( int j = 0; j < arrStr.length; j++) {

				// Creo un arreglo de caracteres para ir obteniendo el numero en la posicion x de cada conjunto de numeros
				char[] stringToArray = new char[arrStr[j].length()];
				for (int k = 0; k < arrStr[j].length(); k++) {
					stringToArray[k] = arrStr[j].charAt(k);
				}

				// Selecciono un numero en la posicion i. Ej: Del numero 16223, en el recorrido i=4, tomaria el numero 3 (1622'3')
				char numero = stringToArray[i];

				// Si no existe un Ln correspondiente al numero, creo la key y asigno el numero en el value. Sino, busco la key Ln correspondiente y asigno el numero en el value.
				if ( map.get(numero) == null ) {
					map.put(numero,arrStr[j]+" ");
				} else {
					String value = map.get(numero);
					value = value + arrStr[j] + " ";
					map.remove(numero);
					map.put(numero, value);
				}
			}

			/* Muestra pasos intermedios que realiza el programa. Dejar comentado si no se usa.
			System.out.println("i: " + i);
			for (Map.Entry<Character, String> entry:map.entrySet()){
				Character key = entry.getKey();
				String value = entry.getValue();
				System.out.println("Key: " + key + " | Value: " + value);
			}*/

			// Creo un arreglo auxiliar para almacenar el arreglo original de forma temporal en cada iteraccion de ordenamiento.
			ArrayList<String> arrAuxiliar = new ArrayList<>();
			for ( int z = 0; z < 10; z++) {
				char index = Character.forDigit(z,10);
				String aux = map.get(index);
				// Si la key que se busca no existe (null) se la omite. Para evitar que agrege 'null' en el arreglo.
				if ( aux != null ) {
					String [] arrAuxiliar2 = aux.split(" ");
					for ( String elemento:arrAuxiliar2) {
						arrAuxiliar.add(elemento);
					}
				}
			}
			// Asignamos al array original el valor del auxiliar.
			arrStr = arrAuxiliar.toArray(new String[0]);
			// Se limpia el mapa por cada iteracion. El arrAuxiliar no hace falta, ya que se crea de nuevo.
			map.clear();
		}

		return arr = StringUtil.toIntArray(arrStr);
	}

	public static void main(String[] args) {
		int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
		arr = radixSort(arr);
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+(i<arr.length-1?",":""));
		}
	}
}
