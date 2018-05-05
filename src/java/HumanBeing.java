import java.util.Scanner;

public class HumanBeing{


  public int guess(){
    int numberRandom;
    int response = 0;
    System.out.println();
    //a random number is generated
    numberRandom = (int) (Math.random() * 100) + 1;

    do {
      response = askNumber();
      if (numberRandom > response  ) {
        System.out.println();
        System.out.println("My number is bigger..");

      }
      if (numberRandom < response ) {
        System.out.println();
        System.out.println("My number is smaller..");

      }
    } while (response != numberRandom);

    if (response == numberRandom) {
      System.out.println();
      System.out.println("You Win!!!!");
      System.out.println();
    }




    return 0;
  }

  private int askNumber(){
    int response = 0;
    try {
      do {
        System.out.println();
        System.out.print("Choose a number from 1 to 100: ");
        Scanner input = new Scanner(System.in);
        response = input.nextInt();
        if (!((response > 0)&&(response<=100))) {
          System.out.print("Invalid Input");
          //return a error code for testing
        }
      } while (!((response > 0)&&(response<=100)));
    }catch (Exception e) {
      System.out.print("Invalid Input, Only numbers from 1 to 100");
      //return a error code for testing
      askNumber();
    }
    return response;
  }
}
