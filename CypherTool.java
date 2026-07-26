import java.util.Scanner;
public class CypherTool {
    public static void main(String[] args) {
      System.out.println("Welcome To CypherTool!");

      InputData result = getInput();

      System.out.println(result);
    }

    public static InputData getInput() {
        System.out.println("Select operation: ");
        System.out.println("1. Encrypt");
        System.out.println("2. Decrypt");
        System.out.print("$> ");

        Scanner scanner = new Scanner(System.in);
        int operation = 0;
        boolean isValid = false;

        while (!isValid){

            //check if input is an integer
            if(scanner.hasNextInt()){
                operation = scanner.nextInt();

                //check if integer is 1 or 2
                if (operation == 1 || operation == 2){
                    isValid = true;
                } else {
                    System.out.println("Error: You entered " + operation + ". Please enter 1 or 2.");
                    System.out.print("$> ");
                }
            }
            else {

                // handle non-integer
                    String invalidInput = scanner.next();
                    System.out.println("Error: " + invalidInput + " is not a valid input.");
                    System.out.print("$> ");
            }
        }
        return null;
    }

    public static String encryptRot13(String s) {
        return "";
    }

    public static String encryptAtbash(String s) {
        return "";
    }

    public static String decryptRot13(String s) {
        return "";
    }

    public static String decryptAtbash(String s) {
        return "";
    }

}