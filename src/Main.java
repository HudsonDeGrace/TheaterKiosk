import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int age = 0;
        String trash = "";

        System.out.println("Enter your age (If you are over 21 you get a wristband) ");
        if(in.hasNextInt()){
            age = in.nextInt();
            if(age >= 21){
                System.out.println("You get a wristband!");
            }
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println("\nYou said your age was: " + trash);
            System.out.println("Run the program again and enter a valid age!");
        }
    }
}