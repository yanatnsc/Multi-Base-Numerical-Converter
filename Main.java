//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user inputs
        System.out.print("Enter an number: ");
        String input = scanner.nextLine().trim().toUpperCase();
        // Doesn't have to be int/double
        // Upper case - for example 16 base could have A-F in lower case

        System.out.print("Enter the base of the number (2-16): ");
        int inputBase = scanner.nextInt();

        System.out.print("Enter the base to convert to (2-16): ");
        int outputBase = scanner.nextInt();

        // Validate inputs
        if (inputBase < 2 || inputBase > 16 || outputBase < 2 || outputBase > 16) {
            System.out.println("Bases must be between 2 and 16.");
            return;
        }

        String output = BaseConverter.baseConverter(input, inputBase, outputBase);
        System.out.println("Input: " + input + " in base " + inputBase);
        System.out.println("Output: " + output + " in base " + outputBase);
    }

    // Test case 1: base = 1
    // Test case 2: 1E, 16 ==> 30, 10
    // Test case 3: 1e, 15 ==> 29, 10
}