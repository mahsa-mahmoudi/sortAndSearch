package org.example;

public class BobbleSortClass {
    public static void main(String[] args) {
        int arr[] = {5, 8, 4, 6, 9, 0, 2, 7};
        System.out.println( "آرایه قبل از مرتب سازی");
        for (int num : arr ) {
            System.out.print(num  + " ");
        }
        System.out.println();
        System.out.println( "آرایه بعد از مرتب سازی");
        sortBubble(arr);
        for (int num : arr ) {
            System.out.print (num  + " ");
        }
    }
////////////////////////////////////////////////////////////
public static void sortBubble (int[] array){
        int len = array.length;

        for (int i=0 ;i<len-1 ;i++){
            for (int j =0 ; j<len-i-1;j++){
                if (array[j]> array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1] = temp;
                    }
                }
            }
        }
//////////////////////////////////////////////////////////////////////
}
