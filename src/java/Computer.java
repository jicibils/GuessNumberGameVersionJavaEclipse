import java.util.Scanner;


public class Computer{
  //two variables used as indixes
  private int begin = 0;
  private int end = 100;


  public int guess(){
    String response = "";
    Scanner input;
    // Ask the number for the computer to guess
    System.out.println();
    System.out.println("Well, now you must choose a number from 1 to 100, so I guess. ");
    System.out.println("Take it easy!! I promise you that I will see nothing..");
    System.out.print("Come on, Let it go... choose a number, and remember, from 1 to 100: ");
    input = new Scanner(System.in);
    int numberChooseForMe = input.nextInt();

    do {
      System.out.println();
      int numberChooseForMachine = tryNumber();
      //the computer asks if it guess the number
      System.out.print("Is it your number "+numberChooseForMachine+"?");
      input = new Scanner(System.in);
      response = input.nextLine();
      if (response.equals("+")) {
        //if the answer is bigger(+), begin is moved
        begin = numberChooseForMachine;
      }
      if (response.equals("-")) {
        //if the answer is smaller(-), end is moved
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

  // It's like a dichotomic search
  private int tryNumber(){
    //number has the quantity of elements
    int number = end - begin;
    //"number" cuts the virtual matrix in two and then adds the "begin"
    number = (number/2)+begin;

    return number;
  }
}
