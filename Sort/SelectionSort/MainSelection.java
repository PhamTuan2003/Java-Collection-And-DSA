package Sort.SelectionSort;

import java.util.Scanner;

public class MainSelection {
    private static final Scanner sc = new Scanner(System.in);

    private static int checkInputInt(){
        while (true){
            try{
                int result = Integer.parseInt(sc.nextLine().trim());
                return result;
            }catch (NumberFormatException e){
                System.out.println("Please enter a number");
                System.out.println("Enter again");
            }
        }
    }

    private static int inPutSizeofArray(){
        System.out.println("Enter the size of the array");
        int number = checkInputInt();
        return number;
    }

    private static int[] inPutValueArray(int number){
        int[] array = new int[number];
        for (int i = 0; i < number; i++){
            System.out.println("Enter the " + i + "th element");
            array[i] = sc.nextInt();
        }
        return array;
    }

    private static void selectionSort(int[] array){
        System.out.println("Mảng trước khi sắp xếp");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static void print(int[] array){
        System.out.println("Mảng sau khi sắp xếp");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int n = inPutSizeofArray();
        int[] array = inPutValueArray(n);
        selectionSort(array);
        print(array);
    }
}
