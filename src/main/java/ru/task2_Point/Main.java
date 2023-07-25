package ru.task2_Point;

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(5.0, 1.0);
        Point p2 = new Point(4.0, 6.0);

        System.out.println("3. Расстояние между точками " + p1.toString() + " и " + p2.toString() + ": " + distance(p1, p2));
        System.out.println("4. Расстояние между точками " + p1.toString() + " и " + p2.toString() + ": " + p1.distance(p2));
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x) + (p1.y-p2.y)*(p1.y-p2.y));
    }
}