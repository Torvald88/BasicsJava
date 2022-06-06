import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Type your age:");

        int age = Integer.parseInt(reader.nextLine());

        while (age < 10 || age > 80){
            if (age < 10){
                System.out.println("För ung!");
            } else if (age > 80){
                System.out.println("För gammal!");
            }
            System.out.println("Skriv din ålder igen");
            age = Integer.parseInt(reader.nextLine());
        }
        System.out.println("Din ålder är " +age);



/*        Scanner reader=new Scanner(System.in);
        System.out.println("Hello. Please write your name");
        String name = reader.nextLine();
        System.out.println("Your name is " +name);

        System.out.println("What's your age?");
        int age = Integer.parseInt(reader.nextLine());
        System.out.println("So, your name is " +name +" and your age is " +age +" years old");*/
    }
}