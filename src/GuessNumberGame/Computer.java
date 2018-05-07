package GuessNumberGame;

import java.util.Scanner;


public class Computer{


  public int guess(){
    String response = "";
    Scanner input;
    AskNumber askNumber = new AskNumber();
    int numberChooseForMe = 0;
    // Ask the number for the computer to guess
    System.out.println();
    System.out.println("Well, now you must choose a number from 1 to 100, so I guess. ");
    System.out.println("Take it easy!! I promise you that I will see nothing..");
    System.out.println("One more thing, tell me '+' if your number is bigger, '-' if it is smaller and '=' if it is equal.");
    System.out.print("Come on, Let it go... choose a number, and remember, from 1 to 100: ");
    do {
        numberChooseForMe = askNumber.askNumber();
        if (numberChooseForMe == 0) {
          System.out.print("Invalid Input, Only numbers from 1 to 100: ");
        }
      } while (!((numberChooseForMe > 0)&&(numberChooseForMe<=100)));

    
    //two variables used as indixes
    int begin = 0;
    int end = 100;


    do {
      System.out.println();
      int numberChooseForMachine = tryNumber(begin, end);
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
      System.out.println();
    }




    return 0;
  }

  // It's like a dichotomic search
  public int tryNumber(int begin, int end){
    //number has the quantity of elements
    int number = end - begin;
    //"number" cuts the virtual matrix in two and then adds the "begin"
    number = (number/2)+begin;

    return number;
  }
}
