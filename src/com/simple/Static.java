package com.simple;

public class Static {

    static int x = 10;
    static int y;

    static void function(int z) {
        System.out.println("x:" + x);
        System.out.println("x:" + y);
        System.out.println("x:" + z);
    }
    static
        {
            System.out.println("Running Static initialization block");
            y=x+5;
        }
        public static void main(String [] args){
        function(8);
    }
}
