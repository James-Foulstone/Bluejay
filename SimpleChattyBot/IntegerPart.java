package SimpleChattyBot;
import java.util.Scanner;
public class IntegerPart{
    public static int extractInt(double d) {
        int integerValue = (int) d;
        return (integerValue);
    }
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final double d = scanner.nextDouble();
        System.out.println(extractInt(d));
    }
}