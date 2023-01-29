import java.util.Scanner;
public class helloworld {
    public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
        System.out.println("Hello user, enter your preferred name:");
        String userName = userInput.nextLine();
        String greeting = "Hello " + userName + ", I hope you're having a wonderful day!";
        System.out.println(greeting);
    }
}
