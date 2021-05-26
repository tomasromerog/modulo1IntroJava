package demo;

import java.util.Scanner;

public class NumeroPrimo {
    public static boolean esPar(int x){
        return x%2 == 0;
    }

    public static void main(String[] args) {
        Scanner introduceNumber = new Scanner(System.in);
        System.out.println("Ingrese un valor entero");
        int number = introduceNumber.nextInt();

        int contador = 0;
        for(int i = 1; i <= number; i++){
            if((number % i) == 0){
                contador ++;
            }
        }
        if(contador <= 2){
            System.out.println(number + " es un numero Primo.");
        } else {
            System.out.println(number + " no es un numero Primo.");
        }
        introduceNumber.close();
    }
}
