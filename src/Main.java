import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your year of birth: ");

        boolean hasNextInt=scanner.hasNextInt();
        if(hasNextInt) {
            int yearofBirth = scanner.nextInt();
            scanner.nextLine();
            System.out.println("enter your name: ");
            String name = scanner.nextLine();
            int age = 2019 - yearofBirth;
            if (age >= 0 && age <= 100) {
                System.out.println("Your name is: " + name + ", and you are " + age + " years old");
            } else {
                System.out.println("Invalid year of Birth");
            }
        }
        else{
            System.out.println("Unable to parse year of birth");

            }
        scanner.close();

    }
}
