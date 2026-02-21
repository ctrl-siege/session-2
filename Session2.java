import java.util.Scanner;

public class Session2 {

  public static void main(String[] args) {
    multipleArrays();
  }
  
  public static void dataTypes() {
  	int age = 20;
    double price = 9.99;
    char grade = 'A';
    boolean passed = true;
    String name = "John";

    System.out.println("Age: " + age);
    System.out.println("Price: " + price);
    System.out.println("Grade: " + grade);
    System.out.println("Passed: " + passed);
    System.out.println("Name: " + name);
  }
  
  public static void operators() {

    int a = 10;
    int b = 3;

    System.out.println("Addition: " + (a + b));
    System.out.println("Subtraction: " + (a - b));
    System.out.println("Multiplication: " + (a * b));
    System.out.println("Division: " + (a / b));
    System.out.println("Modulus: " + (a % b));

    System.out.println("a > b: " + (a > b));
    System.out.println("a == b: " + (a == b));

    System.out.println("a > 5 && b < 5: " + (a > 5 && b < 5));
    
   }
    
   public static void inputs(){
   
   	Scanner input = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = input.nextLine();

    System.out.print("Enter your age: ");
    int age = input.nextInt();

    System.out.println("Hello " + name + ", you are " + age + " years old.");
    input.close();
    
   }
   
   public static void conditional(){
   
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your age: ");
    int age = input.nextInt();

    if (age >= 18) {
      System.out.println("You are an adult.");
    } else {
      System.out.println("You are a minor.");
    }

      input.close();
   }
   
   public static void switchMetod(){
   
    Scanner input = new Scanner(System.in);

    System.out.print("Countdown from: ");
    int count = input.nextInt();

    switch (count){
        case 5:
            System.out.println("5");
        case 4:
            System.out.println("4");
        case 3:
            System.out.println("3");
        case 2:
            System.out.println("2");
        case 1:
            System.out.println("1");
            break;
        default:
            System.out.println("Number out of bound.");
        
    }

      input.close();
   }
   
   public static void iterations() {

    for (int i = 1; i <= 5; i++) {
        System.out.println("Number: " + i);
    }
        
    int i = 1;

    while (i <= 5) {
        System.out.println("Number: " + i);
        i++;
        
    }
    
    do {
        System.out.println("Number: " + i);
        i++;
    } while (i<=5);

   }
   
   public static void arrays() {
    int[] numbers = {10, 20, 30, 40, 50};

    System.out.println("First element: " + numbers[0]);

    for (int i = 0; i < numbers.length; i++) {
        System.out.println("Element: " + numbers[i]);
    }
    
   }
   
   public static void multipleArrays() {
    int[][] numbers = {{1, 2, 3, 4, 5},{6, 7, 8, 9, 10}};
    
    int row;
    int col;
    
    System.out.println("The numbers are place in a 2 dimensional array, with rows and columns, if the numbers are arrange in ascending order (starting from 1) and there are 5 columns each row, then what is the position of the number '6'");
    Scanner input = new Scanner(System.in);
    System.out.print("[row]: ");
    row = input.nextInt();
    System.out.print("[column]: ");
    col = input.nextInt();
    
    System.out.println(numbers[row][col]);
    
    
   }
}
