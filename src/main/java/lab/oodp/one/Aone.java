package lab.oodp.one;

import java.util.ArrayList;

public class Aone {

    public static void main (String[] args){
        ArrayList list = new ArrayList();
        Character letter = new Character('a');
        list.add(letter);
        if (list.get(0).equals("a")) {
            System.out.println("funny");
        } else {
            System.out.println("Not funny");
        }
    }
}
