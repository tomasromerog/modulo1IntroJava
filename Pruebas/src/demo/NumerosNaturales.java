package demo;

import java.util.Scanner;

public class NumerosNaturales {
    public static boolean esNatural(int numero){
        int contador = 0;
        boolean natural = true;

        while (contador != numero){
            contador++;
        }
        return natural;
    }

    public static void main(String[] args) {
        Scanner introduceNumber = new Scanner(System.in);
        System.out.println("Ingrese un valor");
        int number = (int) introduceNumber.nextDouble();

        for(int i = 1; i <= number; i++){
            if(esNatural(i))
                System.out.println(i + " numeros naturales");
        }
        introduceNumber.close();
    }
}
