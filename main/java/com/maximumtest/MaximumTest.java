package com.maximumtest;
/*@Description:- To find the maximum value among three objects.*/
public class MaximumTest {
    public MaximumTest() {

    }
    //determines the greatest of three Integer Object.
    public static Integer maximum(Integer x, Integer y, Integer z) {
        Integer max = x;//initially assume x is the largest element
        if(y.compareTo(max) > 0) {
            max = y;//here max is y
        }
        if(z.compareTo(max) > 0) {
            max = z;//here max is z now
        }
        return max;

    }
// determines the largest of  three Float  objects.
    public static Float maximum(Float x, Float y, Float z) {
        Float max = x;//initially assume x is the largest element
        if(y.compareTo(max) > 0) {
            max = y;//here max is y
        }
        if(z.compareTo(max) > 0) {
            max = z;//here max is z now
        }
        return max;

    }
    // determines the largest of  three String  objects.
    public static String maximum(String x, String y, String z) {
        String max = x;//initially assume x is the largest element
        if(y.compareTo(max) > 0) {
            max = y;//here max is y
        }
        if(z.compareTo(max) > 0) {
            max = z;//here max is z now
        }
        return max;

    }
    // generic method to determine the greatest of comparable objects.
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;//initially assume x is the largest element
        if(y.compareTo(max) > 0) {
            max = y;//here max is y
        }
        if(z.compareTo(max) > 0) {
            max = z;//here max is z now
        }
        return max;

    }

    public static void main(String[] args) {
        System.out.println("Welcome in Generics concept");
     String xString = "Murari",yString = "kumar",zString = "patna";
     String max = new MaximumTest().maximum(xString,yString,zString);
     System.out.println(max);

    }
}
