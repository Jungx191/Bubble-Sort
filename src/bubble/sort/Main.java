/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubble.sort;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int NumOfArray = Validation.getIntInRange("Enter number of array: ", 0, Integer.MAX_VALUE);
        BubbleSorter bs = new BubbleSorter(NumOfArray);

        bs.display("Unsorted array: ");
        bs.bubbleSort();
        bs.display("Sorted array: ");

    }

}
