import java.util.Scanner;
public class CypherTool {
    public static void main(String[] args) {
      System.out.println("Welcome To CypherTool!");

      InputData result = getInput();

      System.out.println(result);
    }

    public static InputData getInput() {
        int operation = 0;
        int cypher = 0;
        String message = "";
        boolean isValid = false;
        Scanner scanner = new Scanner(System.in);
        
        
        // operation validation
        System.out.println("Select operation: ");
        System.out.println("1. Encrypt");
        System.out.println("2. Decrypt");
        System.out.print("$> ");

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


        // cypher validation
        isValid = false;
        System.out.println();
        System.out.println("Select cypher: ");
        System.out.println("1. ROT13");
        System.out.println("2. Atbash");
        System.out.println("3. I dont know yet");
        System.out.print("$> ");

        while (!isValid){

            //check if input is an integer
            if(scanner.hasNextInt()){
                cypher = scanner.nextInt();

                //check if integer is 1,2 or 3
                if (cypher == 1 || cypher == 2 || cypher == 3){
                    isValid = true;
                } else {
                    System.out.println("Error: You entered " + cypher + ". Please enter 1, 2 or 3.");
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

        // Enter message
        scanner.nextLine();
        isValid = false;
        System.out.println();
        System.out.println("Enter the message: ");
        System.out.print("$> ");

        while (!isValid){
            message = scanner.nextLine();
            
            if (message.trim().isEmpty()){
                System.out.println("Error: Text cannot be empty. Please enter Message.");
                System.out.print("$> ");
            }else {
                isValid = true;
            }
        }
        System.out.println();

        System.out.println(operation);
        System.out.println(cypher);
        System.out.println(message);
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