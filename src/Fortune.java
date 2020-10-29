import java.util.Random;
import java.util.Scanner;

public class Fortune {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Would You like to know your future? Press 1 for Y and 2 for N");
        int userChoice = scan.nextInt();
        if(userChoice == 1) {
            System.out.println("Please enter your name");
            String userName = scan.next();
            System.out.println("Please enter your age");
            int age = scan.nextInt();
            System.out.println(userName + " I will now tell you your future! Are you ok with that? 1 for Y and 2 for N");
            int userChoice2 = scan.nextInt();

            if(userChoice2 == 1) {
                int randomNumber = rand.nextInt(4);
                if (randomNumber == 1) {
                    System.out.println("You will be rich by the age of " + (age + 10));
                } else if (randomNumber == 2) {
                    System.out.println("You will be broke " + (age + 10));
                } else if (randomNumber == 3) {
                    System.out.println("Poverty awaits you");
                }
            }else if(userChoice2 == 2){
                System.out.println("You are now cursed and will be dammed to hell!");
            }else{
                System.out.println("You have put in a incorrect answer");
            }
        } else{
            System.out.println("Goodbye!");
        }
    }





}







