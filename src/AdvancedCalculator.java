import java.util.Scanner;

public class AdvancedCalculator {

    static void add() {
        Scanner sc = new Scanner(System.in);
        int result = 0, i = 1, num;
        System.out.println("--- Addition Operation ---");
        System.out.println(" ! Add '0' for Answer !");
        do {
            System.out.print("Number " + i++ + ": ");
            num = sc.nextInt();
            result += num;
        } while (num != 0);
        System.out.println("Answer = " + result);
    }

    static void sub() {
        Scanner sc = new Scanner(System.in);
        int result = 0, i = 1, num;
        System.out.println("--- Subtraction Operation ---");
        System.out.println(" ! Subtract '0' for Answer !");
        do {
            System.out.print("Number " + i++ + ": ");
            num = sc.nextInt();
            result -= num;
        } while (num != 0);
        System.out.println("Answer = " + result);
    }

    static void multi() {
        Scanner sc = new Scanner(System.in);
        int result = 1, i = 1, num;
        System.out.println("--- Multiplication Operation ---");
        System.out.println(" ! Multiply '1' for Answer !");
        do {
            System.out.print("Number " + i++ + ": ");
            num = sc.nextInt();
            result *= num;
        } while (num != 1);
        System.out.println("Answer = " + result);
    }

    static void div() {
        System.out.println("--- Division Operation ---");
        Scanner inp = new Scanner(System.in);
        System.out.print("Number 1: ");
        double n1 = inp.nextInt();
        System.out.print("Number 2: ");
        int n2 = inp.nextInt();
        if (n2 == 0) {
            System.out.print("Number 2 can't be '0'");
            return;
        }
        double result = n1 / n2;
        System.out.println("Answer = " + result);
    }

    static void exp() {
        System.out.println("--- Exponential Operation ---");
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int num = scan.nextInt();
        System.out.print("Exponent: ");
        int exponential = scan.nextInt();

        int result = 1;
        for (int i = 1; i <= exponential; i++) {
            result *= num;
        }
        System.out.println("Answer = " + result);
    }

    static void fact() {
        System.out.println("--- Factorial Operation --- ");
        Scanner inp = new Scanner(System.in);
        System.out.print("Number: ");
        int n = inp.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        System.out.println("Answer = " + result);

    }

    static void mod() {
        System.out.println("--- Modulo Operation ---");
        Scanner sc = new Scanner(System.in);
        System.out.print("Number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Number 2: ");
        int n2 = sc.nextInt();

        int result = (n1 % n2);
        System.out.println("Answer = " + result);
    }

    static void areaAndPerimeter() {
        System.out.println("--- Area and Perimeter Operation for Rectangle");
        Scanner scan = new Scanner(System.in);
        System.out.print("Shorter side: ");
        int s = scan.nextInt();
        System.out.print("Longer side: ");
        int l = scan.nextInt();
        int area = (s * l);
        int perimeter = 2 * (s + l);
        System.out.println("Area: " + area + "\nPerimeter: " + perimeter);
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        String menu = """
                1-Addition
                2-Subtraction
                3-Multiplication
                4-Division
                5-Exponent
                6-Factorial
                7-Modulo
                8-Area and Perimeter of Rectangle
                0-Exit
                """;
        System.out.print(menu);
        int select;
        do {
            System.out.print("Select: ");
            select = inp.nextInt();
            switch (select) {
                case 1:
                    add();
                    break;
                case 2:
                    sub();
                    break;
                case 3:
                    multi();
                    break;
                case 4:
                    div();
                    break;
                case 5:
                    exp();
                    break;
                case 6:
                    fact();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    areaAndPerimeter();
                    break;
                case 0:
                    break;
                default:
                    System.out.print("Incorrect Entry ! Please try again. ");
            }
        } while (select != 0);
    }
}
