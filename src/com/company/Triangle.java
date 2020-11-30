package com.company;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle() {
        this.a = 1;
        this.b = 1;
        this.c = 1;
    }

    public Triangle(double a, double b, double c) {
        if(Math.max(a, Math.max(b, c)) > (a + b + c)/2.0){
            throw new IllegalArgumentException("Inequalities in the triangle are violated!");
        }
        setA(a);
        setB(b);
        setC(c);
    }

    public double surface(){
        if(Math.max(a, Math.max(b, c)) > (a + b + c)/2.0){
            throw new IllegalArgumentException("Inequalities in the triangle are violated!");
        }
        double p = (a+b+c)/2.0;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public double perimeter(){
        if(Math.max(a, Math.max(b, c)) > (a + b + c)/2.0){
            throw new IllegalArgumentException("Inequalities in the triangle are violated!");
        }
        return (a+b+c);
    }

    public static Triangle minSurface(Triangle[] triangles){
        double curr = triangles[0].surface();
        int pointer = 0;
        for(int i=0;i<triangles.length;++i){
            if(curr > triangles[i].surface()){
                curr = triangles[i].surface();
                pointer = i;
            }
        }
        return triangles[pointer];
    }

    public static Triangle maxPerimeter(Triangle[] triangles){
        double curr = triangles[0].perimeter();
        int pointer = 0;
        for(int i=0;i<triangles.length;++i){
            if(curr < triangles[i].perimeter()){
                curr = triangles[i].surface();
                pointer = i;
            }
        }
        return triangles[pointer];
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + getA() +
                ", b=" + getB() +
                ", c=" + getC() +
                ", perimeter=" + perimeter() +
                ", surface=" + String.format("%.10f",surface()) +
                '}';
    }
}
