package demo;

import java.util.Scanner;

public class EvenNumber {
    public static boolean esPar(int x){
        return x%2 == 0;
    }

    public static void main(String[] args) {
        Scanner introduceNumber = new Scanner(System.in);
        System.out.println("Ingrese un valor entero");
        int number = introduceNumber.nextInt();

        if(number %2 == 0){
            System.out.println(number + " es Par.");
        } else {
            System.out.println(number + " es Impar.");
        }

        introduceNumber.close();
    }
}
