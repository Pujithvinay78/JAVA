import java.util.*;

class Calculator {
    int x, y;
    double divisionResult;

    Calculator(Scanner input) {
        System.out.print("Enter first number: ");
        x = input.nextInt();
        System.out.print("Enter second number: ");
        y = input.nextInt();
        divisionResult = (double) x / y;
    }

    void showResults() {
        System.out.println("Sum: " + (x + y));
        System.out.println("Logical OR: " + (x > 0 || y > 0));
    }
}

class Student {
    String studentName;
    int rollNo;

    Student(Scanner input) {
        System.out.print("Enter Student Name: ");
        studentName = input.next();
        System.out.print("Enter Roll Number: ");
        rollNo = input.nextInt();
    }

    void displayInfo() {
        System.out.println("Student Name: " + studentName + ", Roll No: " + rollNo);
    }
}

class ArrayStringOperations {
    void processArrayAndString(Scanner input) {
        System.out.print("Enter the number of elements: ");
        int num = input.nextInt();
        int[] numbers = new int[num];

        System.out.println("Enter " + num + " numbers:");
        for (int i = 0; i < num; i++) {
            numbers[i] = input.nextInt();
        }

        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        System.out.print("Enter a word: ");
        String word = input.next();
        System.out.println("Uppercase: " + word.toUpperCase());
    }
}

class Bird {
    void fly() {
        System.out.println("Birds can fly");
    }
}

class Sparrow extends Bird {
    void fly() {
        System.out.println("Sparrow flies low");
    }
}

interface Appliance {
    void turnOn();
}

class Fan implements Appliance {
    public void turnOn() {
        System.out.println("Fan starts spinning");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Calculator calc = new Calculator(input);
        calc.showResults();

        Student student = new Student(input);
        student.displayInfo();

        ArrayStringOperations operations = new ArrayStringOperations();
        operations.processArrayAndString(input);

        Bird myBird = new Sparrow();
        myBird.fly();

        Appliance myFan = new Fan();
        myFan.turnOn();

        input.close();
    }
}