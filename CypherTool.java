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

        if (operation == 1 && cypher == 1) {
            String result = encryptRot13(message);
            System.out.println(result);
        }
        if (operation == 2 && cypher == 1) {
            String result = decryptRot13(message);
            System.out.println(result);
        }

        return null;
    }

    public static String encryptRot13(String s) {

        char[] message = s.toCharArray();
        for (int i = 0; i < message.length; i++){
            char current = message[i];

            if (Character.isLetter(current)) {
                if (current + 13 > (Character.isUpperCase(current) ? 'Z' : 'z')) {
                    message[i] = ((char) (current + 13 - 26));
                } else {
                    message[i] = ((char) (current + 13));
                }
            }
        }

        return new String(message);
    }

    public static String encryptAtbash(String s) {
        return "";
    }

    public static String decryptRot13(String s) {

            char[] message = s.toCharArray();

        
         for (int i = 0; i < message.length; i++){
            
            if(message[i] - 13 < (Character.isUpperCase(message[i]) ? 'A' : 'a')){
                message[i] =((char) (message[i] - 13 + 26));
            }else{
                message[i] =((char) (message[i] - 13));
            }
        }

        return new String(message);
    }

    public static String decryptAtbash(String s) {
        return "";
    }
}

