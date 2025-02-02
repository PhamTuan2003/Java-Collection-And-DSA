package Collection.VehicleManagement;

import java.time.ZonedDateTime;
import java.util.Scanner;

public class Utils {

    public static String getString(String str) {
        String result = "";
        boolean check = true;
        do{
            System.out.println(str);
            Scanner sc = new Scanner(System.in);
            String tmp = sc.nextLine();
            if(!tmp.isEmpty()){
                result = tmp;
                check = false;
            }
        }while (check);
        return result;
    }

    public static int getInt(String str) {
        int number;
        while (true) {
            try {
                System.out.print(str);
                Scanner sc = new Scanner(System.in);
                number = Integer.parseInt(sc.nextLine());
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Error, please input number! ");
            }
        }
    }

    public static boolean getBoolean(String message) {
        boolean result = false;
        boolean check = true;
        do{
            System.out.println(message);
            Scanner sc = new Scanner(System.in);
            String tmp = sc.nextLine();
            try{
                result = Boolean.parseBoolean(tmp);
                check = false;
            }catch (NumberFormatException E){
                throw new NumberFormatException(message);
            }
        }while (check);
        return result;
    }

    public static String updateString(String oldValue, String str) {
        String result = oldValue;
        System.out.print(str);
        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        if (!tmp.isEmpty()) {
            result = tmp;
        }
        return result;
    }

    public static int updateInt(int oldValue, String str){
        int result = oldValue;
        boolean check = true;
        try{
            do{
                System.out.println(str);
                Scanner sc = new Scanner(System.in);
                result = Integer.parseInt(sc.nextLine());
                check = false;
            }while (check);
        }catch (Exception E){
            System.out.println("Input number: ");
        }
        return result;
    }

    public static boolean updateBoolean(boolean oldValue, String message){
        boolean result = oldValue;
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        try{
            if(!tmp.isEmpty()){
                result = Boolean.parseBoolean(tmp);
            }
        }catch (NumberFormatException E){
            throw new NumberFormatException(message);
        }
        return result;
    }

    public static int getYear(String str){
        int number;
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        int yearCurrent = zonedDateTime.getYear();
        while (true){
            try {
                System.out.println(str);
                Scanner sc = new Scanner(System.in);
                number = Integer.parseInt(sc.nextLine());
                if (number < yearCurrent){
                    return number;
                }else{
                    System.out.println("The number of year cannot be greater than or equal to " + yearCurrent);
                }
            }catch (NumberFormatException e){
                System.out.println("Error,Please input number! ");
            }
        }
    }

    public static int updateYear(int oldValue, String str){
        int result = oldValue;
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        int yearCurrent = zonedDateTime.getYear();
        boolean check = true;
        try {
            do{
                System.out.println(str);
                Scanner sc = new Scanner(System.in);
                result = Integer.parseInt(sc.nextLine());
                if(result < yearCurrent){
                    check = false;
                }else{
                    System.out.println("The number of year cannot be greater than or equal to " + yearCurrent);
                }
            }while (check);
        }catch (Exception e){
            System.out.println("Error,Please input number! ");
        }
        return result;
    }

    public static String getColor(String str){
        String result = "";
        boolean check = true;
        do{
            System.out.println(str);
            Scanner sc = new Scanner(System.in);
            String tmp = sc.nextLine();
            if(!tmp.isEmpty() && (tmp.equalsIgnoreCase("blue") || tmp.equalsIgnoreCase("red") || tmp.equalsIgnoreCase("yellow") || tmp.equalsIgnoreCase("green"))){
                result = tmp;
                check = false;
            }else{
                System.out.println("Error,Please input color(Blue/Red/Yellow/Green)! ");
            }
        }while (check);
        return result;
    }

