import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class FirstExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter something: ");
        String input = sc.nextLine();

        System.out.println("You entered: " + input);

        if (StringUtils.isNumeric(input)) {
            System.out.println(input + " is a number");
        } else {
            System.out.println(input + " is not a number");
        }

        System.out.println("Flipped Case: " + StringUtils.swapCase(input));

        System.out.println("Reversed: " + StringUtils.reverse(input));
    }


}
