import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String type = scanner.nextLine();

       switch (type){

           case"int":
               int firstNum = Integer.parseInt(scanner.nextLine());
               int secondNum = Integer.parseInt(scanner.nextLine());
               System.out.println(getMax(firstNum, secondNum));
               break;

           case"char":
               char firstChar = scanner.nextLine().charAt(0);
               char secondChar = scanner.nextLine().charAt(0);
               System.out.println(getMax(firstChar, secondChar));
               break;

           case"string":
               String firstString = scanner.nextLine();
               String secondString = scanner.nextLine();
               System.out.println(getMax(firstString, secondString));
               break;



       }
    }


    public static int getMax(int first, int second){
        if (first > second){
            return first;
        }
        return second;
    }

    public static char getMax(char firstChar, char secondChar){
        if (firstChar > secondChar){
            return firstChar;
        }
        return secondChar;
    }

    public static String getMax(String firstString, String secondString){
        String maxString = "";
        if (firstString.compareTo(secondString) > 0){
            maxString = firstString;

        }else{
            maxString = secondString;
        }
        return maxString;
    }
}
