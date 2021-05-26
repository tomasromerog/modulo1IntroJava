package demo;

import java.util.Scanner;

public class Multiplos {

    public static boolean esMultiplo(int n1 , int n2){
        if( n1%n2 == 0)
            return true ;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner introduceNumber = new Scanner(System.in);
        System.out.println("Ingrese un numero para determinar los multiplos");
        int number = introduceNumber.nextInt();

        for (int i = 1 ;i < number ; i++){
            if(esMultiplo(number, i)){
                System.out.print(" " + i );
            }
        }
        introduceNumber.close();
    }
}
