import java.util.Scanner;
import java.math.*;
public class MiniProject {
    public static void main(String[] args) {
        System.out.println("Welcome to Project");
        System.out.println("Press 1 to Start");
        System.out.println("Press 2 to End");
        Scanner sc= new Scanner(System.in);
        int gamestart = sc.nextInt();


        if (gamestart == 1) {
            int number= (int) (Math.random()*100);
            int guessednumber;

            do{                
                System.out.println("Enter Number");
    guessednumber = sc.nextInt();
if (guessednumber > number) {
    System.out.println("The number is smaller");
}
else if (guessednumber < number) {
    System.out.println("The number is greater");
}
else if(guessednumber == number){
System.out.println("Congratulation");
break;
}
System.out.println("To quit Press -1");
}while(guessednumber>=0);
System.out.print("Number was:");
System.out.println(number);
        }
        else if (gamestart == 2) {
            System.out.println("The End");
        }
        else
        {
            System.out.println("Not Valid Option");
        }

    }
}
