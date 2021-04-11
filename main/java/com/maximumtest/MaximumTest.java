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

    public static void main(String[] args) {
        System.out.println("Welcome in Generics concept");
        Float xFloat  = 4.4f, yFloat =4.5f, zFloat = 4.6f;
     Float max =  new MaximumTest().maximum(xFloat,yFloat,zFloat);
     System.out.println("The maximum  Element is "+max);

    }
}
