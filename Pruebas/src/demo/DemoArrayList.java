package demo;

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<String>();
        a.add("Tomas");
        a.add("Pedro");
        a.add("Juan");

        for(int i = 0; i < a.size() ; i++){
            System.out.println(a.get(i));
        }

        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(1);
        b.add(2);
        b.add(3);
        Integer c = 4;
        b.add(c);

        for(Integer x:b){
            System.out.println(x);
        }
    }
}
