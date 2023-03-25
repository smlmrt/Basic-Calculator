import java.util.Scanner;

public class calculator{
    
    public static void main(String[] args) {
        int num1,num2;
        int result = 0;
        int sec = 0;

        System.out.println("Hesap makinesine hoş geldiniz");
        System.out.println("-----------------------------------");
        System.out.println("1.Addition  2.Subtraction   3.Division  4.Multiplication");
        System.out.println("-----------------------------------");

        Scanner choosen = new Scanner(System.in);
        System.out.printf("choosen: ");
        sec = choosen.nextInt();
        
        Scanner input = new Scanner(System.in);
        System.out.printf("x: ");
        num1 = input.nextInt();
        System.out.printf("y: ");
        num2 = input.nextInt();

        switch(sec){
            case 1:
                result = num1 + num2;
                System.out.printf("result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.printf("result: " + result);
                break;
            case 3:
                result = num1 / num2;
                System.out.printf("result: " + result);
                break;
            case 4:
                result = num1 * num2;
                System.out.printf("result: " + result);
                break;
            default:
                System.out.println("Invalid operation");
        }

    }
}