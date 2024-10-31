package Sort.InsertionSort;

import java.util.Scanner;

public class MainInsertion {
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

    private static int[] inputValueArray(int number){
        int[] array = new int[number];
        for (int i = 0; i < number; i++){
            System.out.println("Enter the " + i + "th element");
            array[i] = sc.nextInt();
        }
        return array;
    }

    private static void insertionSort(int[] array){
        System.out.println("Mảng trước khi sắp xếp");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            //Vẫn còn phần tử bên trái để so sánh.
            //Nếu phần tử tại vị trí j lớn hơn key,
            // ta cần dịch chuyển phần tử này sang phải để nhường chỗ cho key.
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
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
        int[] array = inputValueArray(n);
        insertionSort(array);
        print(array);
    }
}