    public static String updateColor(String oldValue, String str){
        String result = oldValue;
        boolean check = true;
        do {
            System.out.println(str);
            Scanner sc = new Scanner(System.in);
            String tmp = sc.nextLine();
            if(!tmp.isEmpty() && (tmp.equalsIgnoreCase("blue") || tmp.equalsIgnoreCase("red") || tmp.equalsIgnoreCase("yellow"))){
                result = tmp;
                check = false;
            }else{
                System.out.println("Error,Please input color(Blue/Red/Yellow/Green)! ");
            }
        }while (check);
        return result;
    }

    public static int getGreaterThan0(String str) {
        int number;
        while (true) {
            try {
                System.out.print(str);
                Scanner sc = new Scanner(System.in);
                number = Integer.parseInt(sc.nextLine());
                if (number >0) {
                    return number;
                } else {
                    System.out.println("Invalid price, please re-enter number > 0!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error, please input number! ");
            }
        }
    }

    public static int updateGreaterThan0(int oldValue, String str) {
        int result = oldValue;
        boolean check = true;
        try {
            do {
                System.out.print(str);
                Scanner sc = new Scanner(System.in);
                result = Integer.parseInt(sc.nextLine());
                if (result > 0) {
                    check = false;
                } else {
                    System.out.println("Invalid price, please re-enter number > 0!");
                }
            } while (check);
        } catch (Exception e) {
            System.out.print("Error, please input number!");
        }
        return result;
    }

    public static String getType(String str) {
        String result = "";
        boolean check = true;
        do {
            System.out.print(str);
            Scanner sc = new Scanner(System.in);
            String tmp = sc.nextLine();
            if (!tmp.isEmpty() && (tmp.equals("sport") || tmp.equals("travel") || tmp.equals("common") || tmp.equals("Sport") || tmp.equals("Travel") || tmp.equals("Common"))) {
                result = tmp;
                check = false;
            } else {
                System.out.println("Enter the wrong type, please re-enter (Sport/Travel/Common)!");
            }

        } while (check);
        return result;
    }

    public static String updateType(String oldValue, String str) {
        String result = oldValue;
        boolean check = true;
        do {
            System.out.print(str);
            Scanner sc = new Scanner(System.in);
            String tmp = sc.nextLine();
            if (!tmp.isEmpty() && (tmp.equals("sport") || tmp.equals("travel") || tmp.equals("common") || tmp.equals("Sport") || tmp.equals("Travel") || tmp.equals("Common") || tmp.equalsIgnoreCase(" "))) {
                result = tmp;
                check = false;
            } else {
                System.out.println("Enter the wrong type, please re-enter (Sport/Travel/Common)!");
            }
        } while (check);
        return result;
    }

    public static String getYesNo(String str) {
        String result = "";
        boolean check = true;
        do {
            System.out.print(str);
            Scanner sc = new Scanner(System.in);
            String tmp = sc.nextLine();
            if (!tmp.isEmpty() && (tmp.equalsIgnoreCase("Yes") || tmp.equalsIgnoreCase("No"))) {
                result = tmp;
                check = false;
            } else {
                System.out.println("Enter the wrong type, please re-enter (Yes/No)!");
            }

        } while (check);
        return result;
    }

    public static String updateYesNo(String oldValue, String str) {
        String result = oldValue;
        boolean check = true;
        do {
            System.out.print(str);
            Scanner sc = new Scanner(System.in);
            String tmp = sc.nextLine();
            if (!tmp.isEmpty() && (tmp.equalsIgnoreCase("Yes") || tmp.equalsIgnoreCase("No") || tmp.equalsIgnoreCase(" "))) {
                result = tmp;
                check = false;
            } else {
                System.out.println("Enter the wrong type, please re-enter (Yes/No)!");
            }
        } while (check);
        return result;
    }

    public static void printMenu() {
        System.out.println("------- TABLE MENU -------");
        System.out.println("1. Load Data From File");
        System.out.println("2. Add New Vehicle");
        System.out.println("3. Update Vehicle");
        System.out.println("4. Delete Vehicle");
        System.out.println("5. Search Vehicle");
        System.out.println("6. Show Vehicle lists");
        System.out.println("7. Store Data To File");
        System.out.println("Other. Exit");
        System.out.println("--------------------------\n");
    }

}
