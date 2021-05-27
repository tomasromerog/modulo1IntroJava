package demo;

public class DemoFuncionesUtilitarias {
    public static void main(String[] args) {

        //De cadena a integer
        int x = Integer.parseInt("123");
        System.out.println(x);

        //Convierto de int a cadena
        String s = Integer.toString(123);
        System.out.println(s);

        //Convierto de base
        int z = Integer.parseInt("123DAF", 16);
        System.out.println(z);
    }
}
