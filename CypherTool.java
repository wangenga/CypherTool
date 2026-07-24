import java.util.Scanner;

public class CypherTool {
    public static void main(String[] args) {
        System.out.println("Welcome to the Cypher Tool!");

        InputData message = getInput();
    }

    public static InputData getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select operation:");
        System.out.println("1. Encrypt");
        System.out.println("2. Decrypt");
        System.out.println("$> ");

        int ops = scanner.nextInt();

        System.out.println("Select cypher: ");
        System.out.println("1. ROT13");
        System.out.println("2. Atbash");
        System.out.println("$> ");

        int cyp = scanner.nextInt();

        Scanner.nextLine();

        System.out.println("/nEnter message: ");
        System.out.println("$> ");

        Scanner.nextLine();

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