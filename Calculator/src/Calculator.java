
import java.util.Scanner;
public class Calculator {
    Scanner scanner = new Scanner(System.in);

    double addition =0;
    double subtraction;
    double multiplication =1;
    double division;
    char option;
    char character;

    public void display(){

        do {
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addNumbers();
                    break;

                case 2:
                    subNumbers();
                    break;

                case 3:
                    mulNumbers();
                    break;

                case 4:
                    divNumbers();
                    break;

                default:
                    System.out.println("Invalid choice. Try again!");
                    break;
            }
            System.out.print("Do you want to try again?(y/n): ");
            option = scanner.next().charAt(0);
            character = Character.toLowerCase(option);
        }while(character != 'n' && character != 'N');
        System.out.println("Thank you for using the Calculator. Come again!");
    }
    public void addNumbers(){
        System.out.print("How many numbers you are adding: ");
        int choose = scanner.nextInt();
        double[] add = new double[choose];
        System.out.println("Enter numbers: ");
        for (int i=0;i<add.length;i++){
            add[i] = scanner.nextDouble();
        }
        for(int i=0;i<add.length;i++){
            addition += add[i];
        }
        System.out.println("Sum of numbers: "+addition);
    }
    public void subNumbers(){
        System.out.print("How many numbers you are subtracting: ");
        int choose = scanner.nextInt();
        double[] sub = new double[choose];
        System.out.println("Enter numbers: ");
        for (int i=0;i<sub.length;i++){
            sub[i] = scanner.nextDouble();
        }
        subtraction = sub[0];
        for (int i=1;i<sub.length;i++){
            subtraction -= sub[i];
        }
        System.out.println("Total subtraction: "+subtraction);
    }
    public void mulNumbers(){
        System.out.print("How many numbers you are multiplying: ");
        int choose = scanner.nextInt();
        double[] mul = new double[choose];
        System.out.println("Enter numbers: ");
        for (int i=0;i < mul.length;i++){
            mul[i] = scanner.nextDouble();
        }

        for(int i=0;i<mul.length;i++){
            multiplication *= mul[i];
        }
        System.out.println("Multiplication numbers: "+multiplication);
    }
    public void divNumbers(){
        System.out.print("How many numbers you are dividing: ");
        int choose = scanner.nextInt();
        double[] div = new double[choose];
        System.out.println("Enter numbers: ");
        for (int i=0;i<div.length;i++){
            div[i] = scanner.nextDouble();
        }
        division = div[0];
        for(int i=1;i<div.length;i++){
            division /= div[i];
        }
        System.out.println("Total divided numbers: "+division);
    }
}
