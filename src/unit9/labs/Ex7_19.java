package unit9.labs;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Ex7_19 {

    public static void isSorted(int[] list) {

        // Print, "The list has __ integers ....

        // Then print, "The list is (not) sorted."

        // For 7.19, no return is necessary.  (Change of instructions from the textbook.)

        int intCount = 0;
        for (int num : list){

            ++intCount;

        }
        boolean sorted = true;

        for (int i = 0; i < intCount - 1; i++){

            if (list[i] > list[i+1]){

                sorted = false;

                }
            }


        System.out.printf("The list has %d integers: ", intCount);
        for (int num : list){
            System.out.printf("%d ", num);
        }

        if (sorted){
            System.out.println("\nThis list is sorted.");

        }
        else{
            System.out.println("\nThis list is not sorted.");
        }

    }

    public static void main(String[] args) {
        System.out.println("#1");
        isSorted(new int[]{4,7, 19, 21, 44, 98, 101});

        System.out.println("\n#2");
        isSorted(new int[]{4,7, 54, 15, 19, 21, 44, 98, 101});

        System.out.println("\n#3");
        isSorted(new int[]{-2, 0, 3});
    }
}