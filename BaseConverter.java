public class BaseConverter {
    public static String baseConverter(String input, int inputBase, int outputBase) {
        // Convert the number to signed decimal https://www.javatpoint.com/java-integer-parseint-method
        int decimalNumber = Integer.parseInt(input, inputBase);

        // Convert the decimal number to the target base
        return Integer.toString(decimalNumber, outputBase).toUpperCase();
    }
}
