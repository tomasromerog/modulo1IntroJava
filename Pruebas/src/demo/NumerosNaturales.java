package demo;

import java.util.Scanner;

public class NumerosNaturales {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros a imprimir");
        int cantidadImprimir = Integer.parseInt(number.nextLine());

        System.out.println("Ingrese la cantidad minima de digitos a buscar en el numero: ");
        int minimoBuscar = Integer.parseInt(number.nextLine());

        System.out.println("ingrese el digito a buscar: " );
        int digitoBuscar = Integer.parseInt(number.nextLine());

        int cantidad = 0;
        int numero = digitoBuscar;

        while(cantidad < cantidadImprimir){
            int digitosEncontrados = 0;
            int numeroIt = numero;

            while(numeroIt > 0){
                if(numeroIt % 10 == digitoBuscar){
                    ++digitosEncontrados;
                }
                numeroIt = numeroIt/10;
            }
            if( digitosEncontrados == minimoBuscar){
                System.out.println(numero);
                ++cantidad;
            }
            numero++;
        }
    }
}
