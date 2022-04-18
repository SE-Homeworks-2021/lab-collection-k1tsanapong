package lab.oodp.one;

import java.util.ArrayList;

public class Point {

    private int x;

    public Point(int i, int i1) {
    }

    public static void main(String[] args) {
        ArrayList<Point> list = new ArrayList<Point>();
        Point pt1 = new Point(3, 4);
        list.add(pt1);
        Point pt2 = list.get(0);
        pt2.x = 23;
        if (pt2 == pt1) {
            System.out.println("Same object");
        } else {
            System.out.println("Different object");
        }
    }
}
