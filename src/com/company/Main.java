package com.company;

public class Main {

    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(4, 6, 7);
        Triangle t3 = new Triangle(3, 65, 67);

        //IN T4 WE THROW NEW EXCEPTION!!!
        //Triangle t4 = new Triangle(3, 6, 23);

        System.out.println(t2.toString());
        System.out.printf("%.10f\n", t1.surface());
        System.out.println(t1.perimeter());
        System.out.printf("%.10f\n", t2.surface());
        System.out.println(t2.perimeter());
        System.out.printf("%.10f\n", t3.surface());
        System.out.println(t3.perimeter());

        System.out.println("Biggest perimeter: " + Triangle.maxPerimeter(new Triangle[]{t1, t2, t3}).toString());
        System.out.println("Smallest surface: " + Triangle.minSurface(new Triangle[]{t1, t2, t3}).toString());
        t1.setA(12.9);

        //IN NEXT FUNCTION WE THROW NEW EXCEPTION!!!
        //System.out.println(Triangle.minSurface(new Triangle[]{t1, t2, t3}).toString());

        t1.setA(1.5);
        System.out.println("Smallest surface: " + Triangle.minSurface(new Triangle[]{t1, t2, t3}).toString());
    }
}
