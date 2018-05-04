import java.util.Scanner;


public class Computer{
  private int begin = 0;
  private int end = 100;


  public int guess(){
    String response = "";
    Scanner input;
    System.out.println();
    System.out.println("Well, now you must choose a number from 1 to 100, so I guess. ");
    System.out.println("Take it easy!! I promise you that I will see nothing..");
    System.out.print("Come on, Let it go... choose a number, and remember, from 1 to 100: ");
    input = new Scanner(System.in);
    int numberChooseForMe = input.nextInt();

    do {
      System.out.println();
      int numberChooseForMachine = tryNumber();
      System.out.print("Is it your number "+numberChooseForMachine+"?");
      input = new Scanner(System.in);
      response = input.nextLine();
      if (response.equals("+")) {
        begin = numberChooseForMachine;
      }
      if (response.equals("-")) {
        end = numberChooseForMachine;
      }
    } while (!(response.equals("=")));

    if (response.equals("=")) {
      System.out.println();
      System.out.println("I Win!!!!");
      begin = 0;
      end = 100;
      System.out.println();
    }




    return 0;
  }

  private int tryNumber(){
    int number = end - begin;
    number = (number/2)+begin;

    return number;
  }
}
