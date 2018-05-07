package GuessNumberGame;

import java.util.Scanner;

public class Main{
  private static HumanBeing humanBeing = new HumanBeing();
  private static Computer computer = new Computer();


  public static void main( String[] args ){
    System.out.println();
    System.out.println("*******************************");
    System.out.println();
    System.out.println("Welcome to Guess Number Game!!!");
    System.out.println();
    System.out.println("*******************************");
    System.out.println();
    String response = "";
    while (!(response.equals("end"))) {
      System.out.println("Type 'me', if you want to guess a number. Otherwise, I will guess a number...");
      System.out.print("Type 'end', if you want finish the game:");
      Scanner input = new Scanner(System.in);
      response = input.nextLine();
      if (response.equals("me")) {
        humanBeing.guess();
      }
      if ((!(response.equals("me")))&&(!(response.equals("end")))){
        computer.guess();
      }

    }
    System.out.println();
    System.out.println("bye");

  }
}
