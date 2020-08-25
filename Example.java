import java.util.Scanner;

class Example {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);  // create Scanner object
    
    System.out.print("4 times what? ");
    double mult = in.nextDouble();
    double prod = 4 * mult;
    System.out.println("4 * " + mult + " = " + prod);
    
    in.close();  // close the Scanner
  }
}

