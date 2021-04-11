package com.maximumtest;
/*@Description:- To find the maximum value among three objects.*/
public class MaximumTest {
    public MaximumTest() {

    }
// determines the largest of  three Integer  objects.
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

    public static void main(String[] args) {
        System.out.println("Welcome in Generics concept");
        Integer xInt  = 4, yInt = 5, zInt = 6;
     Integer max =  new MaximumTest().maximum(xInt,yInt,zInt);
     System.out.println("The maximum  Element is "+max);

    }
}
