package demo;

import java.util.Scanner;

public class NumerosPrimos {
    public static boolean esPrimo(int numero){
        int contador = 2;
        boolean primo = true;

        while ((primo) && (contador != numero)){
            if( numero % contador == 0)
                primo = false;
            contador++;
        }
        return primo;
    }

    public static void main(String[] args) {
        Scanner introduceNumber = new Scanner(System.in);
        System.out.println("Ingrese un valor entero");
        int number = introduceNumber.nextInt();

        for(int i = 1; i <= number; i++){
            if(esPrimo(i))
                System.out.println(i + " numeros primos");
        }
        introduceNumber.close();
    }
}
