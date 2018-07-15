package com.company;

public class Sorts {

    public int[] mergeSort (int [] arreglo){
        int i, j, k;
        if (arreglo.length > 1){
            int izquierda = arreglo.length/2;
            int derecha = arreglo.length-izquierda;
            int [] arregloizq = new int[izquierda];
            int [] arregloder = new int[derecha];
            for (i = 0; i <izquierda ; i++) {
                arregloizq[i] = arreglo[i];
            }
            for (i = izquierda ; i < izquierda + derecha ; i++) {
                arregloder[i-izquierda] = arreglo[i];
            }
            arregloizq = mergeSort(arregloizq);
            arregloder = mergeSort(arregloder);
            i=0; j=0; k=0;
            while(arregloizq.length != j && arregloder.length != k){
                if (arregloizq[j] < arregloder[k]) {
                    arreglo[i] = arregloizq[j];
                    i++; j++;
                }else {
                    arreglo[i] = arregloder[k];
                    i++; k++;
                }
            }
            while(arregloizq.length != j){
                arreglo[i]=arregloizq[j];
                i++; j++;
            }
            while(arregloder.length != k){
                arreglo[i] = arregloder[k];
                i++;  k++;
            }
        } return arreglo;
    }



    public void bubleSort (int []arreglo){

        for (int i = 0; i <arreglo.length ; i++) {
            for (int j = 0; j <arreglo.length ; j++) {
                if (arreglo[i]<arreglo[j]){
                    int temp = arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=temp;
                }
            }
        }

    }

    void insertionsort (int []arreglo){

        int aux, cont1,cont2;

        for (cont1 = 1; cont1 < arreglo.length ; cont1++) {
            aux = arreglo[cont1];

            for (cont2 =cont1-1;  cont2 >= 0 && arreglo[cont2]>aux ; cont2--) {

                arreglo[cont2+1] = arreglo[cont2];
                arreglo[cont2] = aux;
            }

        }
    }

}
