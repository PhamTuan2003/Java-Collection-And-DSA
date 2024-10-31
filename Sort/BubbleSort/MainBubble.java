package Sort.BubbleSort;

import java.util.Scanner;

public class MainBubble {

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

    private static void bubbleSort(int[] array){
        System.out.println("Mảng trước khi sắp xếp");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        boolean swapped = false;
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
        System.out.println();
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
        bubbleSort(array);
        print(array);
    }
}
