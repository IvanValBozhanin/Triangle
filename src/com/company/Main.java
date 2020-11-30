/*
 * MIT License
 *
 * Copyright (c) 2020 Ivan Valentinov Bozhanin
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

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
