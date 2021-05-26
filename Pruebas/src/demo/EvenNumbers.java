package demo;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner introduceNumber = new Scanner(System.in);
        System.out.println("Ingrese un numero para determinar los numeros pares inferiores");
        int number = introduceNumber.nextInt();

        for (int i = 1 ;i < number ; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
        introduceNumber.close();
    }
}
