package com.maximumtest;
/*@Description:- To find the maximum value among three objects.*/
public class MaximumTest<T extends Comparable<T>> {
    T x,y,z;

    public MaximumTest(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public MaximumTest() {
    }

    public T maximum(){
        return MaximumTest.maximum(x,y,z);
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;//initially assume x is the largest element
        if(y.compareTo(max) > 0) {
            max = y;//here max is y
        }
        if(z.compareTo(max) > 0) {
            max = z;//here max is z now
        }
        printMax(x,y,z,max);
        return max;

    }

    private static <T extends Comparable<T>> void printMax(T x, T y, T z, T max) {
        System.out.printf("Max of %s, %s and %s is %s\n",x,y,z,max);
    }
    public static void main(String[] args) {
        System.out.println("Welcome in Generics concept");
        Integer xInt = 3 , yInt = 4 ,zInt = 5;
        new MaximumTest(xInt,yInt,zInt).maximum();

    }
}
