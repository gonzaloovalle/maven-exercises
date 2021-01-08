import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class FirstExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter something: ");
        String input = sc.nextLine();

        System.out.printf("You entered: %s%n", input);

        if (StringUtils.isNumeric(input)) {
            System.out.printf("%s is a number%n", input);
        } else {
            System.out.printf("%s is not a number%n", input);
        }

        System.out.println("Flipped Case: " + StringUtils.swapCase(input));

        System.out.println("Reversed: " + StringUtils.reverse(input));
    }


}
