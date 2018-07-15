package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double MS_POR_SEGUNDO = 1000;
        final double NS_POR_SEGUNDO = 1000000000;

        int n = sc.nextInt();

        int[] arreglo = new int[n];
        for (int i = 0; i <n ; i++) {
            arreglo[i] = (int) (Math.random()*n)+2;
        }

        Sorts ordenamiento = new Sorts();
        Heapsort ordenar = new Heapsort();


        System.out.println("\n con la cantidad de "+ n + "  datos Los resultados son");

        //Bubble sort
        long INICIO_NS1 = System.nanoTime();
        ordenamiento.bubleSort(arreglo);
        long DURACIÓN_NS1 = System.nanoTime() - INICIO_NS1;

        double DURACIÓN_S1 = DURACIÓN_NS1 / NS_POR_SEGUNDO;


        System.out.println("\nTEST 1 - Resultados ");
        System.out.println("El algoritmo Bubble sort demoró: " + DURACIÓN_NS1 + " Nanosegundos; "+ DURACIÓN_S1 + " Segundos");

        //Heap sort

        long INICIO_NS2 = System.nanoTime();
        ordenar.heapSort(arreglo);
        long DURACIÓN_NS2 = System.nanoTime() - INICIO_NS2;

        double DURACIÓN_S2 = DURACIÓN_NS2 / NS_POR_SEGUNDO;


        System.out.println("\nTEST 2 - Resultados ");
        System.out.println("El algoritmo Heap sort demoró: " + DURACIÓN_NS2 + " Nanosegundos; "+ DURACIÓN_S2 + " Segundos");

        //Merge sort

        long INICIO_NS3 = System.nanoTime();
        ordenamiento.mergeSort(arreglo);
        long DURACIÓN_NS3 = System.nanoTime() - INICIO_NS3;

        double DURACIÓN_S3 = DURACIÓN_NS3 / NS_POR_SEGUNDO;


        System.out.println("\nTEST 3 - Resultados ");
        System.out.println("El algoritmo Merge sort demoró: " + DURACIÓN_NS3 + " Nanosegundos; "+ DURACIÓN_S3 + " Segundos");

        //Insertion sort

        long INICIO_NS4 = System.nanoTime();
        ordenamiento.insertionsort(arreglo);
        long DURACIÓN_NS4 = System.nanoTime() - INICIO_NS4;

        double DURACIÓN_S4 = DURACIÓN_NS4 / NS_POR_SEGUNDO;


        System.out.println("\nTEST 4 - Resultados ");
        System.out.println("El algoritmo Insertion sort demoró: " + DURACIÓN_NS4 + " Nanosegundos; "+ DURACIÓN_S4 + " Segundos");



    }
}
