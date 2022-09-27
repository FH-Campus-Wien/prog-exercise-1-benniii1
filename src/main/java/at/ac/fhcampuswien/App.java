package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld() {
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot() {
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals() {
        int sum = 0;

        char c = 'Z';
        int hex = 0xface;
        int octal = 012;
        long l = 80L;
        float f1 = 44e-1f;
        float f2 = 5.5f;
        double d1 = 8.88e1;
        double d2 = 99.9;

        sum += c;
        sum += hex;
        sum += octal;
        sum += l;
        sum += f1;
        sum += f2;
        sum += d1;
        sum += d2;

        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers() {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        sum += scanner.nextInt();
        sum += scanner.nextInt();

        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x = scanner.nextInt();

        System.out.print("y: ");
        int y = scanner.nextInt();

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n1: ");
        int n1 = scanner.nextInt();

        System.out.print("n2: ");
        int n2 = scanner.nextInt();

        if (n1 < n2) {
            System.out.println("n2 > n1");
        } else if (n1 > n2) {
            System.out.println("n1 > n2");
        } else if (n1 == n2) {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter annual Revenue: ");

        int revenue = scanner.nextInt();

        if (revenue < 0 || revenue >= 100_000) {
            System.out.println("Invalid Revenue");
            return;
        }

        if (revenue < 20_000) {
            System.out.println("Poor Sales Revenue");
            return;
        }

        if (revenue < 50_000) {
            System.out.println("Average Sales Revenue");
            return;
        }

        if (revenue < 80_000) {
            System.out.println("Good Sales Revenue");
            return;
        }

        System.out.println("Excellent Sales Revenue");
    }

    //todo Task 8
    public void getCommissionRate() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter CommissionClass: ");

        int commissionClass = scanner.nextInt();

        switch (commissionClass){
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
                break;
        }
    }

    //todo Task 9
    public void leapyear() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Year: ");

        int year = scanner.nextInt();

        if (year % 4 != 0){
            System.out.println("Not a Leapyear");
            return;
        }

        if (year % 100 == 0 && year % 400 != 0){
            System.out.println("Not a Leapyear");
            return;
        }

        if (year % 400 == 0){
            System.out.println("Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers() {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number >= 1000 || number <= -1000){
            System.out.println("Please provide a number with 3 or less digits.");
            return;
        }

        int transposedNumber = 0;
        while (number > 0){
            transposedNumber = transposedNumber * 10;
            transposedNumber += number % 10;
            number = number / 10;
        }

        System.out.println("Number: " + transposedNumber);
    }


    public static void main(String[] args) {
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}