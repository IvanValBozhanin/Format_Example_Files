package com.company;

public class Main {

    public static void main(String[] args) {
	    printSeries(20);
	    printPi100Iterations(9);
    }
    public static void printSeries(int n){
        System.out.println("I\t\tm(i)\t");
        System.out.println("——————————");
        for(int i = 1; i<=n;++i) {
            System.out.printf("%d\t\t%.4f\n", i, mathSeries(i));
        }
    }
    public static double mathSeries(int n){
        double k = 0;
        for(int i=1;i<=n;++i) {
            k += (double) i / (i + 2);
        }
        return k;
    }

    public static void printPi100Iterations(int n){
        System.out.println("I\t\tPI\t");
        System.out.println("——————————");
        for(int i=0;i<=n; ++i){
            int k = i*100+1;
            System.out.printf("%d\t\t%.4f\n", k, computePi(k));
        }
    }

    public static double computePi(int n){
        double pi = 0;
        for(int i=1;i<=n;++i){
            pi = pi + (((i & 1) == 1) ? 1.0 / (2 * i - 1) : -1.0 / (2 * i - 1));
        }
        return pi*4;
    }

}
